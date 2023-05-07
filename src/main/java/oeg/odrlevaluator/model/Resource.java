package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.UUID;

/**
 *
 * @author victor
 */
public class Resource {

    @JsonProperty("@id")
    String id;
    
    public Resource()
    {
        id = getRandomId(4);
    }
    
    
    public String getId() {
        return id;
    }

    public void setUri(String id) {
        this.id = id;
    }

    @Override
    public String toString() {

        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return "{}";
    }

    public static String getRandomId(int length) {
        String id = UUID.randomUUID().toString().substring(0, length);
        if (id.length() < length) {
        StringBuilder sb = new StringBuilder();
        while (sb.length() < length - id.length()) {
            sb.append('0');
        }
        sb.append(id);
        id = sb.toString();
        }
        return "ex:"+id;
    }

}
