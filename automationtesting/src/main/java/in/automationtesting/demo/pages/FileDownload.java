package in.automationtesting.demo.pages;

import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.By;
/*
File Page;Download File
 */
public class FileDownload extends Util {

    By skiLogin = By.xpath("//button[@id='btn2']");
    By clickMore = By.xpath("//a[contains(text(),'More')]");
    By fileDownload = By.xpath("//a[contains(text(),'File Download')]");
    By getFileDownload = By.xpath("//a[@class='btn btn-primary']");

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

    public void verifyTitle() {
        String expectedTitle = "File input - Multi select";
        String actualTitle = driver.getTitle();
        verifyActualAndExpectedSoft(expectedTitle, actualTitle);
    }
}
