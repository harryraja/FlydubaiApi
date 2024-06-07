
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
    "redeemMiles",
    "originalRedeemMiles"
})

public class PointsRedemption {

    @Override
	public String toString() {
		return "PointsRedemption [redeemMiles=" + redeemMiles + ", originalRedeemMiles=" + originalRedeemMiles
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("redeemMiles")
    private String redeemMiles;
    @JsonProperty("originalRedeemMiles")
    private String originalRedeemMiles;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("redeemMiles")
    public String getRedeemMiles() {
        return redeemMiles;
    }

    @JsonProperty("redeemMiles")
    public void setRedeemMiles(String redeemMiles) {
        this.redeemMiles = redeemMiles;
    }

    @JsonProperty("originalRedeemMiles")
    public String getOriginalRedeemMiles() {
        return originalRedeemMiles;
    }

    @JsonProperty("originalRedeemMiles")
    public void setOriginalRedeemMiles(String originalRedeemMiles) {
        this.originalRedeemMiles = originalRedeemMiles;
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
