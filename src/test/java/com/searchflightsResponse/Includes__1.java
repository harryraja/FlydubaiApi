
package com.searchflightsResponse;

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
    "handBaggage"
})

public class Includes__1 {

    @Override
	public String toString() {
		return "Includes__1 [handBaggage=" + handBaggage + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("handBaggage")
    private String handBaggage;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("handBaggage")
    public String getHandBaggage() {
        return handBaggage;
    }

    @JsonProperty("handBaggage")
    public void setHandBaggage(String handBaggage) {
        this.handBaggage = handBaggage;
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
