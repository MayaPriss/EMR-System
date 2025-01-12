/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author abdul
 */
public class Disease extends MedicalForm {
    
        public String nameOfDisease;
    
        public Disease (int p, String d, String t,boolean b, int w,int a,String v,String r,String m,String u,String l,String o,String j,String s){
        super(p,d,t,b,w,a,v,r,m,u,l,o,j);
        nameOfDisease = s;
        }
         public String getNameOfDisease(){
            return nameOfDisease;
       }
        public void setNameOfDisease(String s){
            nameOfDisease = s;
}
}