package dummyapi;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DeleteUser {

    @Test
    public void deleteUser(){
//        define baseURI
        RestAssured.baseURI="https://dummyjson.com";
//        data to delete
        int userToDelete = 1;
//        test delete api/users/4
        given().log().all()
                .when().delete("/users/" +userToDelete)
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("id", Matchers.equalTo(userToDelete))
                ;
    }
}
