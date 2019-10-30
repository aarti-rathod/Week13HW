package in.automationtesting.demo.pages;

import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.By;
/*
Summer Page ;Summer Notes
 */
public class Summer extends Util {

    By skipLogin = By.id("btn2");
    By selection = By.xpath("//a[contains(text(),'WYSIWYG')]");
    By summerNote = By.xpath("//a[contains(text(),'SummerNote')]");
    By notes = By.xpath("//div[@class='note-editable panel-body']//p[contains(text(),'Hello Summernote')]");

    public void clickSkipLogin() {
        clickOnElement(skipLogin);
    }

    public void selectWys() {
        clickOnElement(selection);
    }

    public void summerNoteSel() {
        clickOnElement(summerNote);
    }

    public void getNote() {
        String expectedText = "Hello Summernote";
        String actualText = getTextFromElement(notes);

        verifyActualAndExpectedSoft(expectedText, actualText);
    }
}
//--------------------------------------------------------------------//