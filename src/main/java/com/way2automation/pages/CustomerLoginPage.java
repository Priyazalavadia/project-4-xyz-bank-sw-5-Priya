package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickOnLoginTab;



    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement clickOnYourName;

    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']/child::*")
    WebElement selectYourNameFromDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLoginButton;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement verifyLogoutText ;
    @CacheLookup
    @FindBy(xpath = "//button[@class='btn logout']")
    WebElement clickOnLogOutButton;
    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement verifyYourNameText;



    public void userClickOnLoginTab(){
        CustomListeners.test.log(Status.PASS,"Click on LoginTab");
        clickOnElement(clickOnLoginTab);

    }

    public void userClickOnYourName(){
        CustomListeners.test.log(Status.PASS,"Click on Your Name");
        clickOnElement(clickOnYourName);
    }


    public void setSelectYourNameFromDropDown(WebElement element, String str){
        CustomListeners.test.log(Status.PASS,"Select Your Name" + str);
        selectByValueFromDropDown(selectYourNameFromDropDown,str);
    }


    public void userClickOnLoginButton(){
        CustomListeners.test.log(Status.PASS,"Click on LoginButton");
        clickOnElement(clickOnLoginButton);
    }


    public String verifyLogoutMessage(){
        CustomListeners.test.log(Status.PASS,"Verify Message");
        return getTextFromElement(verifyLogoutText);
    }

    public void userClickOnLogOutButton(){
        CustomListeners.test.log(Status.PASS,"Click on Logout Button");
        clickOnElement(clickOnLogOutButton);
    }


    public String verifyYourNameTextinCustomerLogInPage(){
        CustomListeners.test.log(Status.PASS,"Verify Text");
        return getTextFromElement(verifyYourNameText);
    }

}
