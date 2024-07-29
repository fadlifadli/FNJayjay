package demoblazeJunit.Page;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class Purchase {

    WebDriver driver;

    By samsungHp = By.linkText("Samsung galaxy s6");
    By Nexus6 = By.linkText("Nexus 6");
    By Cart = By.linkText("Cart");
    By addTocart = By.linkText("Add to cart");
    By Home = By.partialLinkText("Home");
    By Placeholder = By.xpath("/html[1]/body[1]/div[6]/div[1]/div[2]/button[1]");

//    formplaceorder
    By namepla = By.id("name");
    By countryla =By.id("country");
    By citypla = By.id("city");
    By creditcardpla = By.id("card");
    By monthpla = By.id("month");
    By yearpla = By.id("year");
    By bttnorder = By.xpath("//button[contains(text(),'Purchase')]");

    By notifPurchase = By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");

    public Purchase(WebDriver driver){
        this.driver = driver;
    }

    public void Homepage(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(Home).click();
    }

    public void AddSamsung(){
        driver.findElement(samsungHp).click();
        driver.findElement(addTocart).click();
    }

    public void AddNexus(){
        driver.findElement(Home).click();
        driver.findElement(Nexus6).click();
        driver.findElement(addTocart).click();
    }

    public void toCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(Cart).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(Cart).click();
    }

    public void PurchaseCart(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(Placeholder).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

    public void order(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(namepla).sendKeys("1");
        driver.findElement(countryla).sendKeys("1");
        driver.findElement(citypla).sendKeys("1");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.findElement(monthpla).sendKeys("1");
        driver.findElement(yearpla).sendKeys("1");
        driver.findElement(creditcardpla).sendKeys("1");
        driver.findElement(bttnorder).click();
    }

    public void NotifThank(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        Assertions.assertEquals(notifPurchase,notifPurchase);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
    }

}
