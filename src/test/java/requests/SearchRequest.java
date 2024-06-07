
package requests;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import searchFlightsPackage.SearchCriterium;

@JsonInclude(Include.ALWAYS)
@JsonPropertyOrder({
    "cabinClass",
    "promoCode",
    "isDestMetro",
    "isOriginMetro",
    "paxInfo",
    "searchCriteria",
    "variant",
    "curr"
})

public class SearchRequest {

    @JsonProperty("cabinClass")
    private String cabinClass;
    @JsonProperty("promoCode")
    private String promoCode;
    @JsonProperty("isDestMetro")
    private Boolean isDestMetro;
    @JsonProperty("isOriginMetro")
    private Boolean isOriginMetro;
    @JsonProperty("paxInfo")
    private searchFlightsPackage.PaxInfo paxInfo;
    @JsonProperty("searchCriteria")
    private ArrayList<SearchCriterium> searchCriteria;
    @JsonProperty("variant")
    private String variant;
    @JsonProperty("curr")
    private String curr;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("cabinClass")
    public String getCabinClass() {
        return cabinClass;
    }

    @JsonProperty("cabinClass")
    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    @JsonProperty("promoCode")
    public String getPromoCode() {
        return promoCode;
    }

    @JsonProperty("promoCode")
    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    @JsonProperty("isDestMetro")
    public Boolean getIsDestMetro() {
        return isDestMetro;
    }

    @JsonProperty("isDestMetro")
    public void setIsDestMetro(Boolean isDestMetro) {
        this.isDestMetro = isDestMetro;
    }

    @JsonProperty("isOriginMetro")
    public Boolean getIsOriginMetro() {
        return isOriginMetro;
    }

    @JsonProperty("isOriginMetro")
    public void setIsOriginMetro(Boolean isOriginMetro) {
        this.isOriginMetro = isOriginMetro;
    }

    @JsonProperty("paxInfo")
    public searchFlightsPackage.PaxInfo getPaxInfo() {
        return paxInfo;
    }

    @JsonProperty("paxInfo")
    public void setPaxInfo(searchFlightsPackage.PaxInfo paxInfo2) {
        this.paxInfo = paxInfo2;
    }

    @JsonProperty("searchCriteria")
    public ArrayList<SearchCriterium> getSearchCriteria() {
        return searchCriteria;
    }

    @JsonProperty("searchCriteria")
    public void setSearchCriteria(ArrayList<SearchCriterium> search) {
        this.searchCriteria = search;
    }

    @JsonProperty("variant")
    public String getVariant() {
        return variant;
    }

    @JsonProperty("variant")
    public void setVariant(String variant) {
        this.variant = variant;
    }

    @JsonProperty("curr")
    public String getCurr() {
        return curr;
    }

    @JsonProperty("curr")
    public void setCurr(String curr) {
        this.curr = curr;
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
