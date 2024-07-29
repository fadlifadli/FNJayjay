package demoblazeJunit.Stepdef;

import Fad.BaseUrl;
import demoblazeJunit.Page.Purchase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CartStepdefs extends BaseUrl {
    Purchase purchase ;

    @Then("add items samsung to cart")
    public void additemssamsungtocart() {
        purchase = new Purchase(driver);
        driver.get("https://www.demoblaze.com");
        purchase.AddSamsung();
    }

    @Then("add item nexus to cart")
    public void addItemNexusToCart() {
        purchase.AddNexus();
    }

    @When("to page cart")
    public void toPageCart() {
        purchase.toCart();
    }

    @When("purchase item placeholder")
    public void purchaseItemPlaceholder() {
        purchase.PurchaseCart();
    }

    @Then("order items")
    public void orderItems() {
        purchase.order();
    }

    @Then("verfy is succes purchase")
    public void verfyIsSuccesPurchase() {
        purchase.NotifThank();
    }
}
