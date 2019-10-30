package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import util.Util;

public class Card extends Util {


    @FindBy(xpath = "//li[@id='nav_card']//a[@class='tab']")
    WebElement _card;

    @FindBy(xpath = "//a[contains(text(),'Pay by Mobile App')]")
    WebElement _mobileApp;

    public void clickOnCard() {
        clickOnElement(_card);
        clickOnElement(_card);
    }

    public void clickOnPayOnMobile() {
        waitFor();
        clickOnElement(_mobileApp);
    }

    public void verifyTitle() {
        String expectedTitle = "Mobile Applications | Starbucks Coffee Company";
        String actualTitle = driver.getTitle();
        verifyActualAndExpected(expectedTitle, actualTitle);
    }

}
