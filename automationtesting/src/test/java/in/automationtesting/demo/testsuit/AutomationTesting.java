package in.automationtesting.demo.testsuit;


import in.automationtesting.demo.pages.Alert;
import in.automationtesting.demo.pages.FileDownload;
import in.automationtesting.demo.pages.HomePage;
import in.automationtesting.demo.pages.Summer;
import in.automationtesting.demo.testbase.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AutomationTesting extends TestBase {

    HomePage homePage ;
    Summer summer ;
    FileDownload fileDownload;
    Alert alert;

    @BeforeMethod
    public void setUpTest() {
        homePage =new HomePage();
        summer= new Summer();
        fileDownload=new FileDownload();
        alert =new Alert();
    }


    @Test
    public void userShouldAbleToLoginSuccessfully(){
        homePage.selectLogin();
        homePage.enterEmailAddress();
        homePage.enterPassword();
        homePage.enterLoginBtn();
    }

    @Test
    public void useShouldAbleToGetSummerNoteSuccessfully(){
        summer.clickSkipLogin();
        summer.selectWys();
        summer.summerNoteSel();
        summer.getNote();
    }

    @Test
    public void userShouldAbleToDownloadFileSuccessfully(){
        fileDownload.clickSkip();
        fileDownload.clickOnMore();
        fileDownload.clickOnFileDownlod();
        fileDownload.clickOnDownload();
        fileDownload.verifyTitle();
    }

    @Test
    public void userShouldAbleToGetAlertText(){
        alert.clickOnLoginskip();
        alert.clickOnSwithTo();
        alert.clickOnAlerts();
        alert.clickOnAlertWithTextBox();
    }

}
