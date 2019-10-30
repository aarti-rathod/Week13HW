package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

/*
Electronics Page Under Test ;Page Factory ;Soft Assert
 */
public class AddToCart extends Util {

    //--------------------------Page Factory - @FindBy-----------------------------------//
    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Electronics')]")
    WebElement mobile_Phone;

    @FindBy(xpath = "//h2[@class='title']//a[contains(text(),'Cell phones')]")
    WebElement cellPhone;

    @FindBy(xpath = "//h2[@class='product-title']//a[contains(text(),'HTC One M8 Android L 5.0 Lollipop')]")
    WebElement htcMobile;

    @FindBy(xpath = "//input[@id='add-to-cart-button-18']")
    WebElement addToCart;
//---------------------------------------------------------------------------------//


    public void openElectronicsPage() {
        clickOnElement(mobile_Phone);
    }

    public void openCellphoneOption() {

        clickOnElement(cellPhone);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnHTCMobile() {
        clickOnElement(htcMobile);
    }

    public void addToCart() {
        clickOnElement(addToCart);
    }

    public void verifyAlertText() {

        String expectedText = "The product has been added to your shopping cart";
        String actualText = driver.findElement(By.xpath("//div[@class='bar-notification success']")).getText();

        /*
        Soft Assert
         */
        verifyActualAndExpectedSoft(expectedText, actualText);

    }
}
