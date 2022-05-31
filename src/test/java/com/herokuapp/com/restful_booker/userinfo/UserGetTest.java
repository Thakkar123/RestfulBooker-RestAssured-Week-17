package com.herokuapp.com.restful_booker.userinfo;

import com.herokuapp.com.restful_booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserGetTest extends TestBase {
    @Test
    public void getAllUserInfo(){

        Response response = given()
                .when()
                .get("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }
    @Test
    public void getSingleUserInfo() {

        Response response = given()
                .pathParam("id", 165)
                .when()
                .get("/booking/{id}");
        response.then().statusCode(200);
        response.prettyPrint();
    }
}
