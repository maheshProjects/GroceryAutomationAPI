package com.omrbranch.stepdefiniton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC4_AddressStep {

	@Given("User add headers and bearer authorization for accessing addUserAddress endpoint")
	public void user_add_headers_and_bearer_authorization_for_accessing_add_user_address_endpoint() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User add request body to add new address {string},{string},{string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_add_request_body_to_add_new_address_and(String string, String string2, String string3,
			String string4, String string5, String string6, String string7, String string8, String string9,
			String string10) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User send {string} request to addUserAddress endpoint")
	public void user_send_request_to_add_user_address_endpoint(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the posted addUserAddress status code is {int}")
	public void user_should_verify_the_posted_add_user_address_status_code_is(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the posted addUserAddress response body success message matches {string} and get the address id saved")
	public void user_should_verify_the_posted_add_user_address_response_body_success_message_matches_and_get_the_address_id_saved(
			String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("User add headers and bearer authorization for accessing updateUserAddress endpoint")
	public void user_add_headers_and_bearer_authorization_for_accessing_update_user_address_endpoint() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User add request body with address id, state id, city id and country id to update address {string},{string},{string},{string},{string},{string} and {string}")
	public void user_add_request_body_with_address_id_state_id_city_id_and_country_id_to_update_address_and(
			String string, String string2, String string3, String string4, String string5, String string6,
			String string7) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User send {string} request to updateUserAddress endpoint")
	public void user_send_request_to_update_user_address_endpoint(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the updated UserAddress status code is {int}")
	public void user_should_verify_the_updated_user_address_status_code_is(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the updated UserAddress response body success message matches {string}")
	public void user_should_verify_the_updated_user_address_response_body_success_message_matches(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("User add headers and bearer authorization for accessing getUserAddress endpoint")
	public void user_add_headers_and_bearer_authorization_for_accessing_get_user_address_endpoint() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User send {string} request to getUserAddress endpoint")
	public void user_send_request_to_get_user_address_endpoint(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the getUserAddress status code is {int}")
	public void user_should_verify_the_get_user_address_status_code_is(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the getUserAddress response body countryname present as {string}")
	public void user_should_verify_the_get_user_address_response_body_countryname_present_as(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Given("User add headers and bearer authorization for accessing deleteAddress endpoint")
	public void user_add_headers_and_bearer_authorization_for_accessing_delete_address_endpoint() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User add request body of address id to delete address")
	public void user_add_request_body_of_address_id_to_delete_address() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("User send {string} request to deleteAddress endpoint")
	public void user_send_request_to_delete_address_endpoint(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the deleteAddress status code is {int}")
	public void user_should_verify_the_delete_address_status_code_is(Integer int1) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("User should verify the deleteAddress response body success message {string}")
	public void user_should_verify_the_delete_address_response_body_success_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
