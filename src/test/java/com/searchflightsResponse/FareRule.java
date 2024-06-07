
package com.searchflightsResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "changeFees",
    "cancellationFees"
})

public class FareRule {

    @Override
	public String toString() {
		return "FareRule [changeFees=" + changeFees + ", cancellationFees=" + cancellationFees + "]";
	}

	@JsonProperty("changeFees")
    private ChangeFees changeFees;
    @JsonProperty("cancellationFees")
    private CancellationFees cancellationFees;
   
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

   
}
