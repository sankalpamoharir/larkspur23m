package com.sankalpa;

public interface Locator {
	String REGISTERLINK = "//a[contains(text(),'Register')]";
	String FIRSTNAME = "//input[@id=\"customer.firstName\"]";
	String LASTNAME = "//input[@id=\"customer.lastName\"]";
	String ADDRESS = "//input[@id=\"customer.address.street\"]";
	String CITY = "//input[@id=\"customer.address.city\"]";
	String STATE = "//input[@id=\"customer.address.state\"]";
	String ZIPCDE = "//input[@id=\"customer.address.zipCode\"]";
	String PHONENO = "//input[@id=\"customer.phoneNumber\"]";
	String SSN = "//input[@id=\"customer.ssn\"]";
	String USERNAME = "//input[@id=\"customer.username\"]";
	String PASSWORD = "//input[@id=\"customer.password\"]";
	String CONFMPASSWORD = "//input[@id=\"repeatedPassword\"]";
	String RGSBUTTON = "/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[13]/td[2]/input";
	String LASTNAMEERR ="//span[@id=\"customer.lastName.errors\"]";
	String FIRSTNAMEERR ="//span[@id=\"customer.firstName.errors\"]";
	String ADDRESSERR ="//span[@id=\"customer.address.street.errors\"]";
	String CITYERR = "//span[@id=\"customer.address.city.errors\"]";
	String STATEERR = "//span[@id=\"customer.address.state.errors\"]";
	String ZIPCODEERR = "//span[@id=\"customer.address.zipCode.errors\"]";
	String PHONENOREQ ="//h1[@class=\"title\"]";
	String SSNERR ="//span[@id=\"customer.ssn.errors\"]";
	String USENAMEERR ="//span[@id=\"customer.username.errors\"]";
	String PASSWORDERR ="//span[@id=\"customer.password.errors\"]";
	String CNFPASSWORDERR ="//span[@id=\"repeatedPassword.errors\"]";
}
