package com.nopcommrece.demo.testbase;

import com.nopcommrece.demo.basepage.BasePage;
import com.nopcommrece.demo.browserselector.BrowserSelector;
import com.nopcommrece.demo.loadproperty.LoadProperty;
import org.testng.annotations.*;
/*
Initial Actions
 */
public class TestBase extends BasePage {

    BrowserSelector browserSelector = new BrowserSelector();
    //Multiple inheritance is not possible in java so we use object to get more than one class
    LoadProperty loadProperty = new LoadProperty();
    String browser = new LoadProperty().getProperty("browser"); //retrun it gives the value of browser which is "chrome"
/*
"alwaysRun=true" ; Before Group-xml Execution
 */
    @BeforeMethod(alwaysRun = true)
    public void setUP() {
        browserSelector.selectBrowsers(browser);
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
