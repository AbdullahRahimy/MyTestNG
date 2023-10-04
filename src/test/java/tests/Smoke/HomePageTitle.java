package tests.Smoke;

import Base.UIBaseTests;
import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTitle extends UIBaseTests {
    @Test
    public void validation(){
        HomePage HomePage = new HomePage();
        String AppTitle = HomePage.AppTitleLocator.getText();
//        WebElement AppTitleX = getDriver().findElement(By.xpath("//mat-toolbar/span[1]"));
//        String AppTitle = AppTitleX.getText();
        Assert.assertEquals(AppTitle,"TEK Insurance Portal","Validation process");

    }
}
