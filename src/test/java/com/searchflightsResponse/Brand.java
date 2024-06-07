
package com.searchflightsResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "name",
    "fareTypeID",
    "cabin",
    "includes"
})

public class Brand {

   

	@JsonProperty("name")
    private String name;
    @JsonProperty("fareTypeID")
    private String fareTypeID;
    @JsonProperty("cabin")
    private String cabin;
    @JsonProperty("includes")
    private Includes__1 includes;
   
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("fareTypeID")
    public String getFareTypeID() {
        return fareTypeID;
    }

    @JsonProperty("fareTypeID")
    public void setFareTypeID(String fareTypeID) {
        this.fareTypeID = fareTypeID;
    }

    @JsonProperty("cabin")
    public String getCabin() {
        return cabin;
    }

    @JsonProperty("cabin")
    public void setCabin(String cabin) {
        this.cabin = cabin;
    }

    @JsonProperty("includes")
    public Includes__1 getIncludes() {
        return includes;
    }

    @JsonProperty("includes")
    public void setIncludes(Includes__1 includes) {
        this.includes = includes;
    }

	@Override
	public String toString() {
		return "Brand [name=" + name + ", fareTypeID=" + fareTypeID + ", cabin=" + cabin + ", includes=" + includes
				+ "]";
	}

  

}
