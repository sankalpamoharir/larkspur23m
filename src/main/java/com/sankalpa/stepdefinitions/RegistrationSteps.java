package com.sankalpa.stepdefinitions;

import org.testng.Assert;

import com.sankalpa.Configer;
import com.sankalpa.MyKeywords;
import com.sankalpa.pages.RegisterPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationSteps {
	MyKeywords keys = new MyKeywords();
	Configer conf = new Configer();

	@Given("Firefox Browser is open")
	public void launchingBrowser() {

		keys.launchingBrowser(conf.getBrowserName());
	}

	@And("Application is launched successfully in browser")
	public void launchingUrl() {
		
		keys.launchURL(conf.getAppUrl());
	}

	@When("User fills the entire form excluding last name")
	public void fillRegistrationFormWithoutLastname() {

		RegisterPage resg = new RegisterPage();
		resg.clickOnRegisterlink();
		resg.enterFirstName("Sankalpa");
		resg.enterAddress("Pimpri");
		resg.enterCity("Pune");
		resg.enterState("Maha");
		resg.enterZipcode("444607");
		resg.enterPhoneno("1234567891");
		resg.enterSsn("12365478");
		resg.enterUserName("Sankalpa123");
		resg.enterPassword("sank123");
		resg.enterCnfrmPassword("sank123");
	}

	@And("Click on submit button")
	public void clickOnRegistrationButtn() {
		RegisterPage resg = new RegisterPage();
		resg.clickregisterbttn();
	}

	@Then("User should get error message")
	public void checkingErrMsg() {
		String actualmsg = "Last name is required.";
		RegisterPage resg = new RegisterPage();
		String errorMsg = resg.getmsgofLastNameErr();
		Assert.assertEquals(actualmsg, errorMsg);

	}

}
