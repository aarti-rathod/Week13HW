package com.nopcommrece.demo.page;

import com.nopcommrece.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Login Page ---Page Factory Model ---- ; Soft Assert
 */
public class Login extends Util {

    //--------------------------Page Factory - @FindBy-----------------------------------//
    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement _login;

    @FindBy(id = "Email")
    WebElement _email;

    @FindBy(id = "Password")
    WebElement _password;

    @FindBy(xpath = "//a[@class='ico-login']")
    WebElement btn_login;
//--------------------------------------------------------------------------------//

    public void clickOnTheLoginLink() {
        clickOnElement(_login);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void enterEmail(String email) {
        sendTextToElement(_email, email);
    }

    public void enterPassword(String password) {
        PageFactory.initElements(driver, Login.class);
        sendTextToElement(_password, password);
    }

    public void clickOnLoginButton() {
        PageFactory.initElements(driver, Login.class);
        clickOnElement(btn_login);
    }

}
