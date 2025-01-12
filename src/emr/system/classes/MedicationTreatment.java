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
public class MedicationTreatment extends TreatmentCourse {
    public String dosageTaken;
    public String pharmacist;
    public String frequency;


 public MedicationTreatment(String tn,int pri, String std, String ed, String dic, int pi, String d, String tm,String dt, String p,String f){
   super( tn, pri,std,ed, dic,pi, d,tm);
dosageTaken = dt;
pharmacist = p;
frequency = f;

}

public void setDosageTaken(){
  
}

public String getdosageTaken(){
    return dosageTaken;
}

public void setPharmacist(){
   
}

public String getpharmacist(){
    return pharmacist;
}

public void setfrequency(){
   
}

public  String getfrequency(){
  return frequency;
}

}