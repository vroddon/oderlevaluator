package oeg.odrlevaluator;

import oeg.odrlevaluator.evaluator.PermissionValidator;
import oeg.odrlevaluator.model.Policy;
import oeg.odrlevaluator.model.Rule;

/**
 * Sample code to be used as demo
 * @author victor
 */
public class Tutorial {
    
    public static void main(String[] args) {

        Policy p = new Policy();
        p.setLabel("Sample policy to test the specs draft");
        Rule r = new Rule();
        r.addType("odrl:Permission");
        r.setAction("odrl:play");
        p.addRule(r);
        
        PermissionValidator validator = new PermissionValidator();
        boolean b = validator.validate(p);
        
        System.out.println("The following policy is: " + (b ? "valid" : "invalid") + "\n"+ p);
    }
   
}
