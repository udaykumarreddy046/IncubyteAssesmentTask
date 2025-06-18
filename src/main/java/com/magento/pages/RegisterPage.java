package com.magento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    @FindBy(linkText = "Create an Account")
    WebElement createAccountLink;

    @FindBy(id = "firstname")
    WebElement firstName;

    @FindBy(id = "lastname")
    WebElement lastName;

    @FindBy(id = "email_address")
    WebElement email;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "password-confirmation")
    WebElement confirmPassword;

    @FindBy(css = "button[title='Create an Account']")
    WebElement submitBtn;

    @FindBy(css = ".message-success.success.message")
    WebElement successMsg;

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    public void clickCreateAccount() {
        createAccountLink.click();
    }

    public void fillRegistrationForm(String fname, String lname, String mail, String pass) {
        firstName.sendKeys(fname);
        lastName.sendKeys(lname);
        email.sendKeys(mail);
        password.sendKeys(pass);
        confirmPassword.sendKeys(pass);
    }

    public void submitForm() {
        submitBtn.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMsg.isDisplayed();
    }
}