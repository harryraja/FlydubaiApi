
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
    "baseFare",
    "tax",
    "changeCost",
    "discount",
    "totalFare",
    "currencyCode",
    "isPromoFare",
    "isAccuralPromoFare",
    "isPromoCodeApplied",
    "solutionId",
    "isStopOverFare",
    "combinables",
    "pointsRedemption"
})

public class Fare {

    @JsonProperty("baseFare")
    private String baseFare;
    @JsonProperty("tax")
    private String tax;
    @JsonProperty("changeCost")
    private String changeCost;
    @JsonProperty("discount")
    private String discount;
    @JsonProperty("totalFare")
    private String totalFare;
    @JsonProperty("currencyCode")
    private String currencyCode;
    @JsonProperty("isPromoFare")
    private Boolean isPromoFare;
    @JsonProperty("isAccuralPromoFare")
    private Boolean isAccuralPromoFare;
    @JsonProperty("isPromoCodeApplied")
    private Boolean isPromoCodeApplied;
    @JsonProperty("solutionId")
    private String solutionId;
    @JsonProperty("isStopOverFare")
    private Boolean isStopOverFare;
    @JsonProperty("combinables")
    private Object combinables;
    @JsonProperty("pointsRedemption")
    private PointsRedemption pointsRedemption;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("baseFare")
    public String getBaseFare() {
        return baseFare;
    }

    @JsonProperty("baseFare")
    public void setBaseFare(String baseFare) {
        this.baseFare = baseFare;
    }

    @JsonProperty("tax")
    public String getTax() {
        return tax;
    }

    @JsonProperty("tax")
    public void setTax(String tax) {
        this.tax = tax;
    }

    @JsonProperty("changeCost")
    public String getChangeCost() {
        return changeCost;
    }

    @JsonProperty("changeCost")
    public void setChangeCost(String changeCost) {
        this.changeCost = changeCost;
    }

    @JsonProperty("discount")
    public String getDiscount() {
        return discount;
    }

    @JsonProperty("discount")
    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @JsonProperty("totalFare")
    public String getTotalFare() {
        return totalFare;
    }

    @JsonProperty("totalFare")
    public void setTotalFare(String totalFare) {
        this.totalFare = totalFare;
    }

    @JsonProperty("currencyCode")
    public String getCurrencyCode() {
        return currencyCode;
    }

    @JsonProperty("currencyCode")
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    @JsonProperty("isPromoFare")
    public Boolean getIsPromoFare() {
        return isPromoFare;
    }

    @JsonProperty("isPromoFare")
    public void setIsPromoFare(Boolean isPromoFare) {
        this.isPromoFare = isPromoFare;
    }

    @JsonProperty("isAccuralPromoFare")
    public Boolean getIsAccuralPromoFare() {
        return isAccuralPromoFare;
    }

    @JsonProperty("isAccuralPromoFare")
    public void setIsAccuralPromoFare(Boolean isAccuralPromoFare) {
        this.isAccuralPromoFare = isAccuralPromoFare;
    }

    @JsonProperty("isPromoCodeApplied")
    public Boolean getIsPromoCodeApplied() {
        return isPromoCodeApplied;
    }

    @JsonProperty("isPromoCodeApplied")
    public void setIsPromoCodeApplied(Boolean isPromoCodeApplied) {
        this.isPromoCodeApplied = isPromoCodeApplied;
    }

    @JsonProperty("solutionId")
    public String getSolutionId() {
        return solutionId;
    }

    @JsonProperty("solutionId")
    public void setSolutionId(String solutionId) {
        this.solutionId = solutionId;
    }

    @JsonProperty("isStopOverFare")
    public Boolean getIsStopOverFare() {
        return isStopOverFare;
    }

    @JsonProperty("isStopOverFare")
    public void setIsStopOverFare(Boolean isStopOverFare) {
        this.isStopOverFare = isStopOverFare;
    }

    @JsonProperty("combinables")
    public Object getCombinables() {
        return combinables;
    }

    @JsonProperty("combinables")
    public void setCombinables(Object combinables) {
        this.combinables = combinables;
    }

    @JsonProperty("pointsRedemption")
    public PointsRedemption getPointsRedemption() {
        return pointsRedemption;
    }

    @JsonProperty("pointsRedemption")
    public void setPointsRedemption(PointsRedemption pointsRedemption) {
        this.pointsRedemption = pointsRedemption;
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
