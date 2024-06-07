
package requests;

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
    "handBaggage",
    "checkinBaggage",
    "meals",
    "seats",
    "ife"
})

public class Includes {

    @JsonProperty("handBaggage")
    private String handBaggage;
    @JsonProperty("checkinBaggage")
    private String checkinBaggage;
    @JsonProperty("meals")
    private String meals;
    @JsonProperty("seats")
    private String seats;
    @JsonProperty("ife")
    private String ife;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("handBaggage")
    public String getHandBaggage() {
        return handBaggage;
    }

    @JsonProperty("handBaggage")
    public void setHandBaggage(String handBaggage) {
        this.handBaggage = handBaggage;
    }

    @JsonProperty("checkinBaggage")
    public String getCheckinBaggage() {
        return checkinBaggage;
    }

    @JsonProperty("checkinBaggage")
    public void setCheckinBaggage(String checkinBaggage) {
        this.checkinBaggage = checkinBaggage;
    }

    @JsonProperty("meals")
    public String getMeals() {
        return meals;
    }

    @JsonProperty("meals")
    public void setMeals(String meals) {
        this.meals = meals;
    }

    @JsonProperty("seats")
    public String getSeats() {
        return seats;
    }

    @JsonProperty("seats")
    public void setSeats(String seats) {
        this.seats = seats;
    }

    @JsonProperty("ife")
    public String getIfe() {
        return ife;
    }

    @JsonProperty("ife")
    public void setIfe(String ife) {
        this.ife = ife;
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
