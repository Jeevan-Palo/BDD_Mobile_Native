package com.palo.techtest.StepDefinition;

import com.palo.techtest.StepLibrary.SearchProductLibrary;

import cucumber.api.java.en.Given;

public class SearchProduct {

	@Given("^user should able to enter \"([^\"]*)\" in search textbox$")
	public void user_should_able_to_enter_in_search_textbox(String arg1) throws Throwable {
		SearchProductLibrary.searchValue(arg1);

	}

}
