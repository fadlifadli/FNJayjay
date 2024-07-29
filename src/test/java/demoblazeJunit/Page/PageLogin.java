package demoblazeJunit.Page;



import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;


public class PageLogin {

    WebDriver driver;

    By bttnlogin = By.id("login2");
    By inpusername = By.id("loginusername");
    By inppassword = By.id("loginpassword");
    By loginbttn = By.xpath("//button[contains(text(),'Log in')]");
    By linkname = By.linkText("Welcome TestAuto123");
    By logout = By.linkText("Log out");

    public PageLogin(WebDriver driver){
        this.driver = driver;
    }

    public void goToLoginPage(){
        driver.get("https://www.demoblaze.com");
    }

    public void LoginButton(){
        driver.findElement(bttnlogin).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }
    public void inpUsername(String username){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        driver.findElement(inpusername).sendKeys(username);
    }
    public void inpPassword(String password){
        driver.findElement(inppassword).sendKeys(password);
    }
    public void Buttonlogin(){
        driver.findElement(loginbttn).click();
    }

    public void inHome(){
        driver.findElement(linkname).click();
    }

    public void ispopuplogin(){
        Assertions.assertEquals(bttnlogin,bttnlogin);
    }


}
