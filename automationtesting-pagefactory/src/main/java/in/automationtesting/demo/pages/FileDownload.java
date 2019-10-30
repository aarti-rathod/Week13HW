package in.automationtesting.demo.pages;


import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileDownload extends Util {

    @FindBy(xpath = "//button[@id='btn2']")
    WebElement skiLogin;

    @FindBy(xpath = "//a[contains(text(),'More')]")
    WebElement clickMore;

    @FindBy(xpath = "//a[contains(text(),'File Download')]")
    WebElement fileDownload;

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    WebElement getFileDownload;

    public void clickSkip() {
        clickOnElement(skiLogin);
    }

    public void clickOnMore() {
        clickOnElement(clickMore);
    }

    public void clickOnFileDownlod() {
        clickOnElement(fileDownload);
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void clickOnDownload() {
        clickOnElement(getFileDownload);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void verifyTitle(){
        String expectedTitle ="File input - Multi select";
        String actualTitle = driver.getTitle();
        verifyActualAndExpectedSoft(expectedTitle,actualTitle);
    }


}
