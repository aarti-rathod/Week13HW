package in.automationtesting.demo.pages;

import in.automationtesting.demo.loadproperty.LoadProperty;
import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.By;
/*
Home Page;Login Fun
 */
public class HomePage extends Util {

    LoadProperty loadProperty = new LoadProperty();
    String email = loadProperty.getProperty("email");
    String password = loadProperty.getProperty("password");

    By loginBar = By.xpath("//button[@id='btn1']");
    By emailField = By.xpath("//input[@placeholder='E mail']");
    By passWord = By.xpath("//input[@placeholder='Password']");
    By loginBtn = By.xpath("//img[@id='enterbtn']");

    public void selectLogin() {
        clickOnElement(loginBar);
    }

    public void enterEmailAddress() {
        sendTextToElement(emailField, email);
    }

    public void enterPassword() {
        sendTextToElement(passWord, password);
    }

    public void enterLoginBtn() {
        clickOnElement(loginBtn);
    }

}
