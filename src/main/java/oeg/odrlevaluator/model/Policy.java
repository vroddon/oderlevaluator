package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashSet;
import java.util.Set;

/**
 * ODRL Permission
 * @author victor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Policy extends Resource {
    boolean activated;
    Set<Rule> rules = new HashSet();

    public Policy()
    {
        
    }

    public void addRule(Rule r)
    {
        rules.add(r);
    }
    public void removeRule(Rule r)
    {
        rules.remove(r);
    }
    public void clearRules()
    {
        rules.clear();
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
    
}
