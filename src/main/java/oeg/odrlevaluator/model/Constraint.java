package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import ioinformarics.oss.jackson.module.jsonld.annotation.JsonldType;
import oeg.odrlevaluator.Misc;

/**
 *
 * @author victor
 */
@JsonInclude(Include.NON_NULL)
@JsonldType("odrl:Constraint")
public class Constraint extends Resource {

    @JsonProperty("odrl:leftOperand")
    private String leftOperand = "";
    
    private String operator = "";

    @JsonProperty("rightOperand")
    private RightOperand rightOperand = new RightOperand();
    
    public static void main(String[] args) {
        Constraint c = new Constraint();
        c.setOperator("eq");
        c.setLeftOperand("media");
        c.setRightOperand(new RightOperand("online", "xsd:string"));
        c.doRandomId();
        System.out.println(c);
    }
    
    public Constraint()
    {
        addType("odrl:Constraint");
    }
    

    /**
     * @return the rightOperand
     */
    public RightOperand getRightOperand() {
        return rightOperand;
    }

    /**
     * @param rightOperand the rightOperand to set
     */
    public void setRightOperand(RightOperand rightOperand) {
        this.rightOperand = rightOperand;
    }

    /**
     * @return the leftOperand
     */
    public String getLeftOperand() {
        return leftOperand;
    }

    /**
     * @param leftOperand the leftOperand to set
     */
    public void setLeftOperand(String leftOperand) {
        this.leftOperand = leftOperand;
    }

    /**
     * @return the operator
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator the operator to set
     */
    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public String toString()
    {
        String json="{}";
        try {
            ObjectMapper mapper = new ObjectMapper();
            json = mapper.writeValueAsString(this);
       //     config.setSerializationInclusion(JsonSerialize.Inclusion.NON_EMPTY);
            json = Misc.addContext(json);
            return json;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "{}";
        }
    }
}
