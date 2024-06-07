
package com.searchflightsResponse;

import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "departureDate",
    "departureTime",
    "arrivalDate",
    "hasFreeMeals",
    "arrivalTime",
    "flightDuration",
    "pfId",
    "flightNumber",
    "isCircularNextLeg",
    "origin",
    "destination",
    "originMetroGroup",
    "destinationMetroGroup",
    "operatingCarrier",
    "marketingCarrier",
    "marketingFlightNum",
    "operatingFlightNum",
    "fromTerminal",
    "toTerminal",
    "selectedSeatQuotes",
    "isBusRoute",
    "isWetLeased",
    "equipmentType"
})

public class Leg {

    @Override
	public String toString() {
		return "Leg [departureDate=" + departureDate + ", departureTime=" + departureTime + ", arrivalDate="
				+ arrivalDate + ", hasFreeMeals=" + hasFreeMeals + ", arrivalTime=" + arrivalTime + ", flightDuration="
				+ flightDuration + ", pfId=" + pfId + ", flightNumber=" + flightNumber + ", isCircularNextLeg="
				+ isCircularNextLeg + ", origin=" + origin + ", destination=" + destination + ", originMetroGroup="
				+ originMetroGroup + ", destinationMetroGroup=" + destinationMetroGroup + ", operatingCarrier="
				+ operatingCarrier + ", marketingCarrier=" + marketingCarrier + ", marketingFlightNum="
				+ marketingFlightNum + ", operatingFlightNum=" + operatingFlightNum + ", fromTerminal=" + fromTerminal
				+ ", toTerminal=" + toTerminal + ", selectedSeatQuotes=" + selectedSeatQuotes + ", isBusRoute="
				+ isBusRoute + ", isWetLeased=" + isWetLeased + ", equipmentType=" + equipmentType
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("departureTime")
    private String departureTime;
    @JsonProperty("arrivalDate")
    private String arrivalDate;
    @JsonProperty("hasFreeMeals")
    private Boolean hasFreeMeals;
    @JsonProperty("arrivalTime")
    private String arrivalTime;
    @JsonProperty("flightDuration")
    private String flightDuration;
    @JsonProperty("pfId")
    private String pfId;
    @JsonProperty("flightNumber")
    private String flightNumber;
    @JsonProperty("isCircularNextLeg")
    private Boolean isCircularNextLeg;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("destination")
    private String destination;
    @JsonProperty("originMetroGroup")
    private Object originMetroGroup;
    @JsonProperty("destinationMetroGroup")
    private Object destinationMetroGroup;
    @JsonProperty("operatingCarrier")
    private String operatingCarrier;
    @JsonProperty("marketingCarrier")
    private String marketingCarrier;
    @JsonProperty("marketingFlightNum")
    private String marketingFlightNum;
    @JsonProperty("operatingFlightNum")
    private Object operatingFlightNum;
    @JsonProperty("fromTerminal")
    private String fromTerminal;
    @JsonProperty("toTerminal")
    private String toTerminal;
    @JsonProperty("selectedSeatQuotes")
    private Object selectedSeatQuotes;
    @JsonProperty("isBusRoute")
    private Boolean isBusRoute;
    @JsonProperty("isWetLeased")
    private Boolean isWetLeased;
    @JsonProperty("equipmentType")
    private String equipmentType;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("departureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("departureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("departureTime")
    public String getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departureTime")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("arrivalDate")
    public String getArrivalDate() {
        return arrivalDate;
    }

    @JsonProperty("arrivalDate")
    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    @JsonProperty("hasFreeMeals")
    public Boolean getHasFreeMeals() {
        return hasFreeMeals;
    }

    @JsonProperty("hasFreeMeals")
    public void setHasFreeMeals(Boolean hasFreeMeals) {
        this.hasFreeMeals = hasFreeMeals;
    }

    @JsonProperty("arrivalTime")
    public String getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrivalTime")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("flightDuration")
    public String getFlightDuration() {
        return flightDuration;
    }

    @JsonProperty("flightDuration")
    public void setFlightDuration(String flightDuration) {
        this.flightDuration = flightDuration;
    }

    @JsonProperty("pfId")
    public String getPfId() {
        return pfId;
    }

    @JsonProperty("pfId")
    public void setPfId(String pfId) {
        this.pfId = pfId;
    }

    @JsonProperty("flightNumber")
    public String getFlightNumber() {
        return flightNumber;
    }

    @JsonProperty("flightNumber")
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @JsonProperty("isCircularNextLeg")
    public Boolean getIsCircularNextLeg() {
        return isCircularNextLeg;
    }

    @JsonProperty("isCircularNextLeg")
    public void setIsCircularNextLeg(Boolean isCircularNextLeg) {
        this.isCircularNextLeg = isCircularNextLeg;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("destination")
    public String getDestination() {
        return destination;
    }

    @JsonProperty("destination")
    public void setDestination(String destination) {
        this.destination = destination;
    }

    @JsonProperty("originMetroGroup")
    public Object getOriginMetroGroup() {
        return originMetroGroup;
    }

    @JsonProperty("originMetroGroup")
    public void setOriginMetroGroup(Object originMetroGroup) {
        this.originMetroGroup = originMetroGroup;
    }

    @JsonProperty("destinationMetroGroup")
    public Object getDestinationMetroGroup() {
        return destinationMetroGroup;
    }

    @JsonProperty("destinationMetroGroup")
    public void setDestinationMetroGroup(Object destinationMetroGroup) {
        this.destinationMetroGroup = destinationMetroGroup;
    }

    @JsonProperty("operatingCarrier")
    public String getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operatingCarrier")
    public void setOperatingCarrier(String operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("marketingCarrier")
    public String getMarketingCarrier() {
        return marketingCarrier;
    }

    @JsonProperty("marketingCarrier")
    public void setMarketingCarrier(String marketingCarrier) {
        this.marketingCarrier = marketingCarrier;
    }

    @JsonProperty("marketingFlightNum")
    public String getMarketingFlightNum() {
        return marketingFlightNum;
    }

    @JsonProperty("marketingFlightNum")
    public void setMarketingFlightNum(String marketingFlightNum) {
        this.marketingFlightNum = marketingFlightNum;
    }

    @JsonProperty("operatingFlightNum")
    public Object getOperatingFlightNum() {
        return operatingFlightNum;
    }

    @JsonProperty("operatingFlightNum")
    public void setOperatingFlightNum(Object operatingFlightNum) {
        this.operatingFlightNum = operatingFlightNum;
    }

    @JsonProperty("fromTerminal")
    public String getFromTerminal() {
        return fromTerminal;
    }

    @JsonProperty("fromTerminal")
    public void setFromTerminal(String fromTerminal) {
        this.fromTerminal = fromTerminal;
    }

    @JsonProperty("toTerminal")
    public String getToTerminal() {
        return toTerminal;
    }

    @JsonProperty("toTerminal")
    public void setToTerminal(String toTerminal) {
        this.toTerminal = toTerminal;
    }

    @JsonProperty("selectedSeatQuotes")
    public Object getSelectedSeatQuotes() {
        return selectedSeatQuotes;
    }

    @JsonProperty("selectedSeatQuotes")
    public void setSelectedSeatQuotes(Object selectedSeatQuotes) {
        this.selectedSeatQuotes = selectedSeatQuotes;
    }

    @JsonProperty("isBusRoute")
    public Boolean getIsBusRoute() {
        return isBusRoute;
    }

    @JsonProperty("isBusRoute")
    public void setIsBusRoute(Boolean isBusRoute) {
        this.isBusRoute = isBusRoute;
    }

    @JsonProperty("isWetLeased")
    public Boolean getIsWetLeased() {
        return isWetLeased;
    }

    @JsonProperty("isWetLeased")
    public void setIsWetLeased(Boolean isWetLeased) {
        this.isWetLeased = isWetLeased;
    }

    @JsonProperty("equipmentType")
    public String getEquipmentType() {
        return equipmentType;
    }

    @JsonProperty("equipmentType")
    public void setEquipmentType(String equipmentType) {
        this.equipmentType = equipmentType;
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
