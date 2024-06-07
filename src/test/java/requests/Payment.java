package requests;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import searchFlightsPackage.FlightSearchRequest;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
	"itineraryAction",
    "passengerList",
    "preferences",
    "currency",
    "searchRequest",
    "selectedFlights",
    "confirmUrl",
    "locale"
})



public class Payment {

	 @JsonProperty("locale")
	    private String locale;
	 @JsonProperty("confirmUrl")
	    private String confirmUrl;
	 
    public String getLocale() {
		return locale;
	}
	public void setLocale(String locale) {
		this.locale = locale;
	}
	public String getConfirmUrl() {
		return confirmUrl;
	}
	public void setConfirmUrl(String confirmUrl) {
		this.confirmUrl = confirmUrl;
	}

	@JsonProperty("passengerList")
    private List<PassengerList> passengerList;
    @JsonProperty("preferences")
    private Preferences preferences;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("searchRequest")
    private FlightSearchRequest searchRequest;
    @JsonProperty("selectedFlights")
    private ArrayList selectedFlights;
    
    @JsonProperty("itineraryAction")
    private String itineraryAction;
    @JsonProperty("itineraryAction")
    public String getItineraryAction() {
		return itineraryAction;
	}
    @JsonProperty("itineraryAction")
	public void setItineraryAction(String itineraryAction) {
		this.itineraryAction = itineraryAction;
	}

	@JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("passengerList")
    public List<PassengerList> getPassengerList() {
        return passengerList;
    }

    @JsonProperty("passengerList")
    public void setPassengerList(ArrayList<PassengerList> passengerList2) {
        this.passengerList = passengerList2;
    }

    @JsonProperty("preferences")
    public Preferences getPreferences() {
        return preferences;
    }

    @JsonProperty("preferences")
    public void setPreferences(Preferences preferences) {
        this.preferences = preferences;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
	public String toString() {
		return "Payment [locale=" + locale + ", confirmUrl=" + confirmUrl + ", passengerList=" + passengerList
				+ ", preferences=" + preferences + ", currency=" + currency + ", searchRequest=" + searchRequest
				+ ", selectedFlights=" + selectedFlights + ", itineraryAction=" + itineraryAction
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("searchRequest")
    public FlightSearchRequest getSearchRequest() {
        return searchRequest;
    }

    @JsonProperty("searchRequest")
    public void setSearchRequest(FlightSearchRequest request) {
        this.searchRequest = request;
    }

    @JsonProperty("selectedFlights")
    public ArrayList getSelectedFlights() {
        return selectedFlights;
    }

    @JsonProperty("selectedFlights")
    public void setSelectedFlights(ArrayList list) {
        this.selectedFlights = list;
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
