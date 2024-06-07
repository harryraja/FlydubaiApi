
package com.searchflightsResponse;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "ruleType",
    "rules"
})

public class CancellationFees {

    @JsonProperty("ruleType")
    private String ruleType;
    @Override
	public String toString() {
		return "CancellationFees [ruleType=" + ruleType + ", rules=" + rules + ", additionalProperties="
				+ additionalProperties + "]";
	}

	@JsonProperty("rules")
    private List<Rule__1> rules;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("ruleType")
    public String getRuleType() {
        return ruleType;
    }

    @JsonProperty("ruleType")
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    @JsonProperty("rules")
    public List<Rule__1> getRules() {
        return rules;
    }

    @JsonProperty("rules")
    public void setRules(List<Rule__1> rules) {
        this.rules = rules;
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
