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
public class Diagnostic extends Procedure{
    //Represents Diagnostic Procedure extending Procedure class
        public String specialist;
        //Stores name of specialist for Diagnostic Procedure
        public String diagnosticType;
        //Stores diagnostic type for Diagnostic Procedure

        public Diagnostic(String pID, int proID, String d, String t, String proType, String proDesc, String spe, String diagType) {
            //Constructor that initialize Diagnostic object
            super(pID, proID, d, t, proType, proDesc);
             //Call the paranet's class constructor(Procedure) to initialize inherited properties
            specialist = spe;
             //Set specialist name
            diagnosticType = diagType;
             //Set diagnostic type 
        }

        public String getSpecialist() {
            //Retrieves specialist name for Diagnostic Procedure
            return specialist;
        }

        public void setSpecialist(String spe) {
            //Sets specialist name for Diagnostic Procedure
            specialist = spe;
        }

        public String getDiagnosticType() {
            //Retrieves diagnostic type for Diagnostic Procedure
            return diagnosticType;
        }

        public void setDiagnosticType(String diagType) {
            //Sets diagnostic type for Diagnostic Procedure
            diagnosticType = diagType;
        }
}
