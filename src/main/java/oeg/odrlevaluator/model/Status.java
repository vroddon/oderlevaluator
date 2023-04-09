package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Status of the application class.
 * @author victor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Status {
    String alive="true";
    
    public String getAlive()
    {
        return alive;
    }

    public static Status getStatus()
    {
        return new Status();
    }
}
