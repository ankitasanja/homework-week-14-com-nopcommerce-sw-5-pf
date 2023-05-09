package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeSignInPageTitleLocator;

    @CacheLookup
    @FindBy(css = ".button-1.checkout-as-guest-button")
    WebElement checkoutAsGuestButtonLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_FirstName")
    WebElement firstNameFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_LastName")
    WebElement lastNameFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Email")
    WebElement emailFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_CountryId")
    WebElement countryDropDownLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_City")
    WebElement cityFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_Address1")
    WebElement addressFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_ZipPostalCode")
    WebElement postCodeFieldLocator;

    @CacheLookup
    @FindBy(css = "#BillingNewAddress_PhoneNumber")
    WebElement phoneNumberFieldLocator;

    @CacheLookup
    @FindBy(name = "save")
    WebElement continueButtonLocator;

    //By ButtonRegister = By.cssSelector(".button-1.register-button");
    @CacheLookup
    @FindBy(linkText = "Register")
    WebElement ButtonRegister;

    public String getTextFromWelcomeText() {
        Reporter.log("get text from welcome text");
        CustomListeners.test.log(Status.PASS, "get text from welcome text");
        return getTextFromElement(welcomeSignInPageTitleLocator);
    }

    public void clickCheckOut() {
        Reporter.log("click on check out " );
        CustomListeners.test.log(Status.PASS, "click on check out");
        clickOnElement(checkoutAsGuestButtonLocator);
    }

    public void firstName(String fName) {
        Reporter.log("Enter first name " + fName + " to username field " + firstNameFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Enter first name " + fName);
        sendTextToElement(firstNameFieldLocator, fName);
    }

    public void lastName(String lName) {
        Reporter.log("Enter last name " + lName + " to username field " + lastNameFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Enter last name " + lName);
        sendTextToElement(lastNameFieldLocator, lName);
    }

    public void email(String email) {
        Reporter.log("Enter email " + email + " to username field " + emailFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Enter email " + email);
        sendTextToElement(emailFieldLocator, email);
    }

    public void selectCountryFromDropDown() {
        Reporter.log("select country from dropdown list" );
        CustomListeners.test.log(Status.PASS, "select country from dropdown list");
        selectByIndexFromDropDown(countryDropDownLocator, 2);

    }
    public void enterCity(String cityName) {
        Reporter.log("Enter city name " + cityName + " to username field " + cityFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Enter city name " + cityName);
        sendTextToElement(cityFieldLocator, cityName);
    }

    public void enterAddress(String address) {
        Reporter.log("Enter address " + address + " to username field " + addressFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Enter address " + address);
        sendTextToElement(addressFieldLocator,address );
    }

    public void enterPostCode(String postcode) {
        Reporter.log("Enter postcode " + postcode + " to username field " + postCodeFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Enter postcode " + postcode);
        sendTextToElement(postCodeFieldLocator, postcode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        Reporter.log("Enter phone number " + phoneNumber + " to username field " + phoneNumberFieldLocator.toString());
        CustomListeners.test.log(Status.PASS, "Enter phone number " + phoneNumber);
        sendTextToElement(phoneNumberFieldLocator, phoneNumber);
    }

    public void clickContinue() {
        Reporter.log("click on continue " );
        CustomListeners.test.log(Status.PASS, "click on continue");
        clickOnElement(continueButtonLocator);
    }

    public void clickOnButtonRegister() throws InterruptedException {
        Reporter.log("click on button register " );
        CustomListeners.test.log(Status.PASS, "click on button register");
        clickOnElement(ButtonRegister);
        Thread.sleep(1000);
    }

}
