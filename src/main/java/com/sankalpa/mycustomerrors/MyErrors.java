package com.sankalpa.mycustomerrors;

public class MyErrors extends Error {
	private String msg;

	public MyErrors(String browserName) {
		msg = "Invalid Brower name" + browserName;
	}

	@Override
	public String toString() {

		return msg;
	}
}
