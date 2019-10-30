package pages;

import loadProperty.LoadProperty;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import util.Util;

public class Login extends Util {
    LoadProperty loadProperty = new LoadProperty();
    @FindBy(xpath = "//a[@id='signIn']")
    WebElement _signIn;

    @FindBy(xpath = "//input[@id='username']")
    WebElement _userName;

    @FindBy(xpath = "//input[@id='password']")
    WebElement _password;

    @FindBy(xpath = "//button[@class='sb-frap']")
    WebElement _loginBtn;

    @FindBy(how = How.XPATH, using = "//h2[@class='welcome-message']")
    WebElement welcomeText;


    public void clickOnSignIN() {
        clickOnElement(_signIn);
    }

    public void enterUserName() {
         sendTextToElement(_userName,loadProperty.getProperty("login_email"));
         keyTAB(_userName);
    }

    public void enterPassword() {
        sendTabText(_password,loadProperty.getProperty("login_pwd"));
        keyTAB(_password);
    }

    public void clickOnSignInBtn() {
        clickOnElement(_loginBtn);
        waitFor();
    }

    public void verifyWelcomeText() {
        String expectedTitle = "Hello," + " " + loadProperty.getProperty("firstname");
        String actualtitle = welcomeText.getText();
        verifyActualAndExpected(expectedTitle, actualtitle);
    }

}
