package com.omrbranch.stepdefiniton;

import org.junit.Assert;
import org.testng.AssertJUnit;

import io.cucumber.java.en.Then;

public class CommonStep {
	
	@Then("User should verify the status code is {int}")
	public void user_should_verify_the_status_code_is(int  expec) {

//	int actual = TC1_LoginStep.globalDatas.getCode();	
	
//	Assert.assertEquals("Verify Status code ", expec, actual);
		
	}

}
