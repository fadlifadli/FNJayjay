package demoblazeJunit;

import demoblazeJunit.signup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Login {
    public static WebDriver driver;

    By bttnlogin = By.id("login2");
    By inpusername = By.id("loginusername");
    By inppassword = By.id("loginpassword");
    By loginbttn = By.xpath("//button[contains(text(),'Log in')]");
    By linkname = By.linkText("Welcome TestAuto123");
    By logout = By.linkText("Log out");


    @Test
    public void LoginPage() {
        ChromeOptions options = new ChromeOptions();
        driver = new ChromeDriver(options);
        driver.get("https://www.demoblaze.com/");
        driver.manage().window().maximize();
        driver.findElement(bttnlogin).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(inpusername).click();
        driver.findElement(inpusername).sendKeys("TestAuto123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(inppassword).click();
        driver.findElement(inppassword).sendKeys("Auto123");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(loginbttn).click();
        Assertions.assertEquals(linkname,linkname);
        driver.findElement(logout).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
        Assertions.assertEquals(bttnlogin,bttnlogin);
        driver.quit();

    }
}
