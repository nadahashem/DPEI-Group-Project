package com.orangehrm.page;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
	private final By usernameFieldLocator = By.name("username"),
			passwordFieldLocator = By.name("password"),
			submitButtonLocator = By.xpath("//button[@type='submit']"),
			alertLocator = By.xpath("//div[@role='alert']");



	public DashboardPage login(String username, String password) {
		set(usernameFieldLocator,username);
		set(passwordFieldLocator,password);
		click(submitButtonLocator);
		DashboardPage dashboard = new DashboardPage();
		dashboard.setDriver(this.driver);
		return dashboard;
	}

	public Boolean isAlertDisplayed() {
		return find(alertLocator).isDisplayed();
	}
	public String getAlertText(){
		return find(alertLocator).getText();
	}

}

