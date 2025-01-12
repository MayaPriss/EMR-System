/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author abdul
 */
public class Vaccine extends MedicalForm {
    
 public boolean vaccinated;
 public String nameOfVaccine;
 
     public Vaccine (int p, String d, String t,boolean b, int w,int a,String v,String r,String m,String u,String l,String o,String j,boolean i,String f){
     super(p,d,t,b,w,a,v,r,m,u,l,o,j);
     vaccinated = i;
     nameOfVaccine = f;

}
       public boolean getVaccinated(){
       return vaccinated;
    }
       public void setVaccinated(){
           vaccinated = false;
       }
        public String getNameOfVaccine(){
           return nameOfVaccine;
       }
        public void setNameOfVaccine(String f){
            nameOfVaccine = f;
        }
}