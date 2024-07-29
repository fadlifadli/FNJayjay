package demoblazeJunit.Stepdef;

import Fad.BaseUrl;
import demoblazeJunit.Page.PageLogin;
import demoblazeJunit.Page.signup;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupStepdefs extends BaseUrl {

    signup Signup ;

    @Then("clik button signup")
    public void clikbuttonsignup() {
        Signup = new signup(driver);
        driver.get("https://www.demoblaze.com");
        Signup.bttnsignup();
    }

    @And("Input signup username {string}")
    public void inputSignupUsername(String username) {
        Signup.inpUsername(username);
    }

    @And("Input signup password {string}")
    public void inputSignupPassword(String password) {
        Signup.inpPassword(password);
    }

    @When("click button popup signup")
    public void clickButtonPopupSignup() {
        Signup.bttnsignupPopup();
    }
}
