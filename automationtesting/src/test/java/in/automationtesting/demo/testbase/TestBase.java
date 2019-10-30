package in.automationtesting.demo.testbase;


import in.automationtesting.demo.basepage.BasePage;
import in.automationtesting.demo.browserselector.BrowserSelector;
import in.automationtesting.demo.loadproperty.LoadProperty;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase extends BasePage {

    LoadProperty loadProperty = new LoadProperty();
    BrowserSelector browserSelector = new BrowserSelector();

    String browser = loadProperty.getProperty("browser");

    @BeforeMethod(alwaysRun = true)
    public void setUp() {
        browserSelector.selectBrowser(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }
}
