package tests;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.testng.annotations.Test;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.searchflightsResponse.Example;
import com.searchflightsResponse.Flight;
import com.searchflightsResponse.SelectedFare;
import config.RequestConfig;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import io.restassured.response.Response;
import requests.AddFlight;
import requests.Passenger;
import requests.PassengerList;
import requests.PayLater;
import requests.Payment;
import requests.Preferences;
import requests.Prepare;
import searchFlightsPackage.FlightSearchRequest;
import searchFlightsPackage.PaxInfo;
import searchFlightsPackage.SearchCriterium;


public class ApiTests {

	String securityToken;
	Flight flight;
	FlightSearchRequest request;
	String optionalExtrasResponse;
	List<Flight> flights;
	String PCI_PostUrl;
	String pciSessionUrl;
	String paymentId,currency,amount,sessionId,threatMetrixPurl,threatMetrixSCRIPTurl,threatMetrixIMGurl;

	@Test
	public void flightSearchTest() throws JsonProcessingException {

		RestAssuredConfig newConfig = RestAssured.config();
		EncoderConfig encoderconfig = new EncoderConfig();
		newConfig.encoderConfig(encoderconfig.appendDefaultContentCharsetToContentTypeIfUndefined(false));
		newConfig.httpClient(HttpClientConfig.httpClientConfig().setParam("http.connection.timeout", 30000));

		// paxinfo
		PaxInfo paxInfo = new PaxInfo();
		paxInfo.setAdultCount(1);
		paxInfo.setChildCount(0);
		paxInfo.setInfantCount(0);

		// search criteria
		SearchCriterium criteria = new SearchCriterium();
		criteria.setDate("06/28/2024 12:00 AM");
		criteria.setDest("PRG");
		criteria.setDirection("outBound");
		criteria.setOrigin("DXB");
		criteria.setIsOriginMetro(true);
		criteria.setIsDestMetro(false);

		// request formation
		FlightSearchRequest req = new FlightSearchRequest();
		req.setCabinClass("Economy");
		req.setPromoCode("TestTest");
		req.setIsDestMetro(false);
		req.setIsOriginMetro(true);
		req.setVariant("1");
		req.setCurr("INR");
		req.setPaxInfo(paxInfo);
		List<SearchCriterium> searchCriteriumObj = new ArrayList<SearchCriterium>();
		searchCriteriumObj.add(criteria);
		req.setSearchCriteria(searchCriteriumObj);

		// header formation
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("appID", "Desktop");
		headers.put("test", "test");
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept", "/");
		headers.put("User-Agent", "/");

		ObjectMapper obj = new ObjectMapper();
		obj.setSerializationInclusion(JsonInclude.Include.ALWAYS);

		// sending request
		Response response = RestAssured.given().config(newConfig).relaxedHTTPSValidation().headers(headers)
				.body(obj.writeValueAsString(req)).when().post("https://qa1-flights2.np.flydubai.com/api/flights/1")
				.then().extract().response();
		
		System.out.println(response.asPrettyString());

		securityToken = response.header("SecurityToken");

		Example example = response.getBody().as(Example.class);
		List<Flight> allflights = example.getSegments().get(0).getFlights();
		Flight flightt = example.getSegments().get(0).getFlights().get(0);

		flight = flightt;
		// System.out.println(flight);

		com.searchflightsResponse.FareType faretype = example.getSegments().get(0).getFlights().get(0).getFareTypes()
				.get(0);
		// List<com.searchflightsResponse.FareType> faretypes =
		// example.getSegments().get(0).getFlights().get(0).getFareTypes();
		SelectedFare selectedFare = new SelectedFare();
		selectedFare.setBadges(faretype.getBadges());
		selectedFare.setCabin(faretype.getCabin());
		selectedFare.setContainsCircularFlight(faretype.getContainsCircularFlight());
		selectedFare.setContainsConnectionFlight(faretype.getContainsConnectionFlight());
		selectedFare.setFare(faretype.getFare());
		selectedFare.setFareCarrier(faretype.getFareCarrier());
		selectedFare.setFareInformation(faretype.getFareInformation());
		selectedFare.setFareTypeID(faretype.getFareTypeID());
		selectedFare.setFareTypeName(faretype.getFareTypeName());
		selectedFare.setHashCode(faretype.getHashCode());
		selectedFare.setIncludes(faretype.getIncludes());
		selectedFare.setIsSoldOut(faretype.getIsSoldOut());
		selectedFare.setLfId(faretype.getLfId());
		selectedFare.setPfIds(faretype.getPfIds());
		selectedFare.setRoute(faretype.getRoute());
		selectedFare.setSeatsLeft(faretype.getSeatsLeft());
		selectedFare.setSecureHash(faretype.getSecureHash());
		selectedFare.setTicketDesignator(null);

		flightt.setSelectedFare(selectedFare);

		allflights.add(flightt);

		this.flights = allflights;

		this.request = req;
	}
	
	

