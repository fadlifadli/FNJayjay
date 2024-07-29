package demoblazeJunit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class signup {
    public static WebDriver driver;
    By bttnSignup = By.id("signin2");
    By username = By.id("sign-username");
    By password = By.id("sign-password");
    By signupbttn = By.xpath("//button[contains(text(),'Sign up')]");

    @Test
    public void goToPage() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.demoblaze.com/");
        driver.findElement(bttnSignup).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        driver.findElement(username).click();
        driver.findElement(username).sendKeys("TestAuto");
        driver.findElement(password).click();
        driver.findElement(password).sendKeys("Auto123");
        driver.findElement(signupbttn).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        driver.quit();

    }

}
