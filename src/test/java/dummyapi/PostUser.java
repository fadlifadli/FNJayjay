package dummyapi;

import org.hamcrest.Matchers;
import org.json.JSONObject;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class PostUser {

    @Test
    public  void LoginUser() {

        String username1 = "emilys";
        String password1  = "emilyspass";

        JSONObject bodyObj = new JSONObject();

        bodyObj.put("username", username1);
        bodyObj.put("password", password1);

        given()
                .header("Content-Type", "application/json")
                .header("Accept", "appliaction/json")
                .body(bodyObj.toString())
                .when()
                .post("https://dummyjson.com/user/login")
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body("username", Matchers.equalTo(username1))
                .assertThat().body("email",Matchers.equalTo("emily.johnson@x.dummyjson.com"))
                ;
    }


    @Test
    public  void AddNewUser() {

        String firstName1 = "Joko";
        String lastName1  = "koko";
        String age1  = "24";

        JSONObject bodyObj = new JSONObject();

        bodyObj.put("firstName", firstName1);
        bodyObj.put("lastName", lastName1);
        bodyObj.put("age", age1);

        given()
                .header("Content-Type", "application/json")
                .header("Accept", "appliaction/json")
                .body(bodyObj.toString())
                .when()
                .post("https://dummyjson.com/users/add")
                .then().log().all()
                .assertThat().statusCode(201)
                .assertThat().body("firstName", Matchers.equalTo("Joko"))
                .assertThat().body("lastName",Matchers.equalTo("koko"))
                ;
    }
}
