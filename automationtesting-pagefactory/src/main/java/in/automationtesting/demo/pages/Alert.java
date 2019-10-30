package in.automationtesting.demo.pages;


import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Alert extends Util {
    @FindBy(xpath = "//button[@id='btn2']")
    WebElement loginSkipped;

    @FindBy(xpath = "//a[contains(text(),'SwitchTo')]")
    WebElement switchTo;

    @FindBy(xpath = "//a[contains(text(),'Alerts')]")
    WebElement alertBar;

    @FindBy(xpath = "//a[contains(text(),'Alert with Textbox')]")
    WebElement alertWithText;

    @FindBy(xpath = "//button[@class='btn btn-info']")
    WebElement alertPrompt;




    public void clickOnLoginskip() {
        clickOnElement(loginSkipped);
    }

    public void clickOnSwithTo() {
        clickOnElement(switchTo);
    }

    public void clickOnAlerts() {
        clickOnElement(alertBar);
    }

    public void clickOnAlertWithTextBox() {
        clickOnElement(alertWithText);
    }

    public void matchTitle(){
        String expectedTitle = "Alerts";
        String actualTitle = driver.getTitle();
        verifyActualAndExpectedSoft(expectedTitle,actualTitle);
    }
}
