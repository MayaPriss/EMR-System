package emr.system.classes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author SARAVANAPRIYA
 */
public class Diagnosis {
    public String patientId;
    public String diagnosisDate;
    public String symptoms;
    public String diagnosisName;
    public String risk;
    
    public Diagnosis(String pID, String dDate, String s, String dName, String r) {
        patientId = pID;
        diagnosisDate = dDate;
        symptoms = s;
        diagnosisName = dName;
        risk = r;
    }
    
    public String getPatientID() {
        return patientId;
    }
    
    public void setPatientId(String pID) {
        patientId = pID;
    }
    
    public String getDiagnosisDate() {
        return diagnosisDate;
    }
    
    public void setDiagnosisDate(String dDate) {
        diagnosisDate = dDate;
    }
    
    public String getSymptoms() {
        return symptoms;
    }
    
    public void setSymptoms(String s) {
        symptoms = s;
    }
    
    public String getDiagnosisName() {
        return diagnosisName;
    }
    
    public void setDiagnosisName(String dName) {
        diagnosisName = dName;
    }
    
    public String getRisk() {
        return risk;
    }
    
    public void setRisk(String r) {
        diagnosisName = r;
    }
}
