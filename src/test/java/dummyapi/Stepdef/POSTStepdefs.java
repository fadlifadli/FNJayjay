package dummyapi.Stepdef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.json.JSONObject;

import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;

import org.hamcrest.Matchers;

public class POSTStepdefs {

    private JSONObject bodyObj;
    private io.restassured.response.Response response;

    @Given("I have a username {string} and a password {string}")
    public void i_have_a_username_and_a_password(String username, String password) {
        bodyObj = new JSONObject();
        bodyObj.put("username", username);
        bodyObj.put("password", password);
    }

    @When("I send a POST request to {string}")
    public void iSendAPOSTRequestTo(String url) {
        response = given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .body(bodyObj.toString())
                .when()
                .post("https://dummyjson.com" + url);
    }

    @Then("the response status code should be {int}")
    public void theResponseStatusCodeShouldBe(int statusCode) {
        response.then().assertThat().statusCode(statusCode);
    }


    @And("the response should contain the username {string}")
    public void theResponseShouldContainTheUsername(String username) {
        assertThat(response.jsonPath().getString("username"), Matchers.equalTo(username));

    }


    @And("the response should contain the email {string}")
    public void theResponseShouldContainTheEmail(String email) {
        assertThat(response.jsonPath().getString("email"), Matchers.equalTo(email));
    }

    @Given("I have a first name {string}, last name {string}, and age {string}")
    public void iHaveAFirstNameLastNameAndAge(String firstName, String lastName, String age) {
        bodyObj = new JSONObject();
        bodyObj.put("firstName", firstName);
        bodyObj.put("lastName", lastName);
        bodyObj.put("age", age);
    }


    @And("the response should contain the first name {string}")
    public void theResponseShouldContainTheFirstName(String firstName) {
        assertThat(response.jsonPath().getString("firstName"), Matchers.equalTo(firstName));

    }

    @And("the response should contain the last name {string}")
    public void theResponseShouldContainTheLastName(String lastName) {
        assertThat(response.jsonPath().getString("lastName"), Matchers.equalTo(lastName));
    }

}
