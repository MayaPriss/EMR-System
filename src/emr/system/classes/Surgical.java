/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

import emr.system.classes.Procedure;

/**
 *
 * @author SARAVANAPRIYA
 */
public class Surgical extends Procedure {
    //Represents Surgical Procedure extending Procedure class
     public String surgeon;
     //Stores name of surgeon for Surgical Procedure

        public Surgical(String pID, int proID, String d, String t, String proType, String proDesc, String s) {
            //Constructor that initialize Surgical object
            super(pID, proID, d, t, proType, proDesc);
            //Call the paranet's class constructor(Procedure) to initialize inherited properties
            surgeon = s;
            //Set surgeon name
        }

        public String getSurgeon() {
            //Retrieves surgeon name for Surgical Procedure
            return surgeon;
        }

        public void setSurgeon(String s) {
            //Sets surgeon name for Surgical Procedure
            surgeon = s;
        }
}

