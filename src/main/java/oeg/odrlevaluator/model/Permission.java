package oeg.odrlevaluator.model;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 *
 * @author victor
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Permission {
    String uri;
    boolean activated;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public boolean isActivated() {
        return activated;
    }

    public void setActivated(boolean activated) {
        this.activated = activated;
    }
}
