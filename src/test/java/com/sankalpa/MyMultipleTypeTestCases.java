package com.sankalpa;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sankalpa.base.TestBase;
import com.sankalpa.pages.RegisterPage;
import com.sankalpa.utilities.PropUtil;
/**
 * This class contains the every example of different types of
 * framework designs.
 * @author Sankalpa Moharir
 *
 */
public class MyMultipleTypeTestCases extends TestBase {
	@Test
	public void verifyingLastNameUsingKeyword() {
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
	/**
	 * This test case is made by using .properties file
	 * 
	 * @throws IOException
	 */
	@Test
	public void verifyingLastNamewithPropUtility() throws IOException {
		String actualmsg = "Last name is required.";
		String dir = System.getProperty("user.dir");
		String filePath = dir + "/src/test/resources/Locators.properties";
		PropUtil prop = new PropUtil(filePath);
		keys.click(prop.getValue("REGISTERLINK"));
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

	/**
	 * This Test case is form using POM(Page Object Model)
	 */
	@Test
	public void verifyingLastNamewithPOM() {
		String actualmsg = "Last name is required.";
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
		resg.clickregisterbttn();
		String errorMsg = resg.getmsgofLastNameErr();
		Assert.assertEquals(actualmsg, errorMsg);
	}

}
