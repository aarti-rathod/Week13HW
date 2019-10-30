package in.automationtesting.demo.browserselector;


import in.automationtesting.demo.basepage.BasePage;
import in.automationtesting.demo.loadproperty.LoadProperty;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends BasePage {
    String path = System.getProperty("user.dir");
    LoadProperty loadProperty = new LoadProperty();
    String baseUrl = loadProperty.getProperty("baseUrl");

    public void selectBrowser(String browser){

        if(browser.equalsIgnoreCase("chrome")){

            System.setProperty("webdriver.chrome.driver",path+"\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        }else if (browser.equalsIgnoreCase("firefox")){

            System.setProperty("webdriver.gecko.driver",path+"\\driver\\geckodriver.exe");
            driver = new ChromeDriver();
            driver.get(baseUrl);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        }else {
            System.out.println("Browser Not Selected .. ");
        }
    }

}
