/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emr.system.classes;

import emr.system.classes.Analysis;

/**
 *
 * @author Rayyan
 */
public class BloodAnalysis extends Analysis {
    public String bloodType; 
    public int wbcCount; 
    public int rbcCount; 
    public int cbcCount; 
    public int platletCount;
    public String iron; 
    public int haemoglobin; 
    
   public BloodAnalysis(String pId, String aD, String bloodT, int wbcC, int rbcC, int cbcC, int platletC, String fe, int hmg){
    super(pId, aD); 
    bloodType = bloodT; 
    wbcCount = wbcC; 
    rbcCount = rbcC; 
    cbcCount = cbcC; 
    platletCount = platletC; 
    iron = fe; 
    haemoglobin = hmg; 

   } 
    
    public String getBloodType(){
    return bloodType;    
    }
    public void setBloodType(String bloodT){
    bloodType = bloodT; 
    }
    public String getIron(){
    return iron;    
    }
    public void setIron(String fe){
    iron = fe; 
    }
    public int getWbcCount(){
    return wbcCount;    
    }
    public void setWbcCount(int wbcC){
    wbcCount = wbcC; 
    }
    public int getRbcCount(){
    return rbcCount;    
    }
    public void setRbcCount(int rbcC){
    rbcCount = rbcC; 
    }
    public int getCbcCount(){
    return cbcCount;    
    }
    public void setCbcCount(int cbcC){
    cbcCount = cbcC; 
    }
    public int getPlatletCount(){
    return platletCount;    
    }
    public void setPlatletCount(int platletC){
    platletCount = platletC; 
    }
    public int getHaemoglobin(){
    return haemoglobin;    
    }
    public void setHaemoglobin(int hmg){
    haemoglobin = hmg; 
    }
    
    
    
    
    
    
    
}
