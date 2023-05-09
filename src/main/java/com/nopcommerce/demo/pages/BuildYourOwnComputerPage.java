package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BuildYourOwnComputerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement buildYourOwnComputerTitleLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_1")
    WebElement processorDropdownLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_2")
    WebElement ramDropdownLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_3_7")
    WebElement hddRadioButtonLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_4_9")
    WebElement osRadioButtonLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_5_10")
    WebElement msOfficeCheckBoxLocator;

    @CacheLookup
    @FindBy(css = "#product_attribute_5_12")
    WebElement totalCommanderCheckBoxLocator;

    @CacheLookup
    @FindBy(xpath="(//span[@id='price-value-1'])[1]")
    WebElement priceTotalLocator;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement addToCartButton1Locator;

    @CacheLookup
    @FindBy(css = ".content")
    WebElement messageConfirmationLocator;


    @CacheLookup
    @FindBy(xpath = "//span[@title='Close']")
    WebElement crossToCloseLocator;


    public String getTextFromBuildYourOwnComputer() {
        Reporter.log("Get Text From build your own computer");
        CustomListeners.test.log(Status.PASS, "Get Text From build your own computer");
        return getTextFromElement(buildYourOwnComputerTitleLocator);
    }

    public void selectProcessor() {
        Reporter.log("select processor" + processorDropdownLocator.toString());
        CustomListeners.test.log(Status.PASS, "select processor");
        selectByIndexFromDropDown(processorDropdownLocator, 1);

    }

    public void selectRAM() {
        Reporter.log("select RAM" + ramDropdownLocator.toString());
        CustomListeners.test.log(Status.PASS, "select RAM");
        selectByIndexFromDropDown(ramDropdownLocator, 3);

    }

    public void selectHDD() {
        Reporter.log("click on HDD" + hddRadioButtonLocator.toString());
        CustomListeners.test.log(Status.PASS, "click on HDD");
        clickOnElement(hddRadioButtonLocator);
    }

    public void selectOS() {
        Reporter.log("click on OS" + osRadioButtonLocator.toString());
        CustomListeners.test.log(Status.PASS, "click on OS");
        clickOnElement(osRadioButtonLocator);
    }

    public void selectMicrosoftOffice() {
        Reporter.log("select Microsoft office" + msOfficeCheckBoxLocator.toString());
        CustomListeners.test.log(Status.PASS, "select Microsoft office");
        WebElement element = driver.findElement(By.cssSelector("#product_attribute_5_10"));
        if (!element.isSelected()) {
            clickOnElement(msOfficeCheckBoxLocator);
        }
    }

    public void selectTotalCommander() {
        Reporter.log("click on total commander" + totalCommanderCheckBoxLocator.toString());
        CustomListeners.test.log(Status.PASS, "click on total commander");
        clickOnElement(totalCommanderCheckBoxLocator);
    }

    public String checkTotalPrice(){
        Reporter.log("Check Total Price" );
        CustomListeners.test.log(Status.PASS,"Check Total Price");
        return getTextFromElement(priceTotalLocator);
    }

    public void addToCartButtonClick() {
        Reporter.log("click on add to cart button" + addToCartButton1Locator.toString());
        CustomListeners.test.log(Status.PASS, "click on add to cart button");
        clickOnElement(addToCartButton1Locator);

    }

    public String shoppingCartMessage() {
        Reporter.log("Get shopping cart message");
        CustomListeners.test.log(Status.PASS, "Get shopping cart message");
        return getTextFromElement(messageConfirmationLocator);

    }

    public void crossBarClick() {
        Reporter.log("click on cross bar" + crossToCloseLocator.toString());
        CustomListeners.test.log(Status.PASS, "click on cross bar");
        clickOnElement(crossToCloseLocator);
    }

}
