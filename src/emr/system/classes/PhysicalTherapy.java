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
public class PhysicalTherapy extends TreatmentCourse{
    public String therapist;
    public String equipment;
    public String educationForSelfManagement;
     
    public PhysicalTherapy(String tn,int pri, String std, String ed, String dic, int pi, String d, String tm,String t,String e, String edfsm){
         super( tn, pri,std,ed, dic,pi, d,tm);
         therapist = t;
         equipment = e;
         educationForSelfManagement = edfsm ;
     }
     
public void setTherapist(){
}

public  String getTherapist(){
    return therapist;
}

public void setEquipemnt (){
   
}

public String getEquipment (){
    return equipment;
}

public void setEducationForSelfManagement(){
   
}

public String getEducationForSelfManagement(){
   return educationForSelfManagement;
}
}
