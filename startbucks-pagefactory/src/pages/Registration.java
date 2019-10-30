package pages;

import loadProperty.LoadProperty;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import util.Util;

public class Registration extends Util {

    LoadProperty loadProperty = new LoadProperty();

    @FindBy(how = How.XPATH, using = "//a[@id='registrationForm']")
    WebElement join_;

    @FindBy(how = How.XPATH, using = "//input[@id='firstName']")
    WebElement firstName_;

    @FindBy(how = How.XPATH, using = "//input[@id='lastName']")
    WebElement lastName_;

    @FindBy(how = How.XPATH, using = "//input[@id='addressLine1']")
    WebElement addressLine_;

    @FindBy(xpath = "//input[@id='addressLine2']")
    WebElement addressLineTwo_;

    @FindBy(xpath = "//input[@id='city']")
    WebElement city_;

    @FindBy(xpath = "//input[@id='postalCode']")
    WebElement _postcode;

    @FindBy(xpath = "//input[@id='emailAddress']")
    WebElement _email;

    @FindBy(how = How.XPATH, using = "//input[@id='password']")
    WebElement _password;

    @FindBy(xpath = "//div[@class='sb-contentColumn mx-auto sb-contentColumn--narrow']//form//div//div//*[@class='valign-middle block option__labelIcon']")
    WebElement _termsandcon;

    @FindBy(how = How.XPATH, using = "//button[@class='sb-frap']")
    WebElement _submit;

    @FindBy(how = How.XPATH, using = "//h2[@class='welcome-message']")
    WebElement welcomeText;

    public void clickOnJoin() {
        clickOnElement(join_);
    }

    public void enterFirstName() {
        sendTextToElement(firstName_, loadProperty.getProperty("firstname"));
        keyTAB(firstName_);
    }

    public void enterLastName() {
        sendTabText(lastName_, loadProperty.getProperty("lastname"));
        keyTAB(lastName_);
    }

    public void enterAddressLineOne() {
        sendTabText(addressLine_, loadProperty.getProperty("addresslineone"));
        keyTAB(addressLine_);
    }

    public void enterAddressLineTwo() {
        sendTabText(addressLineTwo_, loadProperty.getProperty("addresslinetwo"));
        keyTAB(addressLineTwo_);
    }

    public void enterCityName() {
        sendTabText(city_, loadProperty.getProperty("city"));
        keyTAB(city_);
    }

    public void enterPostCode() {
        sendTabText(_postcode, loadProperty.getProperty("postcode"));
        keyTAB(_postcode);
    }

    public void enterEmail() {
        String randomEmail = getRandomString(4) + "56@gmail.com";
        _email.sendKeys(randomEmail);
        keyTAB(_email);
    }

    public void enterPassword() {
        sendTabText(_password, loadProperty.getProperty("password"));
    }

    public void clickOnCheckBox() {
        clickOnElement(_termsandcon);
    }

    public void clickOnSubmit() {
        clickOnElement(_submit);
        waitFor();
    }

    public void verifyWelcomeText() {
        String expectedTitle = "Hello," + " " + loadProperty.getProperty("firstname");
        String actualtitle = welcomeText.getText();
        verifyActualAndExpected(expectedTitle, actualtitle);
    }
}
