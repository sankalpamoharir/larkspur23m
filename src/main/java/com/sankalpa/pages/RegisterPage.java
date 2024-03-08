package com.sankalpa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sankalpa.base.TestBase;

public class RegisterPage {
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement registerLink;
	@FindBy(xpath = "//input[@id=\"customer.firstName\"]")
	public WebElement firstName;
	@FindBy(xpath = "//input[@id=\"customer.lastName\"]")
	public WebElement lastName;
	@FindBy(xpath = "//input[@id=\"customer.address.street\"]")
	public WebElement address;
	@FindBy(xpath = "//input[@id=\"customer.address.city\"]")
	public WebElement city;
	@FindBy(xpath = "//input[@id=\"customer.address.state\"]")
	public WebElement state;
	@FindBy(xpath = "//input[@id=\"customer.address.zipCode\"]")
	public WebElement zipcode;
	@FindBy(xpath = "//input[@id=\"customer.phoneNumber\"]")
	public WebElement phoneNo;
	@FindBy(xpath = "//input[@id=\"customer.ssn\"]")
	public WebElement ssn;
	@FindBy(xpath = "//input[@id=\"customer.username\"]")
	public WebElement userName;
	@FindBy(xpath = "//input[@id=\"customer.password\"]")
	public WebElement password;
	@FindBy(xpath = "//input[@id=\"repeatedPassword\"]")
	public WebElement confmPassword;
	@FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input")
	public WebElement rgsbutton;
	@FindBy(xpath = "//span[@id=\"customer.lastName.errors\"]")
	public WebElement lastNameErr;
	public RegisterPage() {
		PageFactory.initElements(TestBase.keys.driver,this);
	}

	public void clickOnRegisterlink() {
		registerLink.click();
	}
	public void enterFirstName(String text) {
		firstName.sendKeys(text);
	}
	public void enterLastName(String text) {
		lastName.sendKeys(text);
	}
	public void enterAddress(String text) {
		address.sendKeys(text);
	}

	public void enterCity(String text) {
		city.sendKeys(text);
		
	}

	public void enterState(String text) {
		state.sendKeys(text);
		
	}

	public void enterZipcode(String text) {
		zipcode.sendKeys(text);
		
	}

	public void enterPhoneno(String text) {
		phoneNo.sendKeys(text);
		
	}

	public void enterSsn(String text) {
		ssn.sendKeys(text);
		
	}

	public void enterUserName(String text) {
		userName.sendKeys(text);
		
	}

	public void enterPassword(String text) {
		password.sendKeys(text);
		
	}

	public void enterCnfrmPassword(String text) {
		confmPassword.sendKeys(text);
		
	}

	public void clickregisterbttn() {
		rgsbutton.click();
		
	}

	public String getmsgofLastNameErr() {
	
		return lastNameErr.getText();
	}
}
