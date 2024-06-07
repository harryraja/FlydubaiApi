
package com.searchflightsResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "amount",
    "taxCode",
    "taxId"
})

public class ApplicableTax {

    @Override
	public String toString() {
		return "ApplicableTax [amount=" + amount + ", taxCode=" + taxCode + ", taxId=" + taxId
				+"]";
	}

	@JsonProperty("amount")
    private String amount;
    @JsonProperty("taxCode")
    private String taxCode;
    @JsonProperty("taxId")
    private String taxId;
   
    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("taxCode")
    public String getTaxCode() {
        return taxCode;
    }

    @JsonProperty("taxCode")
    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }

    @JsonProperty("taxId")
    public String getTaxId() {
        return taxId;
    }

    @JsonProperty("taxId")
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

 
}
