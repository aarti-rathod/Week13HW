package in.automationtesting.demo.testsuit;


import in.automationtesting.demo.pages.Alert;
import in.automationtesting.demo.pages.FileDownload;
import in.automationtesting.demo.pages.HomePage;
import in.automationtesting.demo.pages.Summer;
import in.automationtesting.demo.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class AutomationTesting extends TestBase {

    HomePage homePage ;
    Summer summer ;
    FileDownload fileDownload;
    Alert alert;

    @Test(groups = {"regression","sanity"})
    public void userShouldAbleToLoginSuccessfully(){

        PageFactory.initElements(driver,HomePage.class);
        homePage =new HomePage();
        homePage.selectLogin();
        homePage.enterEmailAddress();
        homePage.enterPassword();
        homePage.enterLoginBtn();
    }

    @Test(groups = {"regression"})
    public void useShouldAbleToGetSummerNoteSuccessfully(){
        PageFactory.initElements(driver,Summer.class);
        summer= new Summer();
        summer.clickSkipLogin();
        summer.selectWys();
        summer.summerNoteSel();
        summer.getNote();
    }

    @Test(groups = {"regression"})
    public void userShouldAbleToDownloadFileSuccessfully(){
        PageFactory.initElements(driver,FileDownload.class);
        fileDownload=new FileDownload();
        fileDownload.clickSkip();
        fileDownload.clickOnMore();
        fileDownload.clickOnFileDownlod();
        fileDownload.clickOnDownload();
        fileDownload.verifyTitle();
    }

    @Test(groups = {"regression"})
    public void userShouldAbleToGetAlertText(){
        PageFactory.initElements(driver,Alert.class);
        alert =new Alert();
        alert.clickOnLoginskip();
        alert.clickOnSwithTo();
        alert.clickOnAlerts();
        alert.clickOnAlertWithTextBox();
    }

}
