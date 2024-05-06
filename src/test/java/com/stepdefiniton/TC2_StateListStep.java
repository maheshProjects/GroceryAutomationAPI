package com.omrbranch.stepdefiniton;

import java.util.ArrayList;

import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.payload.address.AddressPayload;
import com.omrbranch.pojo.address.DatumState;
import com.omrbranch.pojo.address.StateList_Output;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC2_StateListStep extends BaseClass {

	AddressPayload pom = new AddressPayload();
	Response response;

	@Given("User add headers for StateList")
	public void user_add_headers_for_state_list() {
		initRestAssured();
		addHeader("accept", "application/json");

	}

	@When("User send {string} request for StateList endpoint")
	public void user_send_request_for_state_list_endpoint(String string) {

		response = usingGet(Endpoints.STATELIST);
		int statusCode = responseCode(response);
		TC1_LoginStep.globalDatas.setCode(statusCode);

	}

	@Then("User sholud verify the StateList response message matches {string} and saved state id")
	public void user_sholud_verify_the_state_list_response_message_matches_and_saved_state_id(String expectName) {

		StateList_Output stateList_Output = response.as(StateList_Output.class);

		ArrayList<DatumState> data = stateList_Output.getData();

		for (DatumState eachState : data) {

			String stateName = eachState.getName();

			if (stateName.equals(expectName)) {

				int stateId = eachState.getId();

				TC1_LoginStep.globalDatas.setCode(stateId);
				
				String stateIdText = String.valueOf(stateId);

				break;
			}

		}

	}
}