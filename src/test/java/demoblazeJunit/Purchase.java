package demoblazeJunit;
import demoblazeJunit.Login;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Purchase {

    public static WebDriver driver;

    By bttnlogin = By.id("login2");
    By inpusername = By.id("loginusername");
    By inppassword = By.id("loginpassword");
    By loginbttn = By.xpath("//button[contains(text(),'Log in')]");
    By linkname = By.linkText("Welcome TestAuto123");
    By logout = By.linkText("Log out");


    By samsungHp = By.xpath("//a[contains(text(),'Samsung galaxy s6')]");
    By Nexus6 = By.linkText("Nexus 6");
    By Cart = By.linkText("Cart");
    By addTocart = By.linkText("Add to cart");
    By Home = By.linkText("Home");
    By Placeholder = By.xpath("//button[contains(text(),'Place Order')]");


    @Test
    public void AdditemsTocart() {
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

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.findElement(Home).click();
        driver.findElement(samsungHp).click();
        driver.findElement(addTocart).click();

        driver.findElement(Home).click();
        driver.findElement(Nexus6).click();
        driver.findElement(addTocart).click();



        driver.quit();

    }
}
