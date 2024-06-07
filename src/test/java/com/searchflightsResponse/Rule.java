
package com.searchflightsResponse;

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
    "type",
    "amount",
    "currency",
    "percentage",
    "isAllowed",
    "fromTime",
    "toTime"
})

public class Rule {

    @Override
	public String toString() {
		return "Rule [type=" + type + ", amount=" + amount + ", currency=" + currency + ", percentage=" + percentage
				+ ", isAllowed=" + isAllowed + ", fromTime=" + fromTime + ", toTime=" + toTime
				+ ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("type")
    private String type;
    @JsonProperty("amount")
    private String amount;
    @JsonProperty("currency")
    private Object currency;
    @JsonProperty("percentage")
    private String percentage;
    @JsonProperty("isAllowed")
    private Boolean isAllowed;
    @JsonProperty("fromTime")
    private Object fromTime;
    @JsonProperty("toTime")
    private String toTime;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("currency")
    public Object getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(Object currency) {
        this.currency = currency;
    }

    @JsonProperty("percentage")
    public String getPercentage() {
        return percentage;
    }

    @JsonProperty("percentage")
    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    @JsonProperty("isAllowed")
    public Boolean getIsAllowed() {
        return isAllowed;
    }

    @JsonProperty("isAllowed")
    public void setIsAllowed(Boolean isAllowed) {
        this.isAllowed = isAllowed;
    }

    @JsonProperty("fromTime")
    public Object getFromTime() {
        return fromTime;
    }

    @JsonProperty("fromTime")
    public void setFromTime(Object fromTime) {
        this.fromTime = fromTime;
    }

    @JsonProperty("toTime")
    public String getToTime() {
        return toTime;
    }

    @JsonProperty("toTime")
    public void setToTime(String toTime) {
        this.toTime = toTime;
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
