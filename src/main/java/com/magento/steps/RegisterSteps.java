package com.magento.steps;

import com.magento.pages.RegisterPage;
import com.magento.utils.DriverUtils;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.UUID;

public class RegisterSteps {
	WebDriver driver;
	RegisterPage registerPage;
	String randomEmail = "user_" + UUID.randomUUID().toString().substring(0, 5) + "@example.com";
	public static String registeredEmail;
	public static String registeredPassword = "Password123!";

	@Given("I open the Magento homepage")
	public void openHomePage() {

		driver = DriverUtils.initDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	@When("I navigate to the registration page")
	public void navigateToRegisterPage() {
		registerPage = new RegisterPage(driver);
		registerPage.clickCreateAccount();
	}

	@When("I fill the registration form with valid data")
	public void fillRegistrationForm() {
		 registeredEmail = "user_" + UUID.randomUUID().toString().substring(0, 5) + "@example.com";
		registeredPassword = "Password123!";
		registerPage.fillRegistrationForm("Uday", "R", registeredEmail, registeredPassword);
	}

	@When("I submit the registration form")
	public void submitRegistrationForm() {
		registerPage.submitForm();
	}

	@Then("I should see a registration success message")
	public void verifyRegistrationSuccess() {
		Assert.assertTrue(registerPage.isSuccessMessageDisplayed());
		DriverUtils.quitDriver();
	}
}
