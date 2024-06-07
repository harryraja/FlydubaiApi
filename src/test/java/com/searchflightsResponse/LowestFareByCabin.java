
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
    "lowestAdultFarePerPax",
    "lowestAdultFareTaxSumPerPax",
    "lowestAdultFareNoTaxUnformatted",
    "lowestAdultFareCabin",
    "lowestAdultRedeemMiles",
    "currencyCode"
})

public class LowestFareByCabin {

    @Override
	public String toString() {
		return "LowestFareByCabin [lowestAdultFarePerPax=" + lowestAdultFarePerPax + ", lowestAdultFareTaxSumPerPax="
				+ lowestAdultFareTaxSumPerPax + ", lowestAdultFareNoTaxUnformatted=" + lowestAdultFareNoTaxUnformatted
				+ ", lowestAdultFareCabin=" + lowestAdultFareCabin + ", lowestAdultRedeemMiles="
				+ lowestAdultRedeemMiles + ", currencyCode=" + currencyCode + ", additionalProperties="
				+ additionalProperties + "]";
	}

	@JsonProperty("lowestAdultFarePerPax")
    private String lowestAdultFarePerPax;
    @JsonProperty("lowestAdultFareTaxSumPerPax")
    private String lowestAdultFareTaxSumPerPax;
    @JsonProperty("lowestAdultFareNoTaxUnformatted")
    private String lowestAdultFareNoTaxUnformatted;
    @JsonProperty("lowestAdultFareCabin")
    private String lowestAdultFareCabin;
    @JsonProperty("lowestAdultRedeemMiles")
    private String lowestAdultRedeemMiles;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("lowestAdultFarePerPax")
    public String getLowestAdultFarePerPax() {
        return lowestAdultFarePerPax;
    }

    @JsonProperty("lowestAdultFarePerPax")
    public void setLowestAdultFarePerPax(String lowestAdultFarePerPax) {
        this.lowestAdultFarePerPax = lowestAdultFarePerPax;
    }

    @JsonProperty("lowestAdultFareTaxSumPerPax")
    public String getLowestAdultFareTaxSumPerPax() {
        return lowestAdultFareTaxSumPerPax;
    }

    @JsonProperty("lowestAdultFareTaxSumPerPax")
    public void setLowestAdultFareTaxSumPerPax(String lowestAdultFareTaxSumPerPax) {
        this.lowestAdultFareTaxSumPerPax = lowestAdultFareTaxSumPerPax;
    }

    @JsonProperty("lowestAdultFareNoTaxUnformatted")
    public String getLowestAdultFareNoTaxUnformatted() {
        return lowestAdultFareNoTaxUnformatted;
    }

    @JsonProperty("lowestAdultFareNoTaxUnformatted")
    public void setLowestAdultFareNoTaxUnformatted(String lowestAdultFareNoTaxUnformatted) {
        this.lowestAdultFareNoTaxUnformatted = lowestAdultFareNoTaxUnformatted;
    }

    @JsonProperty("lowestAdultFareCabin")
    public String getLowestAdultFareCabin() {
        return lowestAdultFareCabin;
    }

    @JsonProperty("lowestAdultFareCabin")
    public void setLowestAdultFareCabin(String lowestAdultFareCabin) {
        this.lowestAdultFareCabin = lowestAdultFareCabin;
    }

    @JsonProperty("lowestAdultRedeemMiles")
    public String getLowestAdultRedeemMiles() {
        return lowestAdultRedeemMiles;
    }

    @JsonProperty("lowestAdultRedeemMiles")
    public void setLowestAdultRedeemMiles(String lowestAdultRedeemMiles) {
        this.lowestAdultRedeemMiles = lowestAdultRedeemMiles;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
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
