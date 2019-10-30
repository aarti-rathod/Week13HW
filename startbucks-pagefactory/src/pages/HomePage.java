package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import util.Util;

public class HomePage extends Util {

    //-----------Page-Factory-WebElements-------------//
    @FindBy(xpath = "//li[@id='nav_coffee']//a[@class='tab']")
    WebElement coffee_;

    @FindBy(xpath = "//li[@id='nav_menu']//a[@class='tab']")
    WebElement menu_;

    @FindBy(xpath = "//li[@id='nav_coffeehouse']//a[@class='tab']")
    WebElement coffeeHouse_;

    @FindBy(how = How.XPATH , using = "//li[@id='nav_careers']//a[@class='tab']")
    WebElement careers_;

    @FindBy(how = How.XPATH ,using = "//li[@id='nav_responsibility']//a[@class='tab']")
    WebElement responsibility_;

    @FindBy(how = How.XPATH ,using = "//li[@id='nav_card']//a[@class='tab']")
    WebElement card_;


    public void clickOnCoffee(){
        clickOnElement(coffee_);
    }

    public void clickOnMenu(){
        clickOnElement(menu_);
    }

    public void clickOnCoffeeHouse(){
        clickOnElement(coffeeHouse_);
    }

    public void clickOnCareers(){
        clickOnElement(careers_);
    }

    public void clickOnResponsibility(){
        clickOnElement(responsibility_);
    }

    public void clickOnCard(){
        clickOnElement(card_);
    }

}
