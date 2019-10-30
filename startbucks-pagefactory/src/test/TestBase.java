package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import basepage.BasePage;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase extends BasePage {

    String projectPath = System.getProperty("user.dir");
    String baseUrl = "https://www.starbucks.co.uk/";

    @BeforeMethod(alwaysRun = true)
    public void setUp(){
        System.setProperty("webdriver.gecko.driver",projectPath+"\\drivers\\geckodriver.exe");
        driver=new FirefoxDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown(){
        driver.quit();
    }
}
