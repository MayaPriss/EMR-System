package emr.system.classes;

public class PatientInfo {
    public String patientName;
    public int patientID;
    public String IC_passportNo;
    public String gender;
    public String ethnicity;
    public String DoB;
    public String height;
    public String weight;
    public String bloodGroup;
    public String allergy;
    public String marritalStatus;
    public int mobilePhone;
    public int homePhone;
    public String email;
    public String address;

    public PatientInfo(String pn, String ICNo, int pID, String gd, String etn, String dob, String h, String w, String bg, String alg, String ms, int mp, int hp, String em, String addr) {
        patientName = pn;
        patientID = pID;
        IC_passportNo = ICNo;
        gender = gd;
        ethnicity = etn;
        DoB = dob;
        height = h;
        weight = w;
        bloodGroup = bg;
        allergy = alg;
        marritalStatus = ms;
        mobilePhone = mp;
        homePhone = hp;
        email = em;
        address = addr;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String pn) {
        patientName = pn;
    }

    public int getPatientID() {
        return patientID;
    }

    public void setPatientID(int pID) {
        patientID = pID;
    }

    public String getIC_passportNo() {
        return IC_passportNo;
    }

    public void setIC_passportNo(String ICNo) {
        IC_passportNo = ICNo;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gd) {
        gender = gd;
    }

    public String getEthnicity() {
        return ethnicity;
    }

    public void setEthnicity(String etn) {
        ethnicity = etn;
    }

    public String getDoB() {
        return DoB;
    }

    public void setDoB(String dob) {
        DoB = dob;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String h) {
        height = h;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String w) {
        weight = w;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bg) {
        bloodGroup = bg;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String alg) {
        allergy = alg;
    }

    public String getMarritalStatus() {
        return marritalStatus;
    }

    public void setMarritalStatus(String ms) {
        marritalStatus = ms;
    }

    public int getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(int mp) {
        mobilePhone = mp;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int hp) {
        homePhone = hp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        email = mail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String addr) {
        address = addr;
    }
}
