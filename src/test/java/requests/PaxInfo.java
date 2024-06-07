
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
    "adultCount",
    "childCount",
    "infantCount"
})

public class PaxInfo {

    @JsonProperty("adultCount")
    private Integer adultCount;
    @JsonProperty("childCount")
    private Integer childCount;
    @JsonProperty("infantCount")
    private Integer infantCount;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("adultCount")
    public Integer getAdultCount() {
        return adultCount;
    }

    @JsonProperty("adultCount")
    public void setAdultCount(Integer adultCount) {
        this.adultCount = adultCount;
    }

    @JsonProperty("childCount")
    public Integer getChildCount() {
        return childCount;
    }

    @JsonProperty("childCount")
    public void setChildCount(Integer childCount) {
        this.childCount = childCount;
    }

    @JsonProperty("infantCount")
    public Integer getInfantCount() {
        return infantCount;
    }

    @JsonProperty("infantCount")
    public void setInfantCount(Integer infantCount) {
        this.infantCount = infantCount;
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
