/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author Rayyan
 */
public class TreatmentCourse  {
public String taskName;
public int procedureID;
public String startDate;
public String endDate;
public String medicationHstory;
public String docotrInCharge;
public int patientID;
public String description;
public String tMedicine;

TreatmentCourse(String tn,int pri, String std, String ed, String dic, int pi, String d, String tm){
    
    patientID = pi;
    taskName = tn;
    description = d;
    tMedicine = tm;
    startDate = std;
    endDate = ed;
    procedureID = pri;
    docotrInCharge = dic;

}

public void setTaskName(){
}

public String getTaskName(){
    return taskName;
}

public void setProcedureID(){
   
}
public int getProcedureID(){
    return procedureID;
}

public void setStartDate(){
  
}

public String getStartDate(){
    return startDate;
}

public void setEndDate(){
   
}

public String getEndDate (){
    return endDate;
}

public void setDocotrInCharge(){
  
}

public String getDoctorInCharge(){
    return docotrInCharge;
}

public void setPatientID(){
    
}

public int getPatientID(){
    return patientID;
}

public void setDesciption(){
   
}

public String getDescription(){
    return description;
}

public void TMedicine(){
    
}

public String getTMedicine(){
    return tMedicine;
}
}