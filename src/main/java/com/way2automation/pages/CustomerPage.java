package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement enterFirstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement enterLastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement enterPostCode;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnAddCustomer;



    public void userEnterFirstName(String firstName){
        CustomListeners.test.log(Status.PASS,"Enter First Name" + firstName);
        sendTextToElement(enterFirstName,firstName);
    }

    public void userEnterLastName(String lastName){
        CustomListeners.test.log(Status.PASS,"Enter Last Name" + lastName);
        sendTextToElement(enterLastName,lastName);
    }
    public void userEnterPostCode(String postcode){
        CustomListeners.test.log(Status.PASS,"Enter Postcode" + postcode);
        sendTextToElement(enterPostCode,postcode);
    }
    public void userClickOnAddCustomerAfterFillInFOrm(){
        CustomListeners.test.log(Status.PASS,"Click on Add Customer");
        clickOnElement(clickOnAddCustomer);
    }


    public String getTextFromPopUp() {
        CustomListeners.test.log(Status.PASS,"Accept PopUp" );
        System.out.println(getTextFromAlert());
        return getTextFromAlert();
    }
    public void alertPopup(){
        CustomListeners.test.log(Status.PASS,"Alert PopUp");
        driver.switchTo().alert().accept();
    }

}
