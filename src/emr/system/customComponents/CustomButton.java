
package emr.system.customComponents;




import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;

public class CustomButton extends JButton {
    private boolean done;
    private Color color;
    private Color colorOver;
    private Color colorClick;
    private Color outlineColor;
    private int radius = 0;

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        setBackground(color);
    }


    public void setColorOver(Color colorOver) {
        this.colorOver = colorOver;
    }



    public Color getOutlineColor() {
        return outlineColor;
    }

    public void setOutlineColor(Color outlineColor) {
        this.outlineColor = outlineColor;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    private Color colorAfterHovering; 
    
    public CustomButton() {

        setColor(Color.WHITE);
        outlineColor = new Color(30, 136, 56);
        colorAfterHovering = new Color(255, 254, 238); 
        setContentAreaFilled(false);

        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setBackground(colorOver);
                done = true;
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setBackground(colorAfterHovering);
                done = false;

            }
         
        });
        
    }

   

    @Override
    protected void paintComponent(Graphics grphcs) {
        Graphics2D g = (Graphics2D) grphcs;
        g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g.setColor(outlineColor);
        g.fillRoundRect(0, 0, getWidth(), getHeight(), radius, radius);
        g.setColor(getBackground());
        g.fillRoundRect(2, 2, getWidth() - 4, getHeight() - 4, radius, radius);
        super.paintComponent(grphcs);
    }
}