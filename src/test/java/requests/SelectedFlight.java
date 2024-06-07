package requests;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.searchflightsResponse.Flight;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
   
    "selectedFlights"
})

public class SelectedFlight {

    @JsonProperty("selectedFlights")
    private List<Flight> flights;
   
    @JsonProperty("selectedFlights")
    public List<Flight> getSelectedFlights() {
        return flights;
    }

    @JsonProperty("selectedFlights")
    public void setSelectedFlights(List<Flight>  flights2) {
        this.flights = flights2;
    }

	@Override
	public String toString() {
		return "SelectedFlight [flights=" + flights + "]";
	}

	
	

  
   

}
