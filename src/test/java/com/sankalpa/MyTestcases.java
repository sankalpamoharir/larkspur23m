package com.sankalpa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestcases {
	@Test
	public void verifyingLastName() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Last name is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.LASTNAMEERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingFirstName() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "First name is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.FIRSTNAMEERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingAddress() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Address is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.ADDRESSERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingCity() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "City is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.CITYERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingState() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "State is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.STATEERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingZipcode() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Zip Code is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.ZIPCODEERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingPhoneNoRequirement() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Welcome Sankalpa1";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa1");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.PHONENOREQ);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingSSN() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Social Security Number is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.SSNERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingUserName() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Username is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.USENAMEERR);
		Assert.assertEquals(actualmsg, errorMsg);
	}

	@Test
	public void verifyingPasswrd() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Password is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.CONFMPASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.PASSWORDERR);
		Assert.assertEquals(actualmsg, errorMsg);

	}

	@Test
	public void verifyingCnfmPassword() {
		MyKeywords keys = new MyKeywords();
		String actualmsg = "Password confirmation is required.";
		keys.launchingBrowser("Firefox");
		keys.launchURL(Config.APPURL);
		keys.click(Locator.REGISTERLINK);
		keys.sendkeys(Locator.FIRSTNAME, "Sankalpa");
		keys.sendkeys(Locator.LASTNAME, "Moharir");
		keys.sendkeys(Locator.ADDRESS, "Sai Nagar");
		keys.sendkeys(Locator.CITY, "Pune");
		keys.sendkeys(Locator.STATE, "Maharashtra");
		keys.sendkeys(Locator.ZIPCDE, "444607");
		keys.sendkeys(Locator.PHONENO, "8984562323");
		keys.sendkeys(Locator.SSN, "d460012");
		keys.sendkeys(Locator.USERNAME, "Sankalpa123");
		keys.sendkeys(Locator.PASSWORD, "Sankalpa@123");
		keys.click(Locator.RGSBUTTON);
		String errorMsg = keys.getTextofelement(Locator.CNFPASSWORDERR);
		Assert.assertEquals(actualmsg, errorMsg);
	}
}
