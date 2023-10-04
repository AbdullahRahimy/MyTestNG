package Pages;

import Utility.SeleniumUtility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends SeleniumUtility {
    public HomePage(){
        PageFactory.initElements(getDriver(), this);
    }
@FindBy(xpath = "//mat-toolbar/span[1]")
    public WebElement AppTitleLocator;

}