	@Test(dependsOnMethods = "flightSearchTest")
	public void addFlightTest() throws Exception {

		// header formation
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("appID", "Desktop");
		headers.put("SecurityToken", securityToken);
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept", "/");
		headers.put("User-Agent", "/");

		Preferences preferences = new Preferences();
		preferences.setIsReadyToSignUpForOffers("true");

		AddFlight addflight = new AddFlight();
		addflight.setCurrency("");
		addflight.setPreferences(preferences);

		ArrayList<PassengerList> passengerList = new ArrayList<PassengerList>();

		addflight.setPassengerList(passengerList);

		ArrayList<Flight> list = new ArrayList<Flight>();
		list.add(flights.get(0));
		// selectedFlights
		addflight.setSelectedFlights(list);
		// search request
		addflight.setSearchRequest(request);

		ObjectMapper mapper = new ObjectMapper();

		mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

		mapper.setSerializationInclusion(Include.NON_NULL);

		System.out.println(mapper.writeValueAsString(addflight));

		Response response = RestAssured.given().headers(headers).body(mapper.writeValueAsString(addflight)).when()
				.post("https://qa1-flights2.np.flydubai.com/api/itinerary/AddFlight").then().extract().response();

		System.out.println(response.asPrettyString());
		optionalExtrasResponse = response.asPrettyString();

	}
	
	

	@Test(dependsOnMethods = "addFlightTest")
	public void optionalExtrasTest() throws Exception {

		// header formation
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("appID", "Desktop");
		headers.put("SecurityToken", securityToken);
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept", "/");
		headers.put("User-Agent", "/");

		Response response = RestAssured.given().headers(headers).body(optionalExtrasResponse).when()
				.post("https://qa1-flights2.np.flydubai.com/api/optionalExtras").then().extract().response();

		System.out.println(response.asPrettyString());

	}
	
	

	@Test(dependsOnMethods = "addFlightTest")
	public void prepareTest() throws Exception {

		// header formation
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("appID", "Desktop");
		headers.put("SecurityToken", securityToken);
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept", "/");
		headers.put("User-Agent", "/");

		Preferences preferences = new Preferences();
		preferences.setIsReadyToSignUpForOffers("true");

		Prepare addflight = new Prepare();
		addflight.setItineraryAction("3");

		ArrayList<PassengerList> passengerList = new ArrayList<PassengerList>();
		addflight.setPassengerList(passengerList);

		addflight.setCurrency("");

		addflight.setPreferences(preferences);

		ArrayList<Flight> list = new ArrayList<Flight>();
		list.add(flights.get(0));
		// selectedFlights
		addflight.setSelectedFlights(list);
		// search request
		addflight.setSearchRequest(request);

		ObjectMapper mapper = new ObjectMapper();

		mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

		mapper.setSerializationInclusion(Include.NON_NULL);

		System.out.println(mapper.writeValueAsString(addflight));

		Response response = RestAssured.given().headers(headers).body(mapper.writeValueAsString(addflight)).when()
				.post("https://qa1-flights2.np.flydubai.com/api/itinerary/prepare").then().extract().response();

		System.out.println(response.asPrettyString());

	}
	
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test(dependsOnMethods = "addFlightTest")
	public void paymentTest() throws Exception {

		// header formation
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("appID", "Desktop");
		headers.put("SecurityToken", securityToken);
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept", "/");
		headers.put("User-Agent", "/");

		Preferences preferences = new Preferences();
		preferences.setIsReadyToSignUpForOffers("true");

		Payment addflight = new Payment();
		addflight.setItineraryAction("3");
		addflight.setLocale("en");
		addflight.setConfirmUrl(RequestConfig.basePath + "/api/itinerary/confirm");

		Passenger passenger = new Passenger();
		passenger.setPassengerId("-1");
		passenger.setPassengerType("Adult");
		passenger.setTitle("Mr");
		passenger.setFirstName("test1");
		passenger.setLastName("test2");
		passenger.setEmailAddress("test@gmail.com");
		passenger.setContactMobileContryCode("961");
		passenger.setContactMobileNumber("34343434");
		passenger.setIsPrimaryPassenger(true);
		passenger.setNationality("");
		passenger.setPassportIssuingCountry("");
		passenger.setCountryOfResidence("");

		Passenger passenger2 = new Passenger();
		passenger2.setPassengerId("-1");
		passenger2.setPassengerType("Adult");
		passenger2.setTitle("Mr");
		passenger2.setFirstName("tesdsft1");
		passenger2.setLastName("testsdf2");
		passenger2.setEmailAddress("tessft@gmail.com");
		passenger2.setContactMobileContryCode("961");
		passenger2.setContactMobileNumber("34343334");
		passenger2.setIsPrimaryPassenger(true);
		passenger2.setNationality("");
		passenger2.setPassportIssuingCountry("");
		passenger2.setCountryOfResidence("");

		ArrayList passengerList = new ArrayList();
		passengerList.add(passenger);
		passengerList.add(passenger2);
		addflight.setPassengerList(passengerList);

		addflight.setCurrency("");

		addflight.setPreferences(preferences);

		ArrayList<Flight> list = new ArrayList<Flight>();
		list.add(flights.get(0));
		// selectedFlights
		addflight.setSelectedFlights(list);
		// search request
		addflight.setSearchRequest(request);

		ObjectMapper mapper = new ObjectMapper();

		mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

		mapper.setSerializationInclusion(Include.NON_NULL);

		System.out.println(mapper.writeValueAsString(addflight));

		Response response = RestAssured.given().headers(headers).body(mapper.writeValueAsString(addflight)).when()
				.post("https://qa1-flights2.np.flydubai.com/api/itinerary/Payment").then().extract().response();

		System.out.println(response.asPrettyString());

		String pciURLtoRedirect = response.jsonPath().get("pciURLtoRedirect");
		pciSessionUrl = pciURLtoRedirect.replace("paymentui/", "payments/getSessionDetails");
		PCI_PostUrl=pciURLtoRedirect.replace("paymentui/","payments/0.1/cards");
	}
	
	

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Test(dependsOnMethods = "paymentTest")
	public void getPciSessionTest() throws JsonProcessingException {
		// header formation
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("appID", "Desktop");
		headers.put("SecurityToken", securityToken);
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept", "/");
		headers.put("User-Agent", "/");

		Preferences preferences = new Preferences();
		preferences.setIsReadyToSignUpForOffers("true");

		Payment addflight = new Payment();
		addflight.setItineraryAction("3");
		addflight.setLocale("en");
		addflight.setConfirmUrl(RequestConfig.basePath + "/api/itinerary/confirm");

		Passenger passenger = new Passenger();
		passenger.setPassengerId("-1");
		passenger.setPassengerType("Adult");
		passenger.setTitle("Mr");
		passenger.setFirstName("test1");
		passenger.setLastName("test2");
		passenger.setEmailAddress("test@gmail.com");
		passenger.setContactMobileContryCode("961");
		passenger.setContactMobileNumber("34343434");
		passenger.setIsPrimaryPassenger(true);
		passenger.setNationality("");
		passenger.setPassportIssuingCountry("");
		passenger.setCountryOfResidence("");

		
		ArrayList passengerList = new ArrayList();
		passengerList.add(passenger);
		addflight.setPassengerList(passengerList);

		addflight.setCurrency("");

		addflight.setPreferences(preferences);

		ArrayList<Flight> list = new ArrayList<Flight>();
		list.add(flights.get(0));
		// selectedFlights
		addflight.setSelectedFlights(list);
		// search request
		addflight.setSearchRequest(request);

		ObjectMapper mapper = new ObjectMapper();

		mapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);

