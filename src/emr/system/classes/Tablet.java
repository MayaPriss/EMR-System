/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

import emr.system.classes.Medicine;

/**
 *
 * @author SARAVANAPRIYA
 */
public class Tablet extends Medicine{
    //Represents Tablet Medicine extending Medicine class
        public String dosage;
        //Stores dosage for Tablet Medicine

        public Tablet(int medID, String medName, String medDesc, int a, String f, String p, String d) {
            //Constructor that initialize Tablet object
            super(medID, medName, medDesc, a, f, p);
            //Call the paranet's class constructor(Medicine) to initialize inherited properties
            dosage = d;
            //Set dosage
        }

        public String getDosage() {
            //Retrieves dosage for Tablet Medicine
            return dosage;
        }

        public void setDosage(String d) {
            //Sets dosage for Tablet Medicine
            dosage = d;
        }
    }

