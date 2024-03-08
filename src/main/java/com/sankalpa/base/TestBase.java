package com.sankalpa.base;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.sankalpa.Configer;
import com.sankalpa.MyKeywords;

public class TestBase {
	public final static MyKeywords keys = new MyKeywords();
	
	@BeforeMethod
	public void setup() {
		Configer conf = new Configer();
		keys.launchingBrowser(conf.getBrowserName());
		keys.launchURL(conf.getAppUrl());
	}
	@AfterMethod
	public void teardown() throws IOException{
		keys.quiteBrowser();
	}
}
