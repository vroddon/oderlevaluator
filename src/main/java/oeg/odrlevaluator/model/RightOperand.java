/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;

/**
 *
 * @author victor
 */
@JsonldType("odrl:RightOperand")
public class RightOperand extends Resource{
    
    @JsonProperty("@value")
    public String value="";

    @JsonProperty("@type")
    public String type="";
 
    public RightOperand(){}
    public RightOperand(String v, String t)
    {
        value = v;
        type = t;
    }
}
