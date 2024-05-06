package com.omrbranch.stepdefiniton;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Assert;

import com.loginpojo.Login_Output;
import com.omrbranch.base.BaseClass;
import com.omrbranch.endpoints.Endpoints;
import com.omrbranch.globaldatas.GlobalDatas;
import com.omrbranch.payload.address.AddressPayload;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

public class TC1_LoginStep extends BaseClass {

	AddressPayload pom = new AddressPayload();

	Response response;

	static GlobalDatas globalDatas = new GlobalDatas();

	@Given("User add header")

	public void user_add_header() {

		// addHeader("accept", "application/json");
	}

	@When("User add basic authentication for login")
	public void user_add_basic_authentication_for_login() throws FileNotFoundException, IOException {
		// initRestAssured();
		// addBasicAuth(getPropertyFileValue("username"),
		// getPropertyFileValue("password"));

	}

	@When("User send {string} request for login endpoint")
	public void user_send_request_for_login_endpoint(String statuscode) {

		// response = usingPost(Endpoints.LOGIN);
		//
//		int code = responseCode(response);
		// globalDatas.setCode(code);

	}

	@Then("User  should verify the login response body firstName present as {string} and get the logtoken")
	public void user_should_verify_the_login_response_body_first_name_present_as_and_get_the_logtoken(
			String expectName) {
		// Login_Output as = response.as(Login_Output.class);
		// String actualName = as.getData().getFirst_name();
		// Assert.assertEquals("Verify the first name ", expectName, actualName);
		// String logtoken = as.getData().getLogtoken();

	}

}
