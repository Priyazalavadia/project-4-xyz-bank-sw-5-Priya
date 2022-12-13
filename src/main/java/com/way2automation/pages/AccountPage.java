package com.way2automation.pages;

import com.aventstack.extentreports.Status;
import com.way2automation.customlisteners.CustomListeners;
import com.way2automation.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//div[@class='borderM box padT20 ng-scope']/div[3]/button[2]")
    WebElement clickOnDeposit;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement clickOnAmount ;

    @CacheLookup
    @FindBy(xpath = "//form[@role='form']/button")
    WebElement clickOnDepositButton ;
    @CacheLookup
    @FindBy(xpath = "//span[text()='Deposit Successful']")
    WebElement verifyDepositSuccessFull ;
    @CacheLookup
    @FindBy(xpath = "//div[@class='borderM box padT20 ng-scope']/div[3]/button[3]")
    WebElement clickOnWithDrawl ;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnWithdrawButton ;

    @CacheLookup
    @FindBy(xpath = "//span[text()='Transaction successful']")
    WebElement verifyTransactionMessage ;

    @CacheLookup
    @FindBy(xpath = "//select[@id='accountSelect']")
    WebElement selctPoumdSign ;



    public void userClickOnDeposit(){
        CustomListeners.test.log(Status.PASS,"Click on Deposit");
        clickOnElement(clickOnDeposit);

    }
    public void userClickOnAmountToBeDepositedAndAdded100(){
        CustomListeners.test.log(Status.PASS,"Click on Amount");
        clickOnElement(clickOnAmount);
        sendTextToElement(clickOnAmount,"100");
    }

    public void userClickOnDepositButton(){
        CustomListeners.test.log(Status.PASS,"Click on Your Name");
        clickOnElement(clickOnDepositButton);
    }
        public String userVerifyDepositSuccessFull(){
            CustomListeners.test.log(Status.PASS,"Verify Message");
        return getTextFromElement(verifyDepositSuccessFull);
    }

    public void userClickOnWithDrawl(){
        CustomListeners.test.log(Status.PASS,"Click on Withdrawl");
        clickOnElement(clickOnWithDrawl);
    }

    public void
    userClickOnAmountToBeWithDrawn50(){
        CustomListeners.test.log(Status.PASS,"Click on Amount");
        clickOnElement(clickOnAmount);
        sendTextToElement(clickOnAmount,"50");
    }


    public void userClickOnWithdrawButton(){
        CustomListeners.test.log(Status.PASS,"Click on Withdraw Button");
        clickOnElement(clickOnWithdrawButton);
    }



    public String verifyTransactionMessage(){
        CustomListeners.test.log(Status.PASS,"Verify Message");
        return getTextFromElement(verifyTransactionMessage);

    }

    public void selectPoundSign(){
        CustomListeners.test.log(Status.PASS,"Click on Currency");
        clickOnElement(selctPoumdSign);
        selectByIndexFromDropDown(selctPoumdSign,1);
        clickOnElement(selctPoumdSign);
    }

}
