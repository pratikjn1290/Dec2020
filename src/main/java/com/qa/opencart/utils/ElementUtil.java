package com.qa.opencart.utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtil {

	private WebDriver driver;
	WebDriverWait wait;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getWebElement(By locator) {
		return driver.findElement(locator);
	}

	public List<WebElement> getWebElements(By locator) {
		return driver.findElements(locator);
	}

	public void doClick(By locator) {
		getWebElement(locator).click();
	}

	public void doSendKeys(By locator, String text) {
		getWebElement(locator).sendKeys(text);
	}

	public void waitForPresenceofElement(By locator, int duration) {
		wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
	}

	public void waitForVisiblityOfElement(By locator, int duration)

	{
		wait = new WebDriverWait(driver, duration);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

}
