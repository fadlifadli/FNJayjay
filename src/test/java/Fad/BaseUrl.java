package Fad;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseUrl {

    protected static WebDriver driver;

    protected void getDriver() {
        ChromeOptions options = new ChromeOptions();

//        driver = new ChromeDriver(options);

        options.addArguments("--headless");
        driver = new ChromeDriver(options);

    }
}
