
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
    "isTravelDocMandatory",
    "isApisForBusinessMandatory",
    "isApisForEconomyMandatory",
    "isInsuranceMandatory",
    "showAllFlights",
    "useExternalGateway",
    "numberOfFlightsShown",
    "infantMinDays",
    "lstExtraProperties"
})

public class ValidationRules {

    @Override
	public String toString() {
		return "ValidationRules [isTravelDocMandatory=" + isTravelDocMandatory + ", isApisForBusinessMandatory="
				+ isApisForBusinessMandatory + ", isApisForEconomyMandatory=" + isApisForEconomyMandatory
				+ ", isInsuranceMandatory=" + isInsuranceMandatory + ", showAllFlights=" + showAllFlights
				+ ", useExternalGateway=" + useExternalGateway + ", numberOfFlightsShown=" + numberOfFlightsShown
				+ ", infantMinDays=" + infantMinDays + ", lstExtraProperties=" + lstExtraProperties
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("isTravelDocMandatory")
    private Boolean isTravelDocMandatory;
    @JsonProperty("isApisForBusinessMandatory")
    private Boolean isApisForBusinessMandatory;
    @JsonProperty("isApisForEconomyMandatory")
    private Boolean isApisForEconomyMandatory;
    @JsonProperty("isInsuranceMandatory")
    private Boolean isInsuranceMandatory;
    @JsonProperty("showAllFlights")
    private Boolean showAllFlights;
    @JsonProperty("useExternalGateway")
    private Object useExternalGateway;
    @JsonProperty("numberOfFlightsShown")
    private Integer numberOfFlightsShown;
    @JsonProperty("infantMinDays")
    private Integer infantMinDays;
    @JsonProperty("lstExtraProperties")
    private Object lstExtraProperties;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("isTravelDocMandatory")
    public Boolean getIsTravelDocMandatory() {
        return isTravelDocMandatory;
    }

    @JsonProperty("isTravelDocMandatory")
    public void setIsTravelDocMandatory(Boolean isTravelDocMandatory) {
        this.isTravelDocMandatory = isTravelDocMandatory;
    }

    @JsonProperty("isApisForBusinessMandatory")
    public Boolean getIsApisForBusinessMandatory() {
        return isApisForBusinessMandatory;
    }

    @JsonProperty("isApisForBusinessMandatory")
    public void setIsApisForBusinessMandatory(Boolean isApisForBusinessMandatory) {
        this.isApisForBusinessMandatory = isApisForBusinessMandatory;
    }

    @JsonProperty("isApisForEconomyMandatory")
    public Boolean getIsApisForEconomyMandatory() {
        return isApisForEconomyMandatory;
    }

    @JsonProperty("isApisForEconomyMandatory")
    public void setIsApisForEconomyMandatory(Boolean isApisForEconomyMandatory) {
        this.isApisForEconomyMandatory = isApisForEconomyMandatory;
    }

    @JsonProperty("isInsuranceMandatory")
    public Boolean getIsInsuranceMandatory() {
        return isInsuranceMandatory;
    }

    @JsonProperty("isInsuranceMandatory")
    public void setIsInsuranceMandatory(Boolean isInsuranceMandatory) {
        this.isInsuranceMandatory = isInsuranceMandatory;
    }

    @JsonProperty("showAllFlights")
    public Boolean getShowAllFlights() {
        return showAllFlights;
    }

    @JsonProperty("showAllFlights")
    public void setShowAllFlights(Boolean showAllFlights) {
        this.showAllFlights = showAllFlights;
    }

    @JsonProperty("useExternalGateway")
    public Object getUseExternalGateway() {
        return useExternalGateway;
    }

    @JsonProperty("useExternalGateway")
    public void setUseExternalGateway(Object useExternalGateway) {
        this.useExternalGateway = useExternalGateway;
    }

    @JsonProperty("numberOfFlightsShown")
    public Integer getNumberOfFlightsShown() {
        return numberOfFlightsShown;
    }

    @JsonProperty("numberOfFlightsShown")
    public void setNumberOfFlightsShown(Integer numberOfFlightsShown) {
        this.numberOfFlightsShown = numberOfFlightsShown;
    }

    @JsonProperty("infantMinDays")
    public Integer getInfantMinDays() {
        return infantMinDays;
    }

    @JsonProperty("infantMinDays")
    public void setInfantMinDays(Integer infantMinDays) {
        this.infantMinDays = infantMinDays;
    }

    @JsonProperty("lstExtraProperties")
    public Object getLstExtraProperties() {
        return lstExtraProperties;
    }

    @JsonProperty("lstExtraProperties")
    public void setLstExtraProperties(Object lstExtraProperties) {
        this.lstExtraProperties = lstExtraProperties;
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
