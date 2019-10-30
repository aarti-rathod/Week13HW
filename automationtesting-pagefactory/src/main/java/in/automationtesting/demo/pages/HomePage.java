package in.automationtesting.demo.pages;


import in.automationtesting.demo.loadproperty.LoadProperty;
import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Util {

    LoadProperty loadProperty = new LoadProperty();
    String email = loadProperty.getProperty("email");
    String password = loadProperty.getProperty("password");

    //-----------Page Factory ; WebElement ------------//

    @FindBy(xpath = "//button[@id='btn1']")
    WebElement loginBar;

    @FindBy(xpath = "//input[@placeholder='E mail']")
    WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Password']")
    WebElement passWord;

    @FindBy(xpath = "//img[@id='enterbtn']")
    WebElement loginBtn;

    //--------------Login----------------//

    public void selectLogin() {
        clickOnElement(loginBar);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void enterEmailAddress() {
        sendTextToElement(emailField, email);
    }

    public void enterPassword() {
        sendTextToElement(passWord, password);
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void enterLoginBtn() {
        clickOnElement(loginBtn);
    }

}
