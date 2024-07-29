package demoblazeJunit.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class signup {

    WebDriver driver;

    By bttnSignup = By.id("signin2");
    By usernameSign = By.id("sign-username");
    By passwordSign = By.id("sign-password");
    By signupbttn = By.xpath("//button[contains(text(),'Sign up')]");

    public signup(WebDriver driver){
        this.driver = driver;
    }

    public void bttnsignup(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(bttnSignup).click();
    }

    public void inpUsername(String username){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(usernameSign).sendKeys(username);
    }
    public void inpPassword(String password){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(passwordSign).sendKeys(password);
    }

    public void bttnsignupPopup(){
        driver.findElement(signupbttn).click();
    }

}
