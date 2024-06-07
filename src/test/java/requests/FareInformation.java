
package requests;

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
@JsonInclude(Include.ALWAYS)

@JsonPropertyOrder({
    "adultFares",
    "childFares",
    "infantFares"
})

public class FareInformation {

    @JsonProperty("adultFares")
    private List<AdultFare> adultFares;
    @JsonProperty("secureHash")
    private String secureHash;
    public String getSecureHash() {
		return secureHash;
	}

	public void setSecureHash(String secureHash) {
		this.secureHash = secureHash;
	}

	@JsonProperty("childFares")
    private List<ChildFare> childFares;
    @JsonProperty("infantFares")
    private List<InfantFare> infantFares;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("adultFares")
    public List<AdultFare> getAdultFares() {
        return adultFares;
    }

    @JsonProperty("adultFares")
    public void setAdultFares(List<AdultFare> adultFares) {
        this.adultFares = adultFares;
    }

    @JsonProperty("childFares")
    public List<ChildFare> getChildFares() {
        return childFares;
    }

    @JsonProperty("childFares")
    public void setChildFares(List<ChildFare> childFares2) {
        this.childFares = childFares2;
    }

    @JsonProperty("infantFares")
    public List<InfantFare> getInfantFares() {
        return infantFares;
    }

    @JsonProperty("infantFares")
    public void setInfantFares(List<InfantFare> infantFares2) {
        this.infantFares = infantFares2;
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
