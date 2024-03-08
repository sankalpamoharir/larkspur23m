package com.sankalpa.stepdefinitions;

import com.sankalpa.MyKeywords;

import io.cucumber.java.en.Given;

public class RegistrationSteps {
	@Given("Firefox Browser is open")
	public void launchingBrowser() {
		MyKeywords keys = new MyKeywords();
		keys.launchingBrowser("FireFox");
	}
	@Given("Firefox Browser is open")
	public void launchingUrl() {
		MyKeywords keys = new MyKeywords();
		keys.launchURL(null);;
	}


}
