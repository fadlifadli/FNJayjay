package dummyapi;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PutUser {

    @Test
    public void putUser(){
//        define baseURI
        RestAssured.baseURI="https://dummyjson.com";
//        data to delete
        int userPUT = 2;
//        test put api/users/2

        String lastName1 = "Fadhli";
        String age1 = "32";
        String username1 = "handsomeFull";

        HashMap<String, Object> bodyMap = new HashMap<>();
        bodyMap.put("lastName", lastName1);
        bodyMap.put("age", age1);
        bodyMap.put("username", username1);
        JSONObject jsonObject = new JSONObject(bodyMap);

        given().log().all()
                .header("Content-Type", "application/json")
                .body(jsonObject.toString())
                .put("/users/" +userPUT)
                .then()
                .log().all()
                .assertThat().statusCode(200)
                .assertThat().body("lastName", Matchers.equalTo(lastName1))
                .assertThat().body("age", Matchers.equalTo(age1))
                .assertThat().body("username", Matchers.equalTo(username1))
        ;
    }
}
