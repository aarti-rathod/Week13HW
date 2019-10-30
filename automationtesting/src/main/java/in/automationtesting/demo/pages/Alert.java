package in.automationtesting.demo.pages;

import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.By;
/*
Alert Page ;Get Title
 */
public class Alert extends Util {
    By loginSkipped = By.xpath("//button[@id='btn2']");
    By switchTo = By.xpath("//a[contains(text(),'SwitchTo')]");//
    By alertBar = By.xpath("//a[contains(text(),'Alerts')]");
    By alertWithText = By.xpath("//a[contains(text(),'Alert with Textbox')]");

    public void clickOnLoginskip() {
        clickOnElement(loginSkipped);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
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
