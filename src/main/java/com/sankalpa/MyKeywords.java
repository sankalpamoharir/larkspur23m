package com.sankalpa;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import com.sankalpa.mycustomerrors.MyErrors;

public class MyKeywords {
	public RemoteWebDriver driver;
	public FluentWait<WebDriver> wait;

	public void launchingBrowser(String name) {
		if (name.equalsIgnoreCase("Chrome")) {
			driver = new ChromeDriver();
		} else if (name.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		} else if (name.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		} else {
			System.err.println("Invalid Browser Name");
			throw new MyErrors(name);
		}
		wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(60));
		wait.pollingEvery(Duration.ofMillis(500));
		wait.withMessage("");
		wait.ignoring(NoSuchElementException.class);

	}

	public void launchURL(String Url) {
		driver.get(Url);

	}

	public void visibilityOfElement(By element) {
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));

	}

	public void click(String xpath) {
		driver.findElement(By.xpath(xpath)).click();
	}

	public void sendkeys(String xpath, String text) {
		driver.findElement(By.xpath(xpath)).sendKeys(text);

	}

	public String getTextofelement(String xpath) {
		return driver.findElement(By.xpath(xpath)).getText();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void quiteBrowser() {
		driver.quit();
	}

}
