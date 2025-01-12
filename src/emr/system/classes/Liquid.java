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
public class Liquid extends Medicine {
    //Represents Liquid Medicine extending Medicine class
        public String volume;
        //Stores volume for Liquid Medicine

        public Liquid(int medID, String medName, String medDesc, int a, String f, String p, String v) {
             //Constructor that initialize Liquid object
            super(medID, medName, medDesc, a, f, p);
             //Call the paranet's class constructor(Medicine) to initialize inherited properties
            volume = v;
            //Set volume
        }

        public String getVolume() {
            //Retrieves volume for Liquid Medicine
            return volume;
        }

        public void setVolume(String v) {
            //Sets volume for Liquid Medicine
            volume = v;
        }
    }
    
