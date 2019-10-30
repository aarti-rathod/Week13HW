package com.nopcommrece.demo.testsuit;

import com.nopcommrece.demo.loadproperty.LoadProperty;
import com.nopcommrece.demo.page.*;
import com.nopcommrece.demo.testbase.TestBase;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by JANVI on 26/10/2019.
 */
public class NopCommerceHomePage extends TestBase {

    TaskBarPage taskBarPage;
    CurrencySelection homePage;
    AddToCart electronics;
    Login loginPage;
    LoadProperty loadProperty = new LoadProperty();



    @Test(groups = {"sanity","regression"})
    public void userShouldAbleToLoginSuccessfully() {

        loginPage = new Login();
        loginPage.clickOnTheLoginLink();
        loginPage.enterEmail(loadProperty.getProperty("email"));
        loginPage.enterPassword(loadProperty.getProperty("password"));
        loginPage.clickOnLoginButton();
    }


    @Test(groups = {"regression"})
    public void userShouldAbleToClickAllTopBarOptionsSuccessfully() {
        taskBarPage = new TaskBarPage();

        taskBarPage.selectComputerFromTaskBar();
        taskBarPage.verifyComputerOptionSelected();
        taskBarPage.selectElectronicsFromTaskBar();
        taskBarPage.verifyElectronicsOptionSelected();
        taskBarPage.selectApparelFromTaskBar();
        taskBarPage.verifyApparelOptionSelected();
        taskBarPage.selectDigitalDownLoadsFromTaskBar();
        taskBarPage.verifyDigitalDownLoadOptionSelected();
        taskBarPage.selectBooksFromTaskBar();
        taskBarPage.verifyBooksOptionSelected();
        taskBarPage.selectJewelryFromTaskbar();
        taskBarPage.verifyJewelryOptionSelected();
        taskBarPage.selectGiftCardsFromTaskBar();
        taskBarPage.verifyGiftCardsOptionSelected();
    }

    @Test(groups = "regression")
    public void userShouldAbleToSelectCurrencySuccessfully() {

        homePage = new CurrencySelection();
        homePage.selectDollorFromCurrencyWindow();
        homePage.verifyDollorCurrencySelectedSuccessfully();
        homePage.selectEuroFromCurrencyWindow();
        homePage.verifyEuroCurrencySelectedSuccessfully();
    }

    @Test(groups = {"regression"})
    public void userShouldAbleToAddItemInTheCart() {

        electronics = new AddToCart();

        electronics.openElectronicsPage();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        electronics.openCellphoneOption();
        electronics.clickOnHTCMobile();
        electronics.addToCart();
        electronics.verifyAlertText();

    }

}
