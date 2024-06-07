
package com.searchflightsResponse;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.ALWAYS)

@JsonPropertyOrder({
    "adultFarePerPax",
    "baseAdultFarePerPax",
    "changeCost",
    "fareId",
    "fareBasisCode",
    "fareClass",
    "fareAmtNoTaxes",
    "taxPerPax",
    "discountPerPax",
    "paxCount",
    "applicableTaxes",
    "miscFareInfos",
    "includedExtas",
    "pointsEarned",
    "pointsRedemption",
    "ruleName",
    "ruleValue",
    "fareRule"
})

public class AdultFare {

    @Override
	public String toString() {
		return "AdultFare [adultFarePerPax=" + adultFarePerPax + ", baseAdultFarePerPax=" + baseAdultFarePerPax
				+ ", changeCost=" + changeCost + ", fareId=" + fareId + ", fareBasisCode=" + fareBasisCode
				+ ", fareClass=" + fareClass + ", fareAmtNoTaxes=" + fareAmtNoTaxes + ", taxPerPax=" + taxPerPax
				+ ", discountPerPax=" + discountPerPax + ", paxCount=" + paxCount + ", applicableTaxes="
				+ applicableTaxes + ", miscFareInfos=" + miscFareInfos + ", includedExtas=" + includedExtas
				+ ", pointsEarned=" + pointsEarned + ", pointsRedemption=" + pointsRedemption + ", ruleName=" + ruleName
				+ ", ruleValue=" + ruleValue + ", fareRule=" + fareRule
				+ "]";
	}

	@JsonProperty("adultFarePerPax")
    private String adultFarePerPax;
    @JsonProperty("baseAdultFarePerPax")
    private String baseAdultFarePerPax;
    @JsonProperty("changeCost")
    private String changeCost;
    @JsonProperty("fareId")
    private String fareId;
    @JsonProperty("fareBasisCode")
    private String fareBasisCode;
    @JsonProperty("fareClass")
    private String fareClass;
    @JsonProperty("fareAmtNoTaxes")
    private Object fareAmtNoTaxes;
    @JsonProperty("taxPerPax")
    private String taxPerPax;
    @JsonProperty("discountPerPax")
    private String discountPerPax;
    @JsonProperty("paxCount")
    private Integer paxCount;
    @JsonProperty("applicableTaxes")
    private List<ApplicableTax> applicableTaxes;
    @JsonProperty("miscFareInfos")
    private Object miscFareInfos;
    @JsonProperty("includedExtas")
    private List<IncludedExta> includedExtas;
    @JsonProperty("pointsEarned")
    private PointsEarned pointsEarned;
    @JsonProperty("pointsRedemption")
    private PointsRedemption__1 pointsRedemption;
    @JsonProperty("ruleName")
    private String ruleName;
    @JsonProperty("ruleValue")
    private String ruleValue;
    @JsonProperty("fareRule")
    private FareRule fareRule;
   
    @JsonProperty("adultFarePerPax")
    public String getAdultFarePerPax() {
        return adultFarePerPax;
    }

    @JsonProperty("adultFarePerPax")
    public void setAdultFarePerPax(String adultFarePerPax) {
        this.adultFarePerPax = adultFarePerPax;
    }

    @JsonProperty("baseAdultFarePerPax")
    public String getBaseAdultFarePerPax() {
        return baseAdultFarePerPax;
    }

    @JsonProperty("baseAdultFarePerPax")
    public void setBaseAdultFarePerPax(String baseAdultFarePerPax) {
        this.baseAdultFarePerPax = baseAdultFarePerPax;
    }

    @JsonProperty("changeCost")
    public String getChangeCost() {
        return changeCost;
    }

    @JsonProperty("changeCost")
    public void setChangeCost(String changeCost) {
        this.changeCost = changeCost;
    }

    @JsonProperty("fareId")
    public String getFareId() {
        return fareId;
    }

    @JsonProperty("fareId")
    public void setFareId(String fareId) {
        this.fareId = fareId;
    }

    @JsonProperty("fareBasisCode")
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    @JsonProperty("fareBasisCode")
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    @JsonProperty("fareClass")
    public String getFareClass() {
        return fareClass;
    }

    @JsonProperty("fareClass")
    public void setFareClass(String fareClass) {
        this.fareClass = fareClass;
    }

    @JsonProperty("fareAmtNoTaxes")
    public Object getFareAmtNoTaxes() {
        return fareAmtNoTaxes;
    }

    @JsonProperty("fareAmtNoTaxes")
    public void setFareAmtNoTaxes(Object fareAmtNoTaxes) {
        this.fareAmtNoTaxes = fareAmtNoTaxes;
    }

    @JsonProperty("taxPerPax")
    public String getTaxPerPax() {
        return taxPerPax;
    }

    @JsonProperty("taxPerPax")
    public void setTaxPerPax(String taxPerPax) {
        this.taxPerPax = taxPerPax;
    }

    @JsonProperty("discountPerPax")
    public String getDiscountPerPax() {
        return discountPerPax;
    }

    @JsonProperty("discountPerPax")
    public void setDiscountPerPax(String discountPerPax) {
        this.discountPerPax = discountPerPax;
    }

    @JsonProperty("paxCount")
    public Integer getPaxCount() {
        return paxCount;
    }

    @JsonProperty("paxCount")
    public void setPaxCount(Integer paxCount) {
        this.paxCount = paxCount;
    }

    @JsonProperty("applicableTaxes")
    public List<ApplicableTax> getApplicableTaxes() {
        return applicableTaxes;
    }

    @JsonProperty("applicableTaxes")
    public void setApplicableTaxes(List<ApplicableTax> applicableTaxes) {
        this.applicableTaxes = applicableTaxes;
    }

    @JsonProperty("miscFareInfos")
    public Object getMiscFareInfos() {
        return miscFareInfos;
    }

    @JsonProperty("miscFareInfos")
    public void setMiscFareInfos(Object miscFareInfos) {
        this.miscFareInfos = miscFareInfos;
    }

    @JsonProperty("includedExtas")
    public List<IncludedExta> getIncludedExtas() {
        return includedExtas;
    }

    @JsonProperty("includedExtas")
    public void setIncludedExtas(List<IncludedExta> includedExtas) {
        this.includedExtas = includedExtas;
    }

    @JsonProperty("pointsEarned")
    public PointsEarned getPointsEarned() {
        return pointsEarned;
    }

    @JsonProperty("pointsEarned")
    public void setPointsEarned(PointsEarned pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    @JsonProperty("pointsRedemption")
    public PointsRedemption__1 getPointsRedemption() {
        return pointsRedemption;
    }

    @JsonProperty("pointsRedemption")
    public void setPointsRedemption(PointsRedemption__1 pointsRedemption) {
        this.pointsRedemption = pointsRedemption;
    }

    @JsonProperty("ruleName")
    public String getRuleName() {
        return ruleName;
    }

    @JsonProperty("ruleName")
    public void setRuleName(String ruleName) {
        this.ruleName = ruleName;
    }

    @JsonProperty("ruleValue")
    public String getRuleValue() {
        return ruleValue;
    }

    @JsonProperty("ruleValue")
    public void setRuleValue(String ruleValue) {
        this.ruleValue = ruleValue;
    }

    @JsonProperty("fareRule")
    public FareRule getFareRule() {
        return fareRule;
    }

    @JsonProperty("fareRule")
    public void setFareRule(FareRule fareRule) {
        this.fareRule = fareRule;
    }

  

}
