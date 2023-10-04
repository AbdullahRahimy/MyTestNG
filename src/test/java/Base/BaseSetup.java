package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseSetup {
    private WebDriver driver;
    public final String url="https://qa.insurance.tekschool-students.com/";

    public void openBrowser() {
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
    }
    public WebDriver getDriver(){return driver;}

    public void closingBrowser(){
        if (driver != null){
        driver.quit();}
    }
}
