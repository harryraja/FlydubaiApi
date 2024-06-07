
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
    "baseRewardPoints",
    "bonusRewardPoints",
    "baseTierPoints",
    "bonusTierPoints",
    "promoRewards",
    "promoTier"
})

public class PointsEarned {

    @JsonProperty("baseRewardPoints")
    private String baseRewardPoints;
    @JsonProperty("bonusRewardPoints")
    private String bonusRewardPoints;
    @JsonProperty("baseTierPoints")
    private String baseTierPoints;
    @JsonProperty("bonusTierPoints")
    private String bonusTierPoints;
    @JsonProperty("promoRewards")
    private String promoRewards;
    @JsonProperty("promoTier")
    private String promoTier;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("baseRewardPoints")
    public String getBaseRewardPoints() {
        return baseRewardPoints;
    }

    @JsonProperty("baseRewardPoints")
    public void setBaseRewardPoints(String baseRewardPoints) {
        this.baseRewardPoints = baseRewardPoints;
    }

    @JsonProperty("bonusRewardPoints")
    public String getBonusRewardPoints() {
        return bonusRewardPoints;
    }

    @JsonProperty("bonusRewardPoints")
    public void setBonusRewardPoints(String bonusRewardPoints) {
        this.bonusRewardPoints = bonusRewardPoints;
    }

    @JsonProperty("baseTierPoints")
    public String getBaseTierPoints() {
        return baseTierPoints;
    }

    @JsonProperty("baseTierPoints")
    public void setBaseTierPoints(String baseTierPoints) {
        this.baseTierPoints = baseTierPoints;
    }

    @JsonProperty("bonusTierPoints")
    public String getBonusTierPoints() {
        return bonusTierPoints;
    }

    @JsonProperty("bonusTierPoints")
    public void setBonusTierPoints(String bonusTierPoints) {
        this.bonusTierPoints = bonusTierPoints;
    }

    @JsonProperty("promoRewards")
    public String getPromoRewards() {
        return promoRewards;
    }

    @JsonProperty("promoRewards")
    public void setPromoRewards(String promoRewards) {
        this.promoRewards = promoRewards;
    }

    @JsonProperty("promoTier")
    public String getPromoTier() {
        return promoTier;
    }

    @JsonProperty("promoTier")
    public void setPromoTier(String promoTier) {
        this.promoTier = promoTier;
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
