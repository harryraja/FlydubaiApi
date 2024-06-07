
package com.searchflightsResponse;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.ALWAYS)

@JsonPropertyOrder({
    "serverDateTimeUTC",
    "combinabilityStrictMode",
    "sessionDuration",
    "popupTimeout",
    "channel",
    "serverTimeGMT",
    "segments",
    "lowestTotalFare",
    "messages",
    "validationRules",
    "notifications",
    "sessionExpiryGMT",
    "sessionRemainingTime",
    "repricingKey",
    "banners"
})

public class Example {

    @Override
	public String toString() {
		return "Example [serverDateTimeUTC=" + serverDateTimeUTC + ", combinabilityStrictMode="
				+ combinabilityStrictMode + ", sessionDuration=" + sessionDuration + ", popupTimeout=" + popupTimeout
				+ ", channel=" + channel + ", serverTimeGMT=" + serverTimeGMT + ", segments=" + segments
				+ ", lowestTotalFare=" + lowestTotalFare + ", messages=" + messages + ", validationRules="
				+ validationRules + ", notifications=" + notifications + ", sessionExpiryGMT=" + sessionExpiryGMT
				+ ", sessionRemainingTime=" + sessionRemainingTime + ", repricingKey=" + repricingKey + ", banners="
				+ banners + "]";
	}

    @JsonProperty("serverDateTimeUTC ")
    private String serverDateTimeUTC;
    @JsonProperty("combinabilityStrictMode")
    private Boolean combinabilityStrictMode;
    @JsonProperty("sessionDuration")
    private String sessionDuration;
    @JsonProperty("popupTimeout")
    private String popupTimeout;
    @JsonProperty("channel")
    private Object channel;
    @JsonProperty("serverTimeGMT")
    private Object serverTimeGMT;
    @JsonProperty("segments")
    private List<Segment> segments;
    @JsonProperty("lowestTotalFare")
    private List<LowestTotalFare> lowestTotalFare;
    @JsonProperty("messages")
    private List<Message> messages;
    @JsonProperty("validationRules")
    private ValidationRules validationRules;
    @JsonProperty("notifications")
    private List<Object> notifications;
    @JsonProperty("sessionExpiryGMT")
    private String sessionExpiryGMT;
    @JsonProperty("sessionRemainingTime")
    private Integer sessionRemainingTime;
    @JsonProperty("repricingKey")
    private Object repricingKey;
    @JsonProperty("banners")
    private List<Object> banners;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("serverDateTimeUTC ")
    public String getServerDateTimeUTC() {
        return serverDateTimeUTC;
    }

    @JsonProperty("serverDateTimeUTC ")
    public void setServerDateTimeUTC(String serverDateTimeUTC) {
        this.serverDateTimeUTC = serverDateTimeUTC;
    }

    @JsonProperty("combinabilityStrictMode")
    public Boolean getCombinabilityStrictMode() {
        return combinabilityStrictMode;
    }

    @JsonProperty("combinabilityStrictMode")
    public void setCombinabilityStrictMode(Boolean combinabilityStrictMode) {
        this.combinabilityStrictMode = combinabilityStrictMode;
    }

    @JsonProperty("sessionDuration")
    public String getSessionDuration() {
        return sessionDuration;
    }

    @JsonProperty("sessionDuration")
    public void setSessionDuration(String sessionDuration) {
        this.sessionDuration = sessionDuration;
    }

    @JsonProperty("popupTimeout")
    public String getPopupTimeout() {
        return popupTimeout;
    }

    @JsonProperty("popupTimeout")
    public void setPopupTimeout(String popupTimeout) {
        this.popupTimeout = popupTimeout;
    }

    @JsonProperty("channel")
    public Object getChannel() {
        return channel;
    }

    @JsonProperty("channel")
    public void setChannel(Object channel) {
        this.channel = channel;
    }

    @JsonProperty("serverTimeGMT")
    public Object getServerTimeGMT() {
        return serverTimeGMT;
    }

    @JsonProperty("serverTimeGMT")
    public void setServerTimeGMT(Object serverTimeGMT) {
        this.serverTimeGMT = serverTimeGMT;
    }

    @JsonProperty("segments")
    public List<Segment> getSegments() {
        return segments;
    }

    @JsonProperty("segments")
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    @JsonProperty("lowestTotalFare")
    public List<LowestTotalFare> getLowestTotalFare() {
        return lowestTotalFare;
    }

    @JsonProperty("lowestTotalFare")
    public void setLowestTotalFare(List<LowestTotalFare> lowestTotalFare) {
        this.lowestTotalFare = lowestTotalFare;
    }

    @JsonProperty("messages")
    public List<Message> getMessages() {
        return messages;
    }

    @JsonProperty("messages")
    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @JsonProperty("validationRules")
    public ValidationRules getValidationRules() {
        return validationRules;
    }

    @JsonProperty("validationRules")
    public void setValidationRules(ValidationRules validationRules) {
        this.validationRules = validationRules;
    }

    @JsonProperty("notifications")
    public List<Object> getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(List<Object> notifications) {
        this.notifications = notifications;
    }

    @JsonProperty("sessionExpiryGMT")
    public String getSessionExpiryGMT() {
        return sessionExpiryGMT;
    }

    @JsonProperty("sessionExpiryGMT")
    public void setSessionExpiryGMT(String sessionExpiryGMT) {
        this.sessionExpiryGMT = sessionExpiryGMT;
    }

    @JsonProperty("sessionRemainingTime")
    public Integer getSessionRemainingTime() {
        return sessionRemainingTime;
    }

    @JsonProperty("sessionRemainingTime")
    public void setSessionRemainingTime(Integer sessionRemainingTime) {
        this.sessionRemainingTime = sessionRemainingTime;
    }

    @JsonProperty("repricingKey")
    public Object getRepricingKey() {
        return repricingKey;
    }

    @JsonProperty("repricingKey")
    public void setRepricingKey(Object repricingKey) {
        this.repricingKey = repricingKey;
    }

    @JsonProperty("banners")
    public List<Object> getBanners() {
        return banners;
    }

    @JsonProperty("banners")
    public void setBanners(List<Object> banners) {
        this.banners = banners;
    }

  

}
