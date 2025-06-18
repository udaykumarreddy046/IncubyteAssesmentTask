package com.magento.steps;

import com.magento.pages.LoginPage;
import com.magento.utils.DriverUtils;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginPage;

	@When("I navigate to the login page")
	public void goToLoginPage() {
		driver = DriverUtils.initDriver();
		driver.get("https://magento.softwaretestingboard.com/");
		loginPage = new LoginPage(driver);
		loginPage.navigateToLogin();
	}

	@When("I enter valid login credentials")
	public void enterValidCredentials() {
		loginPage.enterCredentials(RegisterSteps.registeredEmail, RegisterSteps.registeredPassword);
	}

	@When("I click the login button")
	public void clickLoginBtn() {
		loginPage.clickLogin();
	}

	@Then("I should be logged in successfully")
	public void verifyLoginSuccess() {
		Assert.assertTrue(loginPage.isLoginSuccessful());

	}

	@Then("I should get logged out successfully")
	public void logout() throws InterruptedException {
		loginPage.logout();
		//Validation of successful logout with 
//    	Thread.sleep(1000);
    	//Assert.assertEquals(driver.getTitle(), "magento.softwaretestingboard.com");
    
		System.out.println(driver.getTitle());
//		System.out.println(DriverUtils.getPageTitle());
		DriverUtils.quitDriver();
	}
}
