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
@JsonldType("odrl:Permission")
public class Rule extends Resource {
    
    
    /* esto es lo deseado dentro del json id
        "http://www.w3.org/ns/odrl/2/action": {"@id": "odrl:action"}
    */
    //VICTOR AQUI TENGO QUE PRODUCIR ESTO   "http://www.w3.org/ns/odrl/2/action": {"@id": "odrl:action"}
    @JsonProperty("http://www.w3.org/ns/odrl/2/action")
    String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}
