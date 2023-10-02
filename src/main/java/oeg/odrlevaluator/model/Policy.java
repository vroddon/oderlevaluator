package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashSet;
import java.util.Set;

/**
 * ODRL Policy.
 * It has 
 * @author victor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({"@context", "id", "type", "label"})
public class Policy extends Resource {
    boolean activated; 
    
    @JsonProperty("odrl:permission")
    private Set<Rule> rules = new HashSet();
    
    @JsonProperty("@context")
    final private String CONTEXT = "http://cosasbuenas.es/odrl-e/odrl3.jsonld";//"http://www.w3.org/ns/odrl.jsonld";

    public Policy()
    {
    //    id = getRandomId(4);
        addType("odrl:Policy");
    }

    public void addRule(Rule r)
    {
        getRules().add(r);
    }
    public void removeRule(Rule r)
    {
        getRules().remove(r);
    }
    public void clearRules()
    {
        getRules().clear();
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
    
    public static void main(String args[])
    {
        System.out.println(new Policy());
    }    

    /**
     * @return the rules
     */
    public Set<Rule> getRules() {
        return rules;
    }

    /**
     * @param rules the rules to set
     */
    public void setRules(Set<Rule> rules) {
        this.rules = rules;
    }
    
}
