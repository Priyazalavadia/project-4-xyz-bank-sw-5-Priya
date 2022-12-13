package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@class='border box padT20 ng-scope']/descendant::button[2]")
    WebElement openAccountPage;
    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement clickOnSelectCustomerName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement selectYourNameFromDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcessButton;

    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement clickOnCurrencyButton;
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement customerNameLookUp;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement currencyTypeLookUp;


    public void userShouldClickOnOpenAccountPage(){
        CustomListeners.test.log(Status.PASS,"Click On OpenAccount");
        clickOnElement(openAccountPage);
    }
    public void userShouldClickOnCustomerName(){
        CustomListeners.test.log(Status.PASS,"Click On Select Customer Name");
        clickOnElement(clickOnSelectCustomerName);
    }

    public void setSelectYourNameFromDropDown(){
        CustomListeners.test.log(Status.PASS,"Select Your Name From Drop Down");
        selectByValueFromDropDown(selectYourNameFromDropDown,"Hermoine Granger");

    }

    public void userClickOnProcessButton(){
        CustomListeners.test.log(Status.PASS,"Click On Select Process Button");
        clickOnElement(clickOnProcessButton);
    }

    public void userClickOnCurrencyButton(){
        CustomListeners.test.log(Status.PASS,"Click On Select Currency Button");
        clickOnElement(clickOnCurrencyButton);
    }

    public void clickAndSelectCustomerName() {
        CustomListeners.test.log(Status.PASS,"Click and Select Customer Name");
        selectByVisibleTextFromDropDown(customerNameLookUp, "Hermoine Granger");
    }
    public void clickAndSelectCurrencyType() {
        CustomListeners.test.log(Status.PASS,"Select Currency Type");
        selectByVisibleTextFromDropDown(currencyTypeLookUp, "Pound");
    }


}
