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
public class Psychotherapy extends TreatmentCourse {
    public String psychologist;
    public String duration ;
    
public Psychotherapy (String tn,int pri, String std, String ed, String dic, int pi, String d, String tm,String psy, String du){
       super( tn, pri,std,ed, dic,pi, d,tm);
        psychologist = psy;
        duration = du;
    }
    
    public void setPsychologist(){
      
    }
    
    public String getPsychologist(){
        return psychologist;
    }
    
    public void setDuration(){
        
    }
    
    public String getDuration(){
        return duration;
    }
}