package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.magento.utils.DriverUtils;

public class LoginPage extends BasePage {

	@FindBy(linkText = "Sign In")
	WebElement signInLink;

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(id = "pass")
	WebElement passwordField;

	@FindBy(id = "send2")
	WebElement signInBtn;

	@FindBy(css = ".greet.welcome")
	WebElement accountHeader;

	@FindBy(xpath = "//span[normalize-space()='Change']")
	WebElement changeLink;

	@FindBy(linkText = "Sign Out")
	WebElement signOutLink;

	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public void navigateToLogin() {
		signInLink.click();
	}

	public void enterCredentials(String email, String password) {
		emailField.sendKeys(email);
		passwordField.sendKeys(password);
		System.out.println("email:" + email + "||" + "password:" + password);
	}

	public void clickLogin() {
		signInBtn.click();
	}

	public boolean isLoginSuccessful() {
		DriverUtils.waitForVisibility(accountHeader);
		Assert.assertEquals(accountHeader.getText(), "Welcome, Uday R!");
		return accountHeader.isDisplayed();
	}

	public void logout() throws InterruptedException {
		DriverUtils.waitForVisibility(changeLink);
		changeLink.click();
		signOutLink.click();
		Assert.assertTrue(signInLink.isDisplayed());

	}

}
