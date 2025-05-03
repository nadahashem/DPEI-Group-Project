package com.base;


import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
	protected static WebDriver driver;

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	protected WebElement find(By locator) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	protected void set(By locator, String text) {
		find(locator).clear();
		find(locator).sendKeys(text);
	}

	protected void click(By locator) {
		find(locator).click();
	}

	public String getUrl() {
	return	driver.getCurrentUrl();
	}
}