		mapper.setSerializationInclusion(Include.NON_NULL);

		System.out.println(mapper.writeValueAsString(addflight));

		Response response = RestAssured.given().headers(headers).body(mapper.writeValueAsString(addflight)).when()
				.get(pciSessionUrl).then().extract().response();

		System.out.println(response.asPrettyString());
		
		paymentId=response.jsonPath().get("paymentId");
		currency=response.jsonPath().get("currency");
		amount=response.jsonPath().get("amount");
		sessionId=response.jsonPath().get("sessionId");
		threatMetrixPurl=response.jsonPath().get("threatMetrixPurl");
		threatMetrixIMGurl=response.jsonPath().get("threatMetrixIMGurl");
		threatMetrixSCRIPTurl=response.jsonPath().get("threatMetrixSCRIPTurl");
		
	}
	
	
	
	@Test(dependsOnMethods = "getPciSessionTest")
	public void payLaterTests() throws JsonProcessingException
	{
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-Type", "application/json");
		headers.put("appID", "Desktop");
		headers.put("SecurityToken", securityToken);
		headers.put("Accept-Encoding", "gzip, deflate, br");
		headers.put("Accept", "/");
		headers.put("User-Agent", "/");
		
		PayLater paylater=new PayLater();
		paylater.setCurrency(currency);
		paylater.setPaymentId(paymentId);
		paylater.setSessionId(sessionId);
		paylater.setAmount(amount);
		paylater.setSystemId("FZPSS");
		paylater.setEntityId("");
		paylater.setRequestType("TRAVEL");
		paylater.setPaymentMethod("PAYLATER");
		paylater.setThreatMetrixPurl("https://uatpayments.flydubai.com/fp/clear.png?org_id=1snn5n9w&amp;session_id=flydubai4d792948cfe1a4787990c47b1c5d37529&amp;m=1");
		paylater.setThreatMetrixIMGurl("https://uatpayments.flydubai.com/fp/clear.png?org_id=1snn5n9w&amp;session_id=flydubaid792948cfe1a4787990c47b1c5d37529&amp;m=2");
		paylater.setThreatMetrixSCRIPTurl("https://uatpayments.flydubai.com/fp/check.js?org_id=1snn5n9w&amp;session_id=flydubaid792948cfe1a4787990c47b1c5d37529");
	   
		ObjectMapper mapper=new ObjectMapper();
		mapper.writeValueAsString(paylater);
		
		Response response = RestAssured.given().headers(headers).body(mapper.writeValueAsString(paylater)).when()
				.post(PCI_PostUrl).then().extract().response();

		System.out.println(response.asPrettyString());
		
	}
	
}
