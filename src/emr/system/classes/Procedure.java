/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author SARAVANAPRIYA
 */
public class Procedure {
    public String patientId;
    public int procedureId;
    public String date;
    public String time;
    public String procedureType;
    public String procedureDescription;
    //Stores data of the medicine

    public Procedure(String pID, int proID, String d, String t, String proType, String proDesc) {
    //Constructour that initialize the Procdure object
        patientId = pID;
        procedureId = proID;
        date = d;
        time = t;
        procedureType = proType;
        procedureDescription = proDesc;
    }

    public String getPatientId() {
        //Retrieves patient ID of Procedure
        return patientId;
    }

    public void setPatientId(String pID) {
        //Sets patient ID of Procedure
        patientId = pID;
    }

    public int getProcedureId() {
        //Retrieves procedure ID of Procedure
        return procedureId;
    }

    public void setProcedureId(int proID) {
        //Sets procedure ID of Procedure
        procedureId = proID;
    }

    public String getDate() {
        //Retrieves date of Procedure
        return date;
    }

    public void setDate(String d) {
        //Sets date of Procedure
        date = d;
    }

    public String getTime() {
        //Retrieves time of Procedure
        return time;
    }

    public void setTime(String t) {
        //Sets time of Procedure
        time = t;
    }

    public String getProcedureType() {
        //Retrieves procedure type of Procedure
        return procedureType;
    }

    public void setProcedureType(String proType) {
        //Sets procedure type of Procedure
        procedureType = proType;
    }

    public String getProcedureDescription() {
        //Retrieves procedure description of Procedure
        return procedureDescription;
    }

    public void setProcedureDescription(String proDesc) {
        //Sets procedure description of Procedure
        procedureDescription = proDesc;
    }
    
}
