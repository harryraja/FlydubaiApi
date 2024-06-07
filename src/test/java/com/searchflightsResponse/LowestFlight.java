
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
    "lfId",
    "solutionId",
    "cabin"
})

public class LowestFlight {

    @Override
	public String toString() {
		return "LowestFlight [lfId=" + lfId + ", solutionId=" + solutionId + ", cabin=" + cabin
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("lfId")
    private String lfId;
    @JsonProperty("solutionId")
    private String solutionId;
    @JsonProperty("cabin")
    private String cabin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("lfId")
    public String getLfId() {
        return lfId;
    }

    @JsonProperty("lfId")
    public void setLfId(String lfId) {
        this.lfId = lfId;
    }

    @JsonProperty("solutionId")
    public String getSolutionId() {
        return solutionId;
    }

    @JsonProperty("solutionId")
    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId;
    }

    @JsonProperty("cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
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
