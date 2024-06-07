
package requests;

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
    "lfId",
    "fareTypeID",
    "fareTypeName",
    "includes",
    "pfIds",
    "cabin",
    "secureHash",
    "fareCarrier",
    "ticketDesignator",
    "hashCode",
    "fare",
    "fareInformation",
    "seatsLeft",
    "isSoldOut",
    "containsCircularFlight",
    "containsConnectionFlight",
    "badges"
})

public class FareType {

    @JsonProperty("route")
    private String route;
    @JsonProperty("lfId")
    private String lfId;
    @JsonProperty("fareTypeID")
    private String fareTypeID;
    @JsonProperty("fareTypeName")
    private String fareTypeName;
    @JsonProperty("includes")
    private Includes includes;
    @JsonProperty("pfIds")
    private List<PfId> pfIds;
    @JsonProperty("cabin")
    private String cabin;
    @JsonProperty("secureHash")
    private String secureHash;
    @JsonProperty("fareCarrier")
    private String fareCarrier;
    @JsonProperty("ticketDesignator")
    private Object ticketDesignator;
    @JsonProperty("hashCode")
    private Object hashCode;
    @JsonProperty("fare")
    private Fare fare;
    @JsonProperty("fareInformation")
    private FareInformation fareInformation;
    @JsonProperty("seatsLeft")
    private Integer seatsLeft;
    @JsonProperty("isSoldOut")
    private Boolean isSoldOut;
    @JsonProperty("containsCircularFlight")
    private Boolean containsCircularFlight;
    @JsonProperty("containsConnectionFlight")
    private Boolean containsConnectionFlight;
    @JsonProperty("badges")
    private List<Object> badges;
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

    @JsonProperty("lfId")
    public String getLfId() {
        return lfId;
    }

    @JsonProperty("lfId")
    public void setLfId(String lfId) {
        this.lfId = lfId;
    }

    @JsonProperty("fareTypeID")
    public String getFareTypeID() {
        return fareTypeID;
    }

    @JsonProperty("fareTypeID")
    public void setFareTypeID(String fareTypeID) {
        this.fareTypeID = fareTypeID;
    }

    @JsonProperty("fareTypeName")
    public String getFareTypeName() {
        return fareTypeName;
    }

    @JsonProperty("fareTypeName")
    public void setFareTypeName(String fareTypeName) {
        this.fareTypeName = fareTypeName;
    }

    @JsonProperty("includes")
    public Includes getIncludes() {
        return includes;
    }

    @JsonProperty("includes")
    public void setIncludes(Includes includes) {
        this.includes = includes;
    }

    @JsonProperty("pfIds")
    public List<PfId> getPfIds() {
        return pfIds;
    }

    @JsonProperty("pfIds")
    public void setPfIds(List<PfId> pfIds) {
        this.pfIds = pfIds;
    }

    @JsonProperty("cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("secureHash")
    public String getSecureHash() {
        return secureHash;
    }

    @JsonProperty("secureHash")
    public void setSecureHash(String secureHash) {
        this.secureHash = secureHash;
    }

    @JsonProperty("fareCarrier")
    public String getFareCarrier() {
        return fareCarrier;
    }

    @JsonProperty("fareCarrier")
    public void setFareCarrier(String fareCarrier) {
        this.fareCarrier = fareCarrier;
    }

    @JsonProperty("ticketDesignator")
    public Object getTicketDesignator() {
        return ticketDesignator;
    }

    @JsonProperty("ticketDesignator")
    public void setTicketDesignator(Object ticketDesignator) {
        this.ticketDesignator = ticketDesignator;
    }

    @JsonProperty("hashCode")
    public Object getHashCode() {
        return hashCode;
    }

    @JsonProperty("hashCode")
    public void setHashCode(Object hashCode) {
        this.hashCode = hashCode;
    }

    @JsonProperty("fare")
    public Fare getFare() {
        return fare;
    }

    @JsonProperty("fare")
    public void setFare(Fare fare) {
        this.fare = fare;
    }

    @JsonProperty("fareInformation")
    public FareInformation getFareInformation() {
        return fareInformation;
    }

    @JsonProperty("fareInformation")
    public void setFareInformation(FareInformation fareInformation) {
        this.fareInformation = fareInformation;
    }

    @JsonProperty("seatsLeft")
    public Integer getSeatsLeft() {
        return seatsLeft;
    }

    @JsonProperty("seatsLeft")
    public void setSeatsLeft(Integer seatsLeft) {
        this.seatsLeft = seatsLeft;
    }

    @JsonProperty("isSoldOut")
    public Boolean getIsSoldOut() {
        return isSoldOut;
    }

    @JsonProperty("isSoldOut")
    public void setIsSoldOut(Boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @JsonProperty("containsCircularFlight")
    public Boolean getContainsCircularFlight() {
        return containsCircularFlight;
    }

    @JsonProperty("containsCircularFlight")
    public void setContainsCircularFlight(Boolean containsCircularFlight) {
        this.containsCircularFlight = containsCircularFlight;
    }

    @JsonProperty("containsConnectionFlight")
    public Boolean getContainsConnectionFlight() {
        return containsConnectionFlight;
    }

    @JsonProperty("containsConnectionFlight")
    public void setContainsConnectionFlight(Boolean containsConnectionFlight) {
        this.containsConnectionFlight = containsConnectionFlight;
    }

    @JsonProperty("badges")
    public List<Object> getBadges() {
        return badges;
    }

    @JsonProperty("badges")
    public void setBadges(List<Object> badges) {
        this.badges = badges;
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
