package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickOnBankMangerLogin;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Add Customer')]")
    WebElement clickOnAddCustomer ;


    public void userClickOnBankManger() {
        CustomListeners.test.log(Status.PASS,"Click on BankManager Login");
        clickOnElement(clickOnBankMangerLogin);
    }


    public void userShouldClickOnAddCustomerButton() {
        CustomListeners.test.log(Status.PASS,"Click on Add Customer");
        clickOnElement(clickOnAddCustomer);
    }
}
