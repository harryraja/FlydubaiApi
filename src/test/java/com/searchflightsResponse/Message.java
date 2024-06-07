
package com.searchflightsResponse;

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
    "cmsKey",
    "defaultMessage",
    "defaultTitle",
    "route",
    "lfId",
    "AcceptanceRequired",
    "PriorityOrder"
})

public class Message {

    @Override
	public String toString() {
		return "Message [cmsKey=" + cmsKey + ", defaultMessage=" + defaultMessage + ", defaultTitle=" + defaultTitle
				+ ", route=" + route + ", lfId=" + lfId + ", acceptanceRequired=" + acceptanceRequired
				+ ", priorityOrder=" + priorityOrder + ", additionalProperties=" + additionalProperties + "]";
	}

	@JsonProperty("cmsKey")
    private String cmsKey;
    @JsonProperty("defaultMessage")
    private String defaultMessage;
    @JsonProperty("defaultTitle")
    private String defaultTitle;
    @JsonProperty("route")
    private Object route;
    @JsonProperty("lfId")
    private String lfId;
    @JsonProperty("AcceptanceRequired")
    private Boolean acceptanceRequired;
    @JsonProperty("PriorityOrder")
    private Integer priorityOrder;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("cmsKey")
    public String getCmsKey() {
        return cmsKey;
    }

    @JsonProperty("cmsKey")
    public void setCmsKey(String cmsKey) {
        this.cmsKey = cmsKey;
    }

    @JsonProperty("defaultMessage")
    public String getDefaultMessage() {
        return defaultMessage;
    }

    @JsonProperty("defaultMessage")
    public void setDefaultMessage(String defaultMessage) {
        this.defaultMessage = defaultMessage;
    }

    @JsonProperty("defaultTitle")
    public String getDefaultTitle() {
        return defaultTitle;
    }

    @JsonProperty("defaultTitle")
    public void setDefaultTitle(String defaultTitle) {
        this.defaultTitle = defaultTitle;
    }

    @JsonProperty("route")
    public Object getRoute() {
        return route;
    }

    @JsonProperty("route")
    public void setRoute(Object route) {
        this.route = route;
    }

    @JsonProperty("lfId")
    public String getLfId() {
        return lfId;
    }

    @JsonProperty("lfId")
    public void setLfId(String lfId) {
        this.lfId = lfId;
    }

    @JsonProperty("AcceptanceRequired")
    public Boolean getAcceptanceRequired() {
        return acceptanceRequired;
    }

    @JsonProperty("AcceptanceRequired")
    public void setAcceptanceRequired(Boolean acceptanceRequired) {
        this.acceptanceRequired = acceptanceRequired;
    }

    @JsonProperty("PriorityOrder")
    public Integer getPriorityOrder() {
        return priorityOrder;
    }

    @JsonProperty("PriorityOrder")
    public void setPriorityOrder(Integer priorityOrder) {
        this.priorityOrder = priorityOrder;
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
