/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.customComponents;
import emr.system.TreatmentCourseForm;

import javax.swing.JTable;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Rayyan
 */
public class CustomTable extends JTable{ 
    private customHeader columnName;
    private customRecords records;

    public CustomTable() {
        columnName = new customHeader();
        records = new customRecords();
        getTableHeader().setDefaultRenderer(columnName);
        getTableHeader().setPreferredSize(new Dimension(0, 35));
        setDefaultRenderer(Object.class, records);
        setRowHeight(30);
    }

//    public void fixTable(JScrollPane scrollBar) {
//        JPanel panelForScrollBar = new JPanel();
//        panelForScrollBar.setBackground(new Color(255, 255, 255));
//        scrollBar.setCorner(JScrollPane.UPPER_RIGHT_CORNER, panelForScrollBar);
//        scrollBar.getViewport().setBackground(new Color(0, 0, 0));
//        scrollBar.setBorder(BorderFactory.createLineBorder(new Color(60, 60, 60), 2));
//    }

    private class customHeader extends DefaultTableCellRenderer {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int i, int i1) {
            Component component1 = super.getTableCellRendererComponent(jtable, o, bln, bln1, i, i1);
            component1.setBackground(new Color(0, 0, 139));
            component1.setForeground(new Color(200, 200, 200));
            component1.setFont(component1.getFont().deriveFont(Font.BOLD, 12));
            if (alignment.containsKey(i1)) {
                setHorizontalAlignment(alignment.get(i1));
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            return component1;
        }
    }

    private class customRecords extends DefaultTableCellRenderer {

        private Map<Integer, Integer> alignment = new HashMap<>();

        public void setAlignment(int column, int align) {
            alignment.put(column, align);
        }

        @Override
        public Component getTableCellRendererComponent(JTable jtable, Object o, boolean bln, boolean bln1, int row, int column) {
            Component component2 = super.getTableCellRendererComponent(jtable, o, bln, bln1, row, column);
            if (isCellSelected(row, column)) {
                if (row % 2 == 0) {
                    component2.setBackground(new Color(0, 0, 139));
                } else {
                    component2.setBackground(new Color(0, 0, 139));
                }
            } else {
                if (row % 2 == 0) {
                    component2.setBackground(new Color(211, 221, 255));
                    component2.setForeground(new Color(0, 0, 139));

                } else {
                    component2.setBackground(new Color(0,0,139));
                    component2.setForeground(new Color(255, 254, 238));

                }
            }
//            component2.setForeground(new Color(255, 254, 238));
            setBorder(new EmptyBorder(0, 5, 0, 5));
            if (alignment.containsKey(column)) {
                setHorizontalAlignment(alignment.get(column));
            } else {
                setHorizontalAlignment(JLabel.LEFT);
            }
            return component2;
        }
    }
    
}
