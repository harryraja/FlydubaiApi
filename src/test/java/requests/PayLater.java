package requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.ALWAYS)
public class PayLater {

	
	    @Override
	public String toString() {
		return "PayLater [systemId=" + systemId + ", entityId=" + entityId + ", paymentId=" + paymentId + ", currency="
				+ currency + ", amount=" + amount + ", requestType=" + requestType + ", sessionId=" + sessionId
				+ ", threatMetrixPurl=" + threatMetrixPurl + ", threatMetrixIMGurl=" + threatMetrixIMGurl
				+ ", threatMetrixSCRIPTurl=" + threatMetrixSCRIPTurl + ", paymentMethod=" + paymentMethod + "]";
	}
		public String getSystemId() {
		return systemId;
	}
	public void setSystemId(String systemId) {
		this.systemId = systemId;
	}
	public String getEntityId() {
		return entityId;
	}
	public void setEntityId(String entityId) {
		this.entityId = entityId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public String getThreatMetrixPurl() {
		return threatMetrixPurl;
	}
	public void setThreatMetrixPurl(String threatMetrixPurl) {
		this.threatMetrixPurl = threatMetrixPurl;
	}
	public String getThreatMetrixIMGurl() {
		return threatMetrixIMGurl;
	}
	public void setThreatMetrixIMGurl(String threatMetrixIMGurl) {
		this.threatMetrixIMGurl = threatMetrixIMGurl;
	}
	public String getThreatMetrixSCRIPTurl() {
		return threatMetrixSCRIPTurl;
	}
	public void setThreatMetrixSCRIPTurl(String threatMetrixSCRIPTurl) {
		this.threatMetrixSCRIPTurl = threatMetrixSCRIPTurl;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
		String systemId= "FZPSS";
	    String entityId= "";
	    String paymentId= "";
	    String currency= "";
	    String amount= "";
	    String requestType= "TRAVEL";
	    String sessionId= "";
	    String threatMetrixPurl= "https://uatpayments.flydubai.com/fp/clear.png?org_id=1snn5n9w&amp;session_id=flydubai4d792948cfe1a4787990c47b1c5d37529&amp;m=1";
	    String threatMetrixIMGurl= "https://uatpayments.flydubai.com/fp/clear.png?org_id=1snn5n9w&amp;session_id=flydubaid792948cfe1a4787990c47b1c5d37529&amp;m=2";
	    String threatMetrixSCRIPTurl= "https://uatpayments.flydubai.com/fp/check.js?org_id=1snn5n9w&amp;session_id=flydubaid792948cfe1a4787990c47b1c5d37529";
	    String paymentMethod= "PAYLATER";
	
}
