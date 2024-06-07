
package com.searchflightsResponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "ruleType",
    "rules"
})

public class ChangeFees {

    @Override
	public String toString() {
		return "ChangeFees [ruleType=" + ruleType + ", rules=" + rules + "]";
	}

	@JsonProperty("ruleType")
    private String ruleType;
    @JsonProperty("rules")
    private List<Rule> rules;
    
    @JsonProperty("ruleType")
    public String getRuleType() {
        return ruleType;
    }

    @JsonProperty("ruleType")
    public void setRuleType(String ruleType) {
        this.ruleType = ruleType;
    }

    @JsonProperty("rules")
    public List<Rule> getRules() {
        return rules;
    }

    @JsonProperty("rules")
    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

   
}
