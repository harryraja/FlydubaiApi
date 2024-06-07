
package com.searchflightsResponse;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseFare",
    "tax",
    "totalFare",
    "cabin",
    "lowestFlights",
    "pointsRedemption"
})

public class LowestTotalFare {

    @Override
	public String toString() {
		return "LowestTotalFare [baseFare=" + baseFare + ", tax=" + tax + ", totalFare=" + totalFare + ", cabin="
				+ cabin + ", lowestFlights=" + lowestFlights + ", pointsRedemption=" + pointsRedemption
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("baseFare")
    private String baseFare;
    @JsonProperty("tax")
    private String tax;
    @JsonProperty("totalFare")
    private String totalFare;
    @JsonProperty("cabin")
    private String cabin;
    @JsonProperty("lowestFlights")
    private List<LowestFlight> lowestFlights;
    @JsonProperty("pointsRedemption")
    private String pointsRedemption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("baseFare")
    public String getBaseFare() {
        return baseFare;
    }

    @JsonProperty("baseFare")
    public void setBaseFare(String baseFare) {
        this.baseFare = baseFare;
    }

    @JsonProperty("tax")
    public String getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(String tax) {
        this.tax = tax;
    }

    @JsonProperty("totalFare")
    public String getTotalFare() {
        return totalFare;
    }

    @JsonProperty("totalFare")
    public void setTotalFare(String totalFare) {
        this.totalFare = totalFare;
    }

    @JsonProperty("cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("lowestFlights")
    public List<LowestFlight> getLowestFlights() {
        return lowestFlights;
    }

    @JsonProperty("lowestFlights")
    public void setLowestFlights(List<LowestFlight> lowestFlights) {
        this.lowestFlights = lowestFlights;
    }

    @JsonProperty("pointsRedemption")
    public String getPointsRedemption() {
        return pointsRedemption;
    }

    @JsonProperty("pointsRedemption")
    public void setPointsRedemption(String pointsRedemption) {
        this.pointsRedemption = pointsRedemption;
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
