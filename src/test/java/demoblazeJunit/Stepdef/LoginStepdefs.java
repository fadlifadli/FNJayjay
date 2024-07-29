package demoblazeJunit.Stepdef;

import Fad.BaseUrl;
import demoblazeJunit.Page.PageLogin;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.time.Duration;

public class LoginStepdefs extends BaseUrl {

    PageLogin pagelogin ;

    @Given("Open Browser demoblaze")
    public void openBrowserDemoblaze() {
        pagelogin = new PageLogin (driver);
        pagelogin.goToLoginPage();
    }

    @And("login input")
    public void loginInput() {
        pagelogin.LoginButton();
    }

    @Then("Input username {string}")
    public void inputUsername(String username) {
        pagelogin.inpUsername(username);
    }
    
    @Then("Input password {string}")
    public void inputPassword(String password) {
        pagelogin.inpPassword(password);
    }

    @When("click button login")
    public void clickButtonLogin() {
        pagelogin.Buttonlogin();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    @And("is home page")
    public void isHomePage() {
        pagelogin.inHome();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
    }

    @Then("verify is pop up login")
    public void verifyIsPopUpLogin() {
        pagelogin.ispopuplogin();

    }
}
