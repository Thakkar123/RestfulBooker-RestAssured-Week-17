package com.herokuapp.com.restful_booker.userinfo;

import com.herokuapp.com.restful_booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class UserDeleteTest extends TestBase {

    @Test
    public void deleteUser(){

        Response response = given()
                .header("Content-Type", "application/json")
                .header("Authorization", "Bearer 0474d697c0f327f")
                .auth().preemptive().basic("admin", "password123")
                .pathParam("id", 1489)
                .when()
                .delete("/booking/{id}");
        response.then().statusCode(201);
        response.prettyPrint();
    }
}
