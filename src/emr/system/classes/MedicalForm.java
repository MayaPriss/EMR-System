/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

/**
 *
 * @author abdul
 */
public class MedicalForm {  
       public int patientID;
       public String date;
       public String time;
       public boolean warded;
       public int wardNumber;
       public int days;
       public String provider;
       public String results;
       public String medicineName;
       public String duration;
       public String problem;
       public String outcome;
       public String majorComplication;

      public MedicalForm (int p, String d, String t,boolean b, int w,int a,String v,String r,String m,String u,String l,String o,String j){
           patientID = p;
           date = d;
           time = t;
           warded = b;
           wardNumber = w;
           days = a;
           provider = v;
           results = r;
           medicineName = m;
           duration = u;
           problem = l;
           outcome = o;
           majorComplication = j;
           
           
       }

    MedicalForm(String value1, String value2, String value3, String value4, String value5, String value6, String value7, String value8, String value9, String value10, String value11, String value12, String value13) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        public int getPatientID(){
           return patientID;
       }
        public void setPatientID(int p){
            patientID = p;
       }
        public String getDate(){
           return date;
       }
        public void setDate(String d){
           date = d;
       }
        public String getTime(){
            return time;
       }
        public void setTime(String t){
           time = t;
       }
         public boolean getWarded(){
       return warded;
    }
       public void setWarded(){
           warded = false;
       }
       public int getWardNumber(){
           return wardNumber;
       }
       public void setwardNumber(int w){
           wardNumber = w;
       }
       public int getDays(){
            return days;
       }
       public void getDays(int a){
           days = a;
       }
       public String getProvider(){
            return provider;
       }
       public void setProvider(String v){
           provider = v;
       }
       public String getResults(){
            return results;
       }
       public void setResults(String r){
           results = r;
       }    
       public String getMedicineName(){
            return medicineName;
       }
       public void setMedicineName(String m){
           medicineName = m;
       }    
           public String getDuration(){
            return duration;
       }
       public void setDuration(String u){
           duration = u;
       }    
           public String getProblem(){
            return problem;
       }
       public void setProblem(String l){
           problem = l;
       }    
           public String getOutcome(){
            return outcome;
       }
       public void setOutcome(String o){
           outcome = o;
       }    
           public String getMajorComplication(){
            return majorComplication;
       }
       public void setMajorComplication(String m){
           majorComplication = m;
       }   
      
}
