/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author SARAVANAPRIYA
 */
public class Medicine {
    public int medicineId;
    public String medicineName;
    public String medicineDescription;
    public int amount;
    public String frequency;
    public String provider;
    //Stores data of the medicine

    public Medicine(int medID, String medName, String medDesc, int a, String f, String p) {
        //Constructour that initialize the Medicine object
        medicineId = medID;
        medicineName = medName;
        medicineDescription = medDesc;
        amount = a;
        frequency = f;
        provider = p;
    }

    public int getMedicineId() {
        //Retrieves patient ID of Medicine
        return medicineId;
    }

    public void setMedicineId(int medID) {
        //Sets patient ID of Medicine
        medicineId = medID;
    }

    public String getMedicineName() {
        //Retrieves medicine ID of Medicine
        return medicineName;
    }

    public void setMedicineName(String medName) {
        //Sets medicine ID of Medicine
        medicineName = medName;
    }

    public String getMedicineDescription() {
        //Retrieves medicine description of Medicine
        return medicineDescription;
    }

    public void setMedicineDescription(String medDesc) {
        //Sets medicine description of Medicine
        medicineDescription = medDesc;
    }

    public int getAmount() {
        //Retrieves amount of Medicine
        return amount;
    }

    public void setAmount(int a) {
        //Sets amount of Medicine
        amount = a;
    }

    public String getFrequency() {
        //Retrieves frequency of Medicine
        return frequency;
    }

    public void setFrequency(String f) {
        //Sets frequency of Medicine
        frequency = f;
    }

    public String getProvider() {
        //Retrieves provider of Medicine
        return provider;
    }

    public void setProvider(String p) {
        //Sets provider of Medicine
        provider = p;
    }

}
    
