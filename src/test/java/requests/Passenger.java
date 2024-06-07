package requests;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
@JsonInclude(Include.ALWAYS)
public class Passenger {

   
	private String passengerId= "-1";
	public String getPassengerId() {
		return passengerId;
	}
	public void setPassengerId(String passengerId) {
		this.passengerId = passengerId;
	}
	public String getPassengerType() {
		return passengerType;
	}
	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Passenger [passengerId=" + passengerId + ", passengerType=" + passengerType + ", title=" + title
				+ ", firstName=" + firstName + ", middleName=" + middleName + ", lastName=" + lastName + ", dob=" + dob
				+ ", isPrimaryPassenger=" + isPrimaryPassenger + ", emailAddress=" + emailAddress
				+ ", alternateEmailAddress=" + alternateEmailAddress + ", nationality=" + nationality
				+ ", documentNumber=" + documentNumber + ", documentIssueDate=" + documentIssueDate
				+ ", documentExpiryDate=" + documentExpiryDate + ", passportIssuingCountry=" + passportIssuingCountry
				+ ", countryOfResidence=" + countryOfResidence + ", contactMobileContryCode=" + contactMobileContryCode
				+ ", contactMobileNumber=" + contactMobileNumber + ", alternatePhoneCountryCode="
				+ alternatePhoneCountryCode + ", alternatePhoneNumber=" + alternatePhoneNumber
				+ ", alternatePhoneNumberField=" + alternatePhoneNumberField + ", socialMediaMobileContryCode="
				+ socialMediaMobileContryCode + ", socialMediaMobileNumber=" + socialMediaMobileNumber
				+ ", contactMobileNumberField=" + contactMobileNumberField + ", contactTelephoneContryCode="
				+ contactTelephoneContryCode + ", contactTelephoneNumber=" + contactTelephoneNumber
				+ ", contactTelephoneField=" + contactTelephoneField + ", accompanyingAdult=" + accompanyingAdult
				+ ", memberId=" + memberId + ", tierId=" + tierId + ", tierName=" + tierName + ", deleteEnabled="
				+ deleteEnabled + ", isMinor=" + isMinor + ", ffpEnabled=" + ffpEnabled + ", tierInfo=" + tierInfo
				+ "]";
	}
	public Boolean getIsPrimaryPassenger() {
		return isPrimaryPassenger;
	}
	public void setIsPrimaryPassenger(Boolean isPrimaryPassenger) {
		this.isPrimaryPassenger = isPrimaryPassenger;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getAlternateEmailAddress() {
		return alternateEmailAddress;
	}
	public void setAlternateEmailAddress(String alternateEmailAddress) {
		this.alternateEmailAddress = alternateEmailAddress;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getDocumentNumber() {
		return documentNumber;
	}
	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}
	public String getDocumentIssueDate() {
		return documentIssueDate;
	}
	public void setDocumentIssueDate(String documentIssueDate) {
		this.documentIssueDate = documentIssueDate;
	}
	public String getDocumentExpiryDate() {
		return documentExpiryDate;
	}
	public void setDocumentExpiryDate(String documentExpiryDate) {
		this.documentExpiryDate = documentExpiryDate;
	}
	public String getPassportIssuingCountry() {
		return passportIssuingCountry;
	}
	public void setPassportIssuingCountry(String passportIssuingCountry) {
		this.passportIssuingCountry = passportIssuingCountry;
	}
	public String getCountryOfResidence() {
		return countryOfResidence;
	}
	public void setCountryOfResidence(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}
	public String getContactMobileContryCode() {
		return contactMobileContryCode;
	}
	public void setContactMobileContryCode(String contactMobileContryCode) {
		this.contactMobileContryCode = contactMobileContryCode;
	}
	public String getContactMobileNumber() {
		return contactMobileNumber;
	}
	public void setContactMobileNumber(String contactMobileNumber) {
		this.contactMobileNumber = contactMobileNumber;
	}
	public String getAlternatePhoneCountryCode() {
		return alternatePhoneCountryCode;
	}
	public void setAlternatePhoneCountryCode(String alternatePhoneCountryCode) {
		this.alternatePhoneCountryCode = alternatePhoneCountryCode;
	}
	public String getAlternatePhoneNumber() {
		return alternatePhoneNumber;
	}
	public void setAlternatePhoneNumber(String alternatePhoneNumber) {
		this.alternatePhoneNumber = alternatePhoneNumber;
	}
	public String getAlternatePhoneNumberField() {
		return alternatePhoneNumberField;
	}
	public void setAlternatePhoneNumberField(String alternatePhoneNumberField) {
		this.alternatePhoneNumberField = alternatePhoneNumberField;
	}
	public String getSocialMediaMobileContryCode() {
		return socialMediaMobileContryCode;
	}
	public void setSocialMediaMobileContryCode(String socialMediaMobileContryCode) {
		this.socialMediaMobileContryCode = socialMediaMobileContryCode;
	}
	public String getSocialMediaMobileNumber() {
		return socialMediaMobileNumber;
	}
	public void setSocialMediaMobileNumber(String socialMediaMobileNumber) {
		this.socialMediaMobileNumber = socialMediaMobileNumber;
	}
	public String getContactMobileNumberField() {
		return contactMobileNumberField;
	}
	public void setContactMobileNumberField(String contactMobileNumberField) {
		this.contactMobileNumberField = contactMobileNumberField;
	}
	public String getContactTelephoneContryCode() {
		return contactTelephoneContryCode;
	}
	public void setContactTelephoneContryCode(String contactTelephoneContryCode) {
		this.contactTelephoneContryCode = contactTelephoneContryCode;
	}
	public String getContactTelephoneNumber() {
		return contactTelephoneNumber;
	}
	public void setContactTelephoneNumber(String contactTelephoneNumber) {
		this.contactTelephoneNumber = contactTelephoneNumber;
	}
	public String getContactTelephoneField() {
		return contactTelephoneField;
	}
	public void setContactTelephoneField(String contactTelephoneField) {
		this.contactTelephoneField = contactTelephoneField;
	}
	public String getAccompanyingAdult() {
		return accompanyingAdult;
	}
	public void setAccompanyingAdult(String accompanyingAdult) {
		this.accompanyingAdult = accompanyingAdult;
	}
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getTierId() {
		return tierId;
	}
	public void setTierId(String tierId) {
		this.tierId = tierId;
	}
	public String getTierName() {
		return tierName;
	}
	public void setTierName(String tierName) {
		this.tierName = tierName;
	}
	public String getDeleteEnabled() {
		return deleteEnabled;
	}
	public void setDeleteEnabled(String deleteEnabled) {
		this.deleteEnabled = deleteEnabled;
	}
	public String getIsMinor() {
		return isMinor;
	}
	public void setIsMinor(String isMinor) {
		this.isMinor = isMinor;
	}
	public String getFfpEnabled() {
		return ffpEnabled;
	}
	public void setFfpEnabled(String ffpEnabled) {
		this.ffpEnabled = ffpEnabled;
	}
	public String getTierInfo() {
		return tierInfo;
	}
	public void setTierInfo(String tierInfo) {
		this.tierInfo = tierInfo;
	}
	private String passengerType= "Adult";
	private String title= null;
	private String firstName= null;
	private String middleName= "";
	private String lastName= null;
	private String dob= null;
	private Boolean isPrimaryPassenger= null;
	private String emailAddress= null;
	private String alternateEmailAddress= null;
	private String nationality= null;
	private String documentNumber= null;
	private String documentIssueDate= null;
	private String documentExpiryDate= null;
	private String passportIssuingCountry= null;
	private String countryOfResidence= null;
	private String contactMobileContryCode= null;
	private String contactMobileNumber= null;
	private String alternatePhoneCountryCode= null;
	private String alternatePhoneNumber= null;
	private String alternatePhoneNumberField= null;
	private String socialMediaMobileContryCode= null;
	private String socialMediaMobileNumber= null;
	private String contactMobileNumberField= null;
	private String contactTelephoneContryCode= null;
	private String contactTelephoneNumber= null;
	private String contactTelephoneField= null;
	private String accompanyingAdult= null;
	private String memberId= null;
	private String tierId= null;
	private String tierName= null;
	private String deleteEnabled= null;
	private String isMinor= null;
	private String ffpEnabled= null;
	private String tierInfo= null;
}
