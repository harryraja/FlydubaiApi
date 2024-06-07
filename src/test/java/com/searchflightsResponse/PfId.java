
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
    "pfId",
    "cabin",
    "fareClass",
    "date"
})

public class PfId {

    @Override
	public String toString() {
		return "PfId [pfId=" + pfId + ", cabin=" + cabin + ", fareClass=" + fareClass + ", date=" + date
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("pfId")
    private String pfId;
    @JsonProperty("cabin")
    private String cabin;
    @JsonProperty("fareClass")
    private String fareClass;
    @JsonProperty("date")
    private String date;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("pfId")
    public String getPfId() {
        return pfId;
    }

    @JsonProperty("pfId")
    public void setPfId(String pfId) {
        this.pfId = pfId;
    }

    @JsonProperty("cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("fareClass")
    public String getFareClass() {
        return fareClass;
    }

    @JsonProperty("fareClass")
    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
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
