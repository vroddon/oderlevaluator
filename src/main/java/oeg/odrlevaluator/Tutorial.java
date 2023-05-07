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
        Rule r = new Rule();
        p.addRule(r);
        
        PermissionValidator validator = new PermissionValidator();
        boolean b = validator.validate(p);
        
        System.out.println("The following policy is: " + (b ? "valid" : "invalid") + "\n"+ p);
    }
   
}
