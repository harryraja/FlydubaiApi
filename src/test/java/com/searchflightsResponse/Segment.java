
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
    "route",
    "origin",
    "dest",
    "operatingCarrier",
    "direction",
    "lowestAdultFarePerPax",
    "lowestAdultFareTaxSumPerPax",
    "lowestAdultFareNoTaxUnformatted",
    "lowestAdultFareCabin",
    "lowestFareByCabin",
    "currencyCode",
    "departureDate",
    "isPromoFare",
    "isSoldOut",
    "flights",
    "brands",
    "notifications",
    "isInterline",
    "isCodeShare",
    "multiDayLowestFareflights",
    "pointsRedemption"
})

public class Segment {

    @Override
	public String toString() {
		return "Segment [route=" + route + ", origin=" + origin + ", dest=" + dest + ", operatingCarrier="
				+ operatingCarrier + ", direction=" + direction + ", lowestAdultFarePerPax=" + lowestAdultFarePerPax
				+ ", lowestAdultFareTaxSumPerPax=" + lowestAdultFareTaxSumPerPax + ", lowestAdultFareNoTaxUnformatted="
				+ lowestAdultFareNoTaxUnformatted + ", lowestAdultFareCabin=" + lowestAdultFareCabin
				+ ", lowestFareByCabin=" + lowestFareByCabin + ", currencyCode=" + currencyCode + ", departureDate="
				+ departureDate + ", isPromoFare=" + isPromoFare + ", isSoldOut=" + isSoldOut + ", flights=" + flights
				+ ", brands=" + brands + ", notifications=" + notifications + ", isInterline=" + isInterline
				+ ", isCodeShare=" + isCodeShare + ", multiDayLowestFareflights=" + multiDayLowestFareflights
				+ ", pointsRedemption=" + pointsRedemption + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("route")
    private String route;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("dest")
    private String dest;
    @JsonProperty("operatingCarrier")
    private Object operatingCarrier;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("lowestAdultFarePerPax")
    private String lowestAdultFarePerPax;
    @JsonProperty("lowestAdultFareTaxSumPerPax")
    private String lowestAdultFareTaxSumPerPax;
    @JsonProperty("lowestAdultFareNoTaxUnformatted")
    private String lowestAdultFareNoTaxUnformatted;
    @JsonProperty("lowestAdultFareCabin")
    private String lowestAdultFareCabin;
    @JsonProperty("lowestFareByCabin")
    private List<LowestFareByCabin> lowestFareByCabin;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("isPromoFare")
    private Boolean isPromoFare;
    @JsonProperty("isSoldOut")
    private Boolean isSoldOut;
    @JsonProperty("flights")
    private List<Flight> flights;
    @JsonProperty("brands")
    private List<Brand> brands;
    @JsonProperty("notifications")
    private List<Object> notifications;
    @JsonProperty("isInterline")
    private Boolean isInterline;
    @JsonProperty("isCodeShare")
    private Boolean isCodeShare;
    @JsonProperty("multiDayLowestFareflights")
    private Object multiDayLowestFareflights;
    @JsonProperty("pointsRedemption")
    private Object pointsRedemption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("route")
    public String getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(String route) {
        this.route = route;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("dest")
    public String getDest() {
        return dest;
    }

    @JsonProperty("dest")
    public void setDest(String dest) {
        this.dest = dest;
    }

    @JsonProperty("operatingCarrier")
    public Object getOperatingCarrier() {
        return operatingCarrier;
    }

    @JsonProperty("operatingCarrier")
    public void setOperatingCarrier(Object operatingCarrier) {
        this.operatingCarrier = operatingCarrier;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

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

    @JsonProperty("lowestFareByCabin")
    public List<LowestFareByCabin> getLowestFareByCabin() {
        return lowestFareByCabin;
    }

    @JsonProperty("lowestFareByCabin")
    public void setLowestFareByCabin(List<LowestFareByCabin> lowestFareByCabin) {
        this.lowestFareByCabin = lowestFareByCabin;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("departureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("departureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("isPromoFare")
    public Boolean getIsPromoFare() {
        return isPromoFare;
    }

    @JsonProperty("isPromoFare")
    public void setIsPromoFare(Boolean isPromoFare) {
        this.isPromoFare = isPromoFare;
    }

    @JsonProperty("isSoldOut")
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    @JsonProperty("isSoldOut")
    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @JsonProperty("flights")
    public List<Flight> getFlights() {
        return flights;
    }

    @JsonProperty("flights")
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @JsonProperty("brands")
    public List<Brand> getBrands() {
        return brands;
    }

    @JsonProperty("brands")
    public void setBrands(List<Brand> brands) {
        this.brands = brands;
    }

    @JsonProperty("notifications")
    public List<Object> getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(List<Object> notifications) {
        this.notifications = notifications;
    }

    @JsonProperty("isInterline")
    public Boolean getIsInterline() {
        return isInterline;
    }

    @JsonProperty("isInterline")
    public void setIsInterline(Boolean isInterline) {
        this.isInterline = isInterline;
    }

    @JsonProperty("isCodeShare")
    public Boolean getIsCodeShare() {
        return isCodeShare;
    }

    @JsonProperty("isCodeShare")
    public void setIsCodeShare(Boolean isCodeShare) {
        this.isCodeShare = isCodeShare;
    }

    @JsonProperty("multiDayLowestFareflights")
    public Object getMultiDayLowestFareflights() {
        return multiDayLowestFareflights;
    }

    @JsonProperty("multiDayLowestFareflights")
    public void setMultiDayLowestFareflights(Object multiDayLowestFareflights) {
        this.multiDayLowestFareflights = multiDayLowestFareflights;
    }

    @JsonProperty("pointsRedemption")
    public Object getPointsRedemption() {
        return pointsRedemption;
    }

    @JsonProperty("pointsRedemption")
    public void setPointsRedemption(Object pointsRedemption) {
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
