package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/*
Task Bar Page ---Page Factory Model ---- ; Soft Assert
 */
public class TaskBarPage extends Util {

//--------------------------Page Factory - @FindBy-----------------------------------//
    @FindBy(xpath = "//a[text()='Computers ']")
    WebElement selectComp;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement selectEle;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Apparel')]")
    WebElement selectapp;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Digital downloads')]")
    WebElement selectDigital;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Books')]")
    WebElement selectBooks;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Jewelry')]")
    WebElement selectJewellery;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Gift Cards')]")
    WebElement selectGiftCards;
//-------------------------------------------------------------------------//

    //--------------Computer-------------//
    public void selectComputerFromTaskBar() {
        clickOnElement(selectComp);
    }

    public void verifyComputerOptionSelected() {
        String expectedText = "nopCommerce demo store. Computers";
        String actualText = driver.getTitle();
        verifyActualAndExpectedSoft(actualText, expectedText);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //------------Electronics--------------//


    public void selectElectronicsFromTaskBar() {
        clickOnElement(selectEle);
    }

    public void verifyElectronicsOptionSelected() {
        String expectedText = "nopCommerce demo store. Electronics";
        String actualText = driver.getTitle();
        verifyActualAndExpectedSoft(actualText, expectedText);
    }


    //-------------------Apparel----------------//


    public void selectApparelFromTaskBar() {
        clickOnElement(selectapp);
    }

    public void verifyApparelOptionSelected() {
        String expectedText = "nopCommerce demo store. Apparel";
        String actualText = driver.getTitle();
        verifyActualAndExpectedSoft(actualText, expectedText);

    }

    //--------------------DigitalDownLoads------------------//


    public void selectDigitalDownLoadsFromTaskBar() {
        clickOnElement(selectDigital);
    }

    public void verifyDigitalDownLoadOptionSelected() {
        String expectedText = "nopCommerce demo store. Digital downloads";
        String actualText = driver.getTitle();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        verifyActualAndExpectedSoft(actualText, expectedText);
    }

    //------------------Books-------------------------------//

    public void selectBooksFromTaskBar() {
        clickOnElement(selectBooks);
    }

    public void verifyBooksOptionSelected() {
        String expectedText = "nopCommerce demo store. Books";
        String actualText = driver.getTitle();
        verifyActualAndExpectedSoft(actualText, expectedText);
    }
    //---------------------Jewelry-----------------------------//


    public void selectJewelryFromTaskbar() {
        clickOnElement(selectJewellery);
    }

    public void verifyJewelryOptionSelected() {
        String expectedText = "nopCommerce demo store. Jewelry";
        String actualText = driver.getTitle();
        verifyActualAndExpectedSoft(actualText, expectedText);

    }
    //----------------------GiftCards------------------------//

    public void selectGiftCardsFromTaskBar() {
        clickOnElement(selectGiftCards);
    }

    public void verifyGiftCardsOptionSelected() {
        String expectedText = "nopCommerce demo store. Gift Cards";
        String actualText = driver.getTitle();
        verifyActualAndExpectedSoft(actualText, expectedText);

    }

}
