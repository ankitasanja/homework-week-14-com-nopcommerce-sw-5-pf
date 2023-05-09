package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CheckOutAfterRegistrationPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_FirstName']")  // value "Micky"
    WebElement firstNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_LastName']")  // value "Mouse"
    WebElement lastNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Email']")  // value "mickmouse0000@gmail.com"
    WebElement emailInputBox;

    @CacheLookup
    @FindBy(xpath = "//select[@id='BillingNewAddress_CountryId']")  //value "233"
    WebElement countryDropDown;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_City']")  //value "Glasgow"
    WebElement cityInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_Address1']")  //value "10 Paris Street"
    WebElement address1InputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_ZipPostalCode']")  // value "GS10 2FC"
    WebElement postalCodeInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='BillingNewAddress_PhoneNumber']") // value "02022039384"
    WebElement billingNewAddressPhoneNumber;

    @CacheLookup
    @FindBy(xpath = "//button[@onclick='Billing.save()']")  //button 1
    WebElement buttonContinueFromBillingAddress;

    @CacheLookup
    @FindBy(xpath = "//input[@id='shippingoption_1']")
    WebElement radioButtonNextDayAir;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 shipping-method-next-step-button']")  // button 2
    WebElement buttonContinueFromShippingMethod;

    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioButtonCreditCard;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-method-next-step-button']")        // button 3
    WebElement buttonContinueFromPaymentMethod;

    @CacheLookup
    @FindBy(xpath = "//select[@id='CreditCardType']") // value  "MasterCard"
    WebElement dropDownSelectCard;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardholderName']")  // value "Mr Micky"
    WebElement cardHolderNameInputBox;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardNumber']") // value "5105105105105100"
    WebElement cardNumberInputBox;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireMonth']") // "12"
    WebElement dropDownExpiryDateMonth;

    @CacheLookup
    @FindBy(xpath = "//select[@id='ExpireYear']")  // value "2023"
    WebElement dropDownExpiryDateYear;

    @CacheLookup
    @FindBy(xpath = "//input[@id='CardCode']") // value "203"
    WebElement cardCodeInputBox;

    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 payment-info-next-step-button']") // button 4
    WebElement buttonContinueFromPaymentInformation;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Credit Card')]")
    WebElement actualTextOfCardMethod;

    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='2nd Day Air']")
    WebElement actualTextOfShippingMethod;

    @CacheLookup
    @FindBy(xpath = "//span[@class='product-subtotal']")
    WebElement actualTotalFinalPrice;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Confirm']")  // button confirm
    WebElement buttonConfirm;

    @CacheLookup
    @FindBy(xpath = "(//input[@id='shippingoption_2'])[1]")
    WebElement radioButton2ndDayAir;


    /**
     * List of methods to perform actions using above locators variables
     */

    // Fill the all mandatory field
    public void firstName(String fName) {
        Reporter.log("Enter first name " + fName + " to username field " + firstNameInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter first name " + fName);
        clearValue(firstNameInputBox);
        sendTextToElement(firstNameInputBox, fName);
    }

    public void lastName(String lName) {
        Reporter.log("Enter last name " + lName + " to username field " + lastNameInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter last name " + lName);
        clearValue(lastNameInputBox);
        sendTextToElement(lastNameInputBox, lName);
    }

    public void email(String email) {
        Reporter.log("Enter email " + email + " to username field " + emailInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter email " + email);
        clearValue(emailInputBox);
        sendTextToElement(emailInputBox, email);
    }

    public void selectCountryFromDropDown() {
        Reporter.log("select country from dropdown list" );
        CustomListeners.test.log(Status.PASS, "select country from dropdown list");
        selectByIndexFromDropDown(countryDropDown, 2);
    }

    public void enterCity(String cityName) {
        Reporter.log("Enter city name " + cityName + " to username field " + cityInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter city name " + cityName);
        sendTextToElement(cityInputBox, cityName);
    }

    public void enterAddress(String address) {
        Reporter.log("Enter address " + address + " to username field " + address1InputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter address " + address);
        sendTextToElement(address1InputBox, address);
    }

    public void enterPostCode(String postcode) {
        Reporter.log("Enter postcode " + postcode + " to username field " + postalCodeInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter postcode " + postcode);
        sendTextToElement(postalCodeInputBox, postcode);
    }

    public void enterPhoneNumber(String phoneNumber) {
        Reporter.log("Enter phone number " + phoneNumber + " to username field " + billingNewAddressPhoneNumber.toString());
        CustomListeners.test.log(Status.PASS, "Enter phone number " + phoneNumber);
        sendTextToElement(billingNewAddressPhoneNumber, phoneNumber);
    }

    public void clickContinue() {
        Reporter.log("click on continue " );
        CustomListeners.test.log(Status.PASS, "click on continue");
        clickOnElement(buttonContinueFromBillingAddress);
    }


    //Click on Radio Button “Next Day Air($0.00)”
    public void clickOnRadioButtonNextDayAir() {
        Reporter.log("click on radio button next day air " );
        CustomListeners.test.log(Status.PASS, "click on radio button next day air");
        clickOnElement(radioButtonNextDayAir);
    }

    //    2.25 Click on “CONTINUE”
    public void clickOnButtonContinueFromShippingMethod() {
        Reporter.log("click on button continue from shipping method " );
        CustomListeners.test.log(Status.PASS, "click on button continue from shipping method");
        clickOnElement(buttonContinueFromShippingMethod);
    }

    //    2.26 Select Radio Button “Credit Card”
    public void clickOnRadioButtonCreditCard() {
        Reporter.log("click on radio button credit card " );
        CustomListeners.test.log(Status.PASS, "click on radio button credit card");
        clickOnElement(radioButtonCreditCard);
    }

    // click on continue button --> button 2
    public void clickOnButtonContinueFromPaymentMethod() {
        Reporter.log("click on button continue from payment method " );
        CustomListeners.test.log(Status.PASS, "click on button continue from payment method");
        clickOnElement(buttonContinueFromPaymentMethod);
    }

    //    2.27 Select “Master card” From Select credit card dropdown
    public void clickOnDropDownSelectCard(String visa) {
        Reporter.log("click on drop down select card " );
        CustomListeners.test.log(Status.PASS, "click on drop down select card");

        selectByValueFromDropDown(dropDownSelectCard, visa);
    }

    //    2.28 Fill all the details
    public void fillInCardHolderNameInputBox(String name) {
        Reporter.log("Enter card holder name " + name + " to username field " + cardHolderNameInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter card holder name " + name);
        sendTextToElement(cardHolderNameInputBox, name);
    }

    // fill in card number
    public void fillInCardNumberInputBox(String cardNumber) {
        Reporter.log("Enter card number " + cardNumber + " to username field " + cardNumberInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter card number " + cardNumber);

        sendTextToElement(cardNumberInputBox, cardNumber);
    }

    // select month
    public void selectDropDownExpiryDateMonth(String month) {
        Reporter.log("select month from dropdown " );
        CustomListeners.test.log(Status.PASS, "select month from dropdown");

        selectByValueFromDropDown(dropDownExpiryDateMonth, month);
    }

    // select year
    public void selectDropDownExpiryDateYear(String year) {
        Reporter.log("select year from dropdown " );
        CustomListeners.test.log(Status.PASS, "select year from dropdown");

        selectByValueFromDropDown(dropDownExpiryDateYear, year);
    }

    // fill in card code
    public void fillInCardCodeInputBox(String cardCode) {
        Reporter.log("Enter card code " + cardCode + " to username field " + cardCodeInputBox.toString());
        CustomListeners.test.log(Status.PASS, "Enter card code " + cardCode);

        sendTextToElement(cardCodeInputBox, cardCode);
    }

    //    2.29 Click on “CONTINUE” --> button 4
    public void clickOnButtonContinueFromPaymentInformation() {
        Reporter.log("click On button continue from payment information " );
        CustomListeners.test.log(Status.PASS, "click On button continue from payment information");

        clickOnElement(buttonContinueFromPaymentInformation);
    }

    //    2.30 Verify “Payment Method” is “Credit Card”
    public String verifyActualTextOfCardMethod() {
        Reporter.log("verify actual text of card method");
        CustomListeners.test.log(Status.PASS, "verify actual text of card method");
        return getTextFromElement(actualTextOfCardMethod);
    }

    //    2.32 Verify “Shipping Method” is “Next Day Air”
    public String verifyActualTextOfShippingMethod() {
        Reporter.log("verify actual text of shipping method");
        CustomListeners.test.log(Status.PASS, "verify actual text of shipping method");
        return getTextFromElement(actualTextOfShippingMethod);
    }

    //    2.33 Verify Total is “$2,950.00”
    public String verifyActualTotalFinalPrice() {
        Reporter.log("verify actual total final price");
        CustomListeners.test.log(Status.PASS, "verify actual total final price");
        return getTextFromElement(actualTotalFinalPrice);
    }

    //    2.34 Click on “CONFIRM”
    public void clickOnButtonConfirm() {
        Reporter.log("click on button confirm " );
        CustomListeners.test.log(Status.PASS, "click on button confirm");

        clickOnElement(buttonConfirm);
    }

    public void clickOnRadioButton2ndDayAir() throws InterruptedException {
        Reporter.log("click on radio button 2nd DayAir " );
        CustomListeners.test.log(Status.PASS, "click on radio button 2nd DayAir");
        clickOnElement(radioButton2ndDayAir);
        Thread.sleep(1000);
    }

}
