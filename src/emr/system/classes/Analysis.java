/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author Rayyan
 */
public class Analysis {
    
   public String patientId; 
   public String analysisDate; 
    
    Analysis(String pId, String aD){
    
    patientId = pId; 
    analysisDate = aD; 
    
    
    }
    
    public String getPatientId(){
        return patientId; 
    }
     public String getAnalysisDate(){
        return analysisDate; 
    }
    public void setPatientId(String pId){
        patientId = pId; 
    }
    public void setAnalysisDate(String aD){
        patientId = aD; 
    }
    
}


