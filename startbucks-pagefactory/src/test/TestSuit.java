package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.Card;
import pages.HomePage;
import pages.Login;
import pages.Registration;
import testng.listener;


@Listeners(listener.class)
public class TestSuit extends TestBase{

    HomePage homePage = new HomePage();
    Registration registration = new Registration();
    Login login ;//
    Card card;


    @Test(groups = {"regression"})
    public void userShouldAbleToSelectTopBarSuccessfully(){
        PageFactory.initElements(driver,homePage);
        homePage.clickOnCoffee();
        homePage.clickOnMenu();
        homePage.clickOnCoffeeHouse();
        homePage.clickOnCareers();
        homePage.clickOnResponsibility();
        homePage.clickOnCard();
    }

    @Test(groups = {"regression"})
    public void userShouldAbleToRegisterSuccessfully(){
        PageFactory.initElements(driver,registration);
        registration.clickOnJoin();
        registration.enterFirstName();
        registration.enterLastName();
        registration.enterAddressLineOne();
        registration.enterAddressLineTwo();
        registration.enterCityName();
        registration.enterPostCode();
        registration.enterEmail();
        registration.enterPassword();
        registration.clickOnCheckBox();
        registration.clickOnSubmit();
        registration.verifyWelcomeText();
    }

    @Test(groups={"sanity","regression"})
    public void userShouldAbleToLoginSuccessfully(){
        login= new Login();
        PageFactory.initElements(driver,login);
        login.clickOnSignIN();
        login.enterUserName();
        login.enterPassword();
        login.clickOnSignInBtn();
    }

    @Test(groups = {"regression"})
    public void userShouldAbleToGetMobilePayOptionSuccessfully(){
        card = new Card();
        PageFactory.initElements(driver,card);
        card.clickOnCard();
        card.clickOnPayOnMobile();
        card.verifyTitle();
    }
}
