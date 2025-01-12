/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author Rayyan
 */
public class PatientDetails {
    public String patientId;
    
    
    public PatientDetails(String pId){
    
    String patientId = pId; 
    }
    
    public void setPatientId(String pId){
         patientId = pId; 
    }
    
    public String getPatientId(){
        return patientId; 
    }
    
    
}
