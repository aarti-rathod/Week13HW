package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
CurrencySelection Page Under Test ; Page Factory ; Soft Assert
 */
public class CurrencySelection extends Util {

    //--------------------------Page Factory - @FindBy-----------------------------------//
    @FindBy(xpath = "//select[@id='customerCurrency']")
    WebElement selectionCurdollor;

    @FindBy(xpath = "//span[contains(text(),'$1,200.00')]")
    WebElement dollorVerify;

    @FindBy(xpath = "//select[@id='customerCurrency']")
    WebElement selectCurEuro;

    @FindBy(xpath = "//span[contains(text(),'1548.00')]")
    WebElement euroVerify ;
//-----------------------------------------------------------------------------------//
    public void selectEuroFromCurrencyWindow() {
        selectByVisibleTextFromDropDown(selectionCurdollor, "US Dollar");
    }

    public void verifyEuroCurrencySelectedSuccessfully() {
        String expectedValue = "$1,200.00";
        String actualValue = getTextFromElement(dollorVerify);
        /*
        To verify The Values Match The Expected
         */
        verifyActualAndExpected(expectedValue, actualValue);
    }

    public void selectDollorFromCurrencyWindow() {
        selectByVisibleTextFromDropDown(selectCurEuro, "Euro");
    }

    public void verifyDollorCurrencySelectedSuccessfully() {

        String expectedValue = "Ђ1548.00";
        String actualValue = getTextFromElement(euroVerify);
        /*
        Soft Assert
         */
        verifyActualAndExpectedSoft(expectedValue, actualValue);
    }

}
