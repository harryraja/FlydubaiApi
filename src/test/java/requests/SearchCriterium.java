
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
    "date",
    "dest",
    "direction",
    "origin",
    "isOriginMetro",
    "isDestMetro"
})
public class SearchCriterium {

    @JsonProperty("date")
    private String date;
    @JsonProperty("dest")
    private String dest;
    @JsonProperty("direction")
    private String direction;
    @JsonProperty("origin")
    private String origin;
    @JsonProperty("isOriginMetro")
    private Boolean isOriginMetro;
    @JsonProperty("isDestMetro")
    private Boolean isDestMetro;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("dest")
    public String getDest() {
        return dest;
    }

    @JsonProperty("dest")
    public void setDest(String dest) {
        this.dest = dest;
    }

    @JsonProperty("direction")
    public String getDirection() {
        return direction;
    }

    @JsonProperty("direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    @JsonProperty("origin")
    public String getOrigin() {
        return origin;
    }

    @JsonProperty("origin")
    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @JsonProperty("isOriginMetro")
    public Boolean getIsOriginMetro() {
        return isOriginMetro;
    }

    @JsonProperty("isOriginMetro")
    public void setIsOriginMetro(Boolean isOriginMetro) {
        this.isOriginMetro = isOriginMetro;
    }

    @JsonProperty("isDestMetro")
    public Boolean getIsDestMetro() {
        return isDestMetro;
    }

    @JsonProperty("isDestMetro")
    public void setIsDestMetro(Boolean isDestMetro) {
        this.isDestMetro = isDestMetro;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

	@JsonProperty("date")
	public String getDate() {
	    return date;
	}

}
