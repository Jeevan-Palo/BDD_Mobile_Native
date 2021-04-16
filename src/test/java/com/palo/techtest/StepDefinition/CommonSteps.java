package com.palo.techtest.StepDefinition;

import com.palo.techtest.StepLibrary.CommonLibrary;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonSteps extends CommonLibrary {
	@Given("^Launching the browser$")
	public void launching_the_browser() throws Throwable {
		CommonLibrary.initiateBrowser();
	}

	@Then("^close browser$")
	public void close_browser() throws Throwable {
		CommonLibrary.closeBrowser();
	}

	@After
	public void tearDown(Scenario scenario) throws Exception {

		if (scenario.isFailed()) {
			getscreenshotEmbed("TestFail", scenario);

		}

	}

}
