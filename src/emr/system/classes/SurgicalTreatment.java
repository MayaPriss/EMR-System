/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

import emr.system.classes.TreatmentCourse;

/**
 *
 * @author Rayyan
 */
public class SurgicalTreatment extends TreatmentCourse {
    public String surgeryDate;
    public String surgeryType;
    public String surgerySuit;
    public String anaesthesia;
    public String preOperativePrepaeration;
    public String chiefSurgeon;
    public String risk;
    public String durationOfHospitalization;
    
public SurgicalTreatment(String tn,int pri, String std, String ed, String dic, int pi, String d, String tm,String sd,String st, String ss, String a,String pop, String cs, String r, String doh){
    super( tn, pri,std,ed, dic,pi, d,tm);
    surgeryDate = sd;
    surgeryType = st;
    surgerySuit = ss;
    anaesthesia = a;
    preOperativePrepaeration = pop;
    chiefSurgeon = cs;
    risk = r;       
    durationOfHospitalization = doh;       
}
    public void setSurgeryDate(){
        
    }
    public String getSurgeryDate(){
        return surgeryDate ;
    }
        public void setSurgeryType(){
       
    }
    public String getSurgeryType(){
        return surgeryType ;
    }
        public void setSurgerySuit(){
        
    }
    public String getSurgerySuit(){
        return surgerySuit ;
    }
        public void setAnaesthesia(){
        
    }
    public String getAnaesthesia(){
        return  anaesthesia ;
    }
    public void setPreOperativePrepaeration(){
       
    }
    public String getPreOperativePrepaeration(){
        return  preOperativePrepaeration ;
    }
     public void setChiefSurgeon(){
       
    }
    public String getChiefSurgeon(){
        return  chiefSurgeon ;
    }
     public void setRisk(){
       
    }
    public String getRisk(){
        return  risk ;
    }
     public void setDurationOfHospitalization(){
      
    }
    public String getDurationOfHospitalization(){
        return durationOfHospitalization;
    }

}