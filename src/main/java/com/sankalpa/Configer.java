package com.sankalpa;

import java.io.IOException;

import com.sankalpa.utilities.PropUtil;

public class Configer {
	public String getBrowserName() {
		return readProperty("brower_name");
	}

	public String getAppUrl() {
		return readProperty("app_Url");
	}

	private String readProperty(String property) {
		String baseDir = System.getProperty("user.dir");
		PropUtil prop = new PropUtil(baseDir + "/src/main/resources/Config.properties");
		String name = null;
		try {
			name = prop.getValue(property);
		} catch (IOException e) {

		}
		return name;
	}
}
