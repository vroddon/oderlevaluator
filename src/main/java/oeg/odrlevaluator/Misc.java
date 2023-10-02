package oeg.odrlevaluator;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author victor
 */
public class Misc {

    final static private String CONTEXT = "http://cosasbuenas.es/odrl-e/odrl3.jsonld";
//    final static private String CONTEXT = "https://www.w3.org/ns/odrl.jsonld";

    
        
    public static String addContext(String json) {
        return addPropertyToJSON(json, "@context", CONTEXT);
    }

    private static String addPropertyToJSON(String jsonString, String propertyName, String propertyValue) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode = objectMapper.readTree(jsonString);
            // Check if it's an object (root level is a JSON object)
            if (rootNode.isObject()) {
                ObjectNode objectNode = (ObjectNode) rootNode;

                // Add the new property-value pair to the JSON object
                objectNode.put(propertyName, propertyValue);

                // Convert the modified JSON object back to a string
                return objectMapper.writeValueAsString(objectNode);
            }
        } catch (Exception e) {
            return jsonString;
        }
        return jsonString;
    }

}
