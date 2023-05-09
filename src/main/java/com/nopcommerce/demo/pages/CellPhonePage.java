package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.util.List;

public class CellPhonePage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Cell phones']")
    WebElement cellPhoneTitleLocator;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'List')]")
    WebElement ListViewIcon;

    public String actualPageTitleTextOfCellPhonePage() {
        Reporter.log("Get page title text of cell phone page");
        CustomListeners.test.log(Status.PASS, "Get error message");
        return getTextFromElement(cellPhoneTitleLocator);
    }

    public void clickOnListViewIcon()  {
        Reporter.log("click on list view icon" + ListViewIcon.toString());
        CustomListeners.test.log(Status.PASS, "click on list view icon");
        clickOnElement(ListViewIcon);

    }
    public void clickOnProductNokiaLumia1020()  {
        Reporter.log("click on product nokia lumia 1020" );
        CustomListeners.test.log(Status.PASS, "click on product nokia lumia 1020");
        List<WebElement> mobileTitlesList = driver.findElements(By.xpath("//h2[@class='product-title']/a"));
        for (WebElement element : mobileTitlesList) {
            if (element.getText().contains("Nokia")) {
                element.click();
                break;
            }
        }
    }




}
