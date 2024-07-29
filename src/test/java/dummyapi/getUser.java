package dummyapi;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getUser {

    @Test
    public void GetListUsers(){
        RestAssured.baseURI = "https://dummyjson.com/";
        given()
                .when()
                .get( "user")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("total", Matchers.equalTo(208))
                .assertThat().body("limit", Matchers.equalTo(30))
                .assertThat().body("skip", Matchers.equalTo(0))
        ;
    }

    @Test
    public void Users1(){
        RestAssured.baseURI = "https://dummyjson.com/";
        given()
                .when()
                .get( "user/1")
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("firstName", Matchers.equalTo("Emily"))
                .assertThat().body("lastName", Matchers.equalTo("Johnson"))
                .assertThat().body("age", Matchers.equalTo(28))
                .assertThat().body("gender", Matchers.equalTo("female"))
        ;
    }

    @Test
    public void GetUsers2(){
        given()
                .when()
                .get( "https://dummyjson.com/user/2")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("firstName", Matchers.equalTo("Michael"))
                .assertThat().body("lastName", Matchers.equalTo("Williams"))
                .assertThat().body("age", Matchers.equalTo(35))
                .assertThat().body("email", Matchers.equalTo("michael.williams@x.dummyjson.com"))
        ;
    }
}
