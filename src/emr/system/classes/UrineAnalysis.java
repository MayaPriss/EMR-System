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
public class UrineAnalysis extends Analysis{
  public String color; 
  public String density; 
  public String reaction; 
  public String transperancy; 
    
    public UrineAnalysis(String pId, String aD, String colour, String dense, String react, String t){
    super(pId, aD); 
    color = colour; 
    density = dense; 
    reaction = react; 
    transperancy = t; 

   }    
    
public String getColor(){
    return color; 
}
public void setColor(String colour){
        color = colour; 
}

public String getDensity(){
    return density; 
}
public void setDensity(String dense){
        density = dense; 
}
public String getReaction(){
    return reaction; 
}
public void setReaction(String react){
        reaction = react; 
}
public String getTransperancy(){
    return transperancy; 
}
public void setTransperancy(String t){
        transperancy = t; 
}


}
