/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author abdul
 */
public class Allergy extends MedicalForm {
    
    public boolean status;
    public String nameOfAllergies;
    public String reaction;
    
    public Allergy (int p, String d, String t,boolean b, int w,int a,String v,String r,String m,String u,String l,String o,String j,boolean k,String n,String c){
    super(p,d,t,b,w,a,v,r,m,u,l,o,j);
     status = k;
     nameOfAllergies = n;
     reaction = c;  
     
}
       public boolean getStatus(){
       return status;
    }
       public void setStatus(){
           status = false;
       }
     public String getNameOfAllergies(){
           return nameOfAllergies;
       }
        public void setNameOfAllergies(String n){
            nameOfAllergies = n;
}
    public String getReaction(){
           return reaction;
       }
        public void setReaction(String c){
            reaction = c;     
}
}