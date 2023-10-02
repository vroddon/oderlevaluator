package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

/**
 * RDF Resource as defined in RDF with some useful attributes and methods.
 * Current default attributes: id (URI), types, label
 * @author victor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Resource {

    @JsonProperty("@id")
    String id;
    
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("rdf:type")
    Set<String> types = new HashSet();

    @JsonProperty("http://www.w3.org/2000/01/rdf-schema#label")
    String label;
    
    
    public Set<String> getTypes() {
        return types;
    }
    
    public void addType(String type)
    {
        types.add(type);
    }
    

    public void setTypes(Set<String> types) {
        this.types = types;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
    
    public Resource()
    {
    //    id = getRandomId(4);
    }
    public void doRandomId()
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
            return "{}";
        }
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
