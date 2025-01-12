package emr.system.classes;

import emr.system.classes.PatientInfo;

public class EmergencyContact extends PatientInfo{
    public String emergencyContactName;
    public String relationshipToPatient;
    public int emergencyContactMobile;

    public EmergencyContact(String pn, String ICNo, int pID, String gd, String etn, String dob, String h, String w, String bg, String alg, String ms, int mp, int hp, String em, String addr, String ecn, String rtp, int ecMobile) {
        super(pn, ICNo, pID, gd, etn, dob, h, w, bg, alg, ms, mp, hp, em, addr);
        emergencyContactName = ecn;
        relationshipToPatient = rtp;
        emergencyContactMobile = ecMobile;
    }

    public String getEmergencyContactName() {
        return emergencyContactName;
    }

    public void setEmergencyContactName(String ecn) {
        emergencyContactName = ecn;
    }

    public String getRelationshipToPatient() {
        return relationshipToPatient;
    }

    public void setRelationshipToPatient(String rtp) {
        relationshipToPatient = rtp;
    }

    public int getEmergencyContactMobile() {
        return emergencyContactMobile;
    }

    public void setEmergencyContactMobile(int ecMobile) {
        emergencyContactMobile = ecMobile;
    }
}
