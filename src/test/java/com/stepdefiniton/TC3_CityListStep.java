package com.omrbranch.stepdefiniton;

import java.util.ArrayList;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.payload.address.AddressPayload;
import com.omrbranch.pojo.address.City_Output;
import com.omrbranch.pojo.address.Datum_OutPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class TC3_CityListStep extends BaseClass {
	AddressPayload pom = new AddressPayload();
	Response response;

	@Given("User add header for to get CityList")
	public void user_add_header_for_to_get_city_list() {
		initRestAssured();
		java.util.List<Header> listheader = new ArrayList();

		Header h1 = new Header("accept", "application/json");
		Header h2 = new Header("Content-Type", "application/json");

		listheader.add(h1);
		listheader.add(h2);

		Headers headers = new Headers(listheader);
		addHeaders(headers);

	}

	@When("User add request body state id for get CityList")
	public void user_add_request_body_state_id_for_get_city_list() {

		addBody(pom.getPayloadCity(TC1_LoginStep.globalDatas.getCityId()));

	}

	@When("User send  {string} request for CityList endpoint")
	public void user_send_request_for_city_list_endpoint(String string) {

		response = usingPost(Endpoints.CITYLIST);
	}

	@Then("User verify the status code is {int}")
	public void user_verify_the_status_code_is(Integer int1) {

		int statusCode = responseCode(response);

		TC1_LoginStep.globalDatas.setCityId(statusCode);
	}

	@Then("User verify the CityList response message matches {string} and saved city id")
	public void user_verify_the_city_list_response_message_matches_and_saved_city_id(String string) {

		City_Output city_Output = response.as(City_Output.class);
		ArrayList<Datum_OutPojo> data = city_Output.getData();

		for (Datum_OutPojo eachCityList : data) {
			String cityName = eachCityList.getName();

			if (cityName.equals("Avadi")) {
				int cityID = eachCityList.getId();
				System.out.println("Avadi city ID is");
				System.out.println(cityID);

			}

		}
	}

}
