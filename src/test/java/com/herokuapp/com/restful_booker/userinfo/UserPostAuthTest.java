package com.herokuapp.com.restful_booker.userinfo;

import com.herokuapp.com.restful_booker.testbase.TestBase;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserPostAuthTest extends TestBase {

    @Test
    public void createAuthorisation(){

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.basePath = "/auth";
        String payloadData = "{\n" +
                "    \"username\" : \"admin\",\n" +
                "    \"password\" : \"password123\"\n" +
                "}";

        Response response = given()
                .header("Content-Type","application/json")
                .body(payloadData)
                .when()
                .post();
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
