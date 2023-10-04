package Base;

import Utility.SeleniumUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class UIBaseTests extends SeleniumUtility {
    @BeforeMethod
    public void firstStep(){
        openBrowser();
    }
    @AfterMethod
    public void endStep(){
        closingBrowser();
    }



    }