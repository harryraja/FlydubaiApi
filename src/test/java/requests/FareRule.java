
package requests;

import java.util.LinkedHashMap;
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
    "changeFees",
    "cancellationFees"
})

public class FareRule {

    @JsonProperty("changeFees")
    private ChangeFees changeFees;
    @JsonProperty("cancellationFees")
    private CancellationFees cancellationFees;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("changeFees")
    public ChangeFees getChangeFees() {
        return changeFees;
    }

    @JsonProperty("changeFees")
    public void setChangeFees(ChangeFees changeFees) {
        this.changeFees = changeFees;
    }

    @JsonProperty("cancellationFees")
    public CancellationFees getCancellationFees() {
        return cancellationFees;
    }

    @JsonProperty("cancellationFees")
    public void setCancellationFees(CancellationFees cancellationFees) {
        this.cancellationFees = cancellationFees;
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
