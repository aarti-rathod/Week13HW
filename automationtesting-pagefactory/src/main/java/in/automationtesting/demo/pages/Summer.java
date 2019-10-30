package in.automationtesting.demo.pages;

import in.automationtesting.demo.utility.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summer extends Util {
    //------------------Page Factory ; Soft Assert -------------------//
    @FindBy(id = "btn2")
    WebElement skipLogin;

    @FindBy(xpath = "//a[contains(text(),'WYSIWYG')]")
    WebElement selection;

    @FindBy(xpath = "//a[contains(text(),'SummerNote')]")
    WebElement summerNote;

    @FindBy(xpath = "//div[@class='note-editable panel-body']//p[contains(text(),'Hello Summernote')]")
    WebElement notes;


    public void clickSkipLogin() {
        PageFactory.initElements(driver, Summer.class);
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