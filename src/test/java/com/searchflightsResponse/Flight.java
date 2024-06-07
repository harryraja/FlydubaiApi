
package com.searchflightsResponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "origin",
    "dest",
    "lfId",
    "departureDate",
    "isAvailabile",
    "isInterline",
    "isCodeShare",
    "stops",
    "totalDuration",
    "departureTime",
    "arrivalTime",
    "fareTypes",
    "legs",
    "flightNum",
    "flightGroupID",
    "selectedFare",
    
})

public class Flight {

   

	@JsonProperty("selectedFare")
	public com.searchflightsResponse.SelectedFare getSelectedFare() {
		return selectedFare;
	}
	@JsonProperty("selectedFare")
	public void setSelectedFare(com.searchflightsResponse.SelectedFare selectedFare2) {
		this.selectedFare = selectedFare2;
	}



	@JsonProperty("origin")
    private String origin;
    @JsonProperty("selectedFare")
    private com.searchflightsResponse.SelectedFare selectedFare;
    @JsonProperty("dest")
    private String dest;
    @JsonProperty("lfId")
    private String lfId;
    @JsonProperty("departureDate")
    private String departureDate;
    @JsonProperty("isAvailabile")
    private Boolean isAvailabile;
    @JsonProperty("isInterline")
    private Boolean isInterline;
    @JsonProperty("isCodeShare")
    private Boolean isCodeShare;
    @JsonProperty("stops")
    private List<Object> stops;
    @JsonProperty("totalDuration")
    private String totalDuration;
    @JsonProperty("departureTime")
    private String departureTime;
    @JsonProperty("arrivalTime")
    private String arrivalTime;
    @JsonProperty("fareTypes")
    private List<FareType> fareTypes;
    @JsonProperty("legs")
    private List<Leg> legs;
    @JsonProperty("flightNum")
    private String flightNum;
    @JsonProperty("flightGroupID")
    private Object flightGroupID;
    
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

    @JsonProperty("lfId")
    public String getLfId() {
        return lfId;
    }

    @JsonProperty("lfId")
    public void setLfId(String lfId) {
        this.lfId = lfId;
    }

    @JsonProperty("departureDate")
    public String getDepartureDate() {
        return departureDate;
    }

    @JsonProperty("departureDate")
    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    @JsonProperty("isAvailabile")
    public Boolean getIsAvailabile() {
        return isAvailabile;
    }

    @JsonProperty("isAvailabile")
    public void setIsAvailabile(Boolean isAvailabile) {
        this.isAvailabile = isAvailabile;
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

    @JsonProperty("stops")
    public List<Object> getStops() {
        return stops;
    }

    @JsonProperty("stops")
    public void setStops(List<Object> stops) {
        this.stops = stops;
    }

    @JsonProperty("totalDuration")
    public String getTotalDuration() {
        return totalDuration;
    }

    @JsonProperty("totalDuration")
    public void setTotalDuration(String totalDuration) {
        this.totalDuration = totalDuration;
    }

    @JsonProperty("departureTime")
    public String getDepartureTime() {
        return departureTime;
    }

    @JsonProperty("departureTime")
    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    @JsonProperty("arrivalTime")
    public String getArrivalTime() {
        return arrivalTime;
    }

    @JsonProperty("arrivalTime")
    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @JsonProperty("fareTypes")
    public List<FareType> getFareTypes() {
        return fareTypes;
    }

    @JsonProperty("fareTypes")
    public void setFareTypes(List<FareType> fareTypes) {
        this.fareTypes = fareTypes;
    }

    @JsonProperty("legs")
    public List<Leg> getLegs() {
        return legs;
    }

    @JsonProperty("legs")
    public void setLegs(List<Leg> legs) {
        this.legs = legs;
    }

    @JsonProperty("flightNum")
    public String getFlightNum() {
        return flightNum;
    }

    @JsonProperty("flightNum")
    public void setFlightNum(String flightNum) {
        this.flightNum = flightNum;
    }

    @JsonProperty("flightGroupID")
    public Object getFlightGroupID() {
        return flightGroupID;
    }

    @JsonProperty("flightGroupID")
    public void setFlightGroupID(Object flightGroupID) {
        this.flightGroupID = flightGroupID;
    }

  

	@Override
	public String toString() {
		return "Flight [origin=" + origin + ", selectedFare=" + selectedFare + ", dest=" + dest + ", lfId=" + lfId
				+ ", departureDate=" + departureDate + ", isAvailabile=" + isAvailabile + ", isInterline=" + isInterline
				+ ", isCodeShare=" + isCodeShare + ", stops=" + stops + ", totalDuration=" + totalDuration
				+ ", departureTime=" + departureTime + ", arrivalTime=" + arrivalTime + ", fareTypes=" + fareTypes
				+ ", legs=" + legs + ", flightNum=" + flightNum + ", flightGroupID=" + flightGroupID + "]";
	}

}
