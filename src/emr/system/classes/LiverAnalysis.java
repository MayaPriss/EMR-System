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
public class LiverAnalysis extends Analysis{
    
   public double alt; 
   public double ast;
   public  double alp; 
   public double albumin; 
   public double prothombinTime; 
   public double totalProtein; 
    
    

public LiverAnalysis(String pId, String aD, double aLT, double aST, double aLP, double al, double ptTime, double tP){
    super(pId,aD); 
    double alt = aLT; 
    double ast = aST; 
    double alp = aLP; 
    double albumin = al; 
    double prothombinTime = ptTime; 
    double totalProtein = tP; 
}
    public double getAlt(){
        return alt; 
    }
    public void setAlt(double aLT){
        alt = aLT; 
    }
    public double getAst(){
        return ast; 
    }
    public void setAst(double aST){
        ast = aST; 
    }
    public double getAlp(){
        return alp; 
    }
    public void setAlp(double aLP){
        alp = aLP; 
    }
    public double getAlbumin(){
        return albumin; 
    }
    public void setAlbumin(double al){
        albumin = al; 
    }
    public double getProthombin(){
        return prothombinTime; 
    }
    public void setProthombinTime(double tP){
        prothombinTime = tP; 
    }
    public double getTotalProtein(){
        return totalProtein; 
    }
    public void setTotalProtein(double tP){
        totalProtein = tP; 
    }
    
}
