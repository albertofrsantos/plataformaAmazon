package runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RunBase {

    static WebDriver driver;

    public enum Browser{
        CHROME, FIREFOX
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriver getDriver(Browser browser){
        if (driver != null){
            driver.quit();
        }

        switch (browser){
            case FIREFOX:
                driver = new FirefoxDriver();
                break;
            case CHROME:
                driver = new ChromeDriver();
                break;
            default:
                throw new IllegalArgumentException("Passe o navegador valido");
        }
        return driver;
    }
}
