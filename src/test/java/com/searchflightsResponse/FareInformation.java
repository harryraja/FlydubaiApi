
package com.searchflightsResponse;

import java.util.ArrayList;
import java.util.List;

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

    @Override
	public String toString() {
		return "FareInformation [adultFares=" + adultFares + ", childFares=" + childFares + ", infantFares="
				+ infantFares + "]";
	}

	@JsonProperty("adultFares")
    private List<AdultFare> adultFares;
    @JsonIgnore
    private List<Object> childFares;
    @JsonIgnore
    private List<Object> infantFares;
    
    @JsonProperty("adultFares")
    public List<AdultFare> getAdultFares() {
        return adultFares;
    }

    @JsonProperty("adultFares")
    public void setAdultFares(List<AdultFare> adultFares) {
        this.adultFares = adultFares;
    }

    @JsonProperty("childFares")
    public List<Object> getChildFares() {
        return childFares;
    }

    @JsonProperty("childFares")
    public void setChildFares(List<Object> childFares) {
    	ArrayList list=new ArrayList();
        this.childFares = list;
    }

    @JsonProperty("infantFares")
    public List<Object> getInfantFares() {
        return infantFares;
    }

    @JsonProperty("infantFares")
    public void setInfantFares(List<Object> infantFares) {
    	ArrayList list=new ArrayList();
        this.infantFares = list;
    }

   

}
