
package requests;

import java.util.LinkedHashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "isReadyToSignUpForOffers"
})

public class Preferences {

    @JsonProperty("isReadyToSignUpForOffers")
    private String isReadyToSignUpForOffers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("isReadyToSignUpForOffers")
    public String getIsReadyToSignUpForOffers() {
        return isReadyToSignUpForOffers;
    }

    @JsonProperty("isReadyToSignUpForOffers")
    public void setIsReadyToSignUpForOffers(String isReadyToSignUpForOffers) {
        this.isReadyToSignUpForOffers = isReadyToSignUpForOffers;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
