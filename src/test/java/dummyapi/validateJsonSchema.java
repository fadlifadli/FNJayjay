package dummyapi;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.File;

import static io.restassured.RestAssured.given;

public class validateJsonSchema {

    @Test
    public void testValidateJsonSchemaGetSingleUser(){
//        define baseURI
        RestAssured.baseURI = "https://dummyjson.com/";
//        data to get
        int userToGet = 1;
//        file Json Schema to compare
        File file =new File("src/test/resources/jsonSchema/GetSingleUserSchema.json");
//        test get api/user/5
        given().log().all()
                .when().get("user/" + userToGet)
                .then().log().all()
                .assertThat().statusCode(200)
                .assertThat().body(JsonSchemaValidator.matchesJsonSchema(file))
                ;
    }
}
