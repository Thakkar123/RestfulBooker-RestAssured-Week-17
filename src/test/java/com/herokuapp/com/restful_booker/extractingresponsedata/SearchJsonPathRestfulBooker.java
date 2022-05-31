package com.herokuapp.com.restful_booker.extractingresponsedata;

import io.restassured.RestAssured;
import io.restassured.response.ValidatableResponse;
import org.junit.BeforeClass;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class SearchJsonPathRestfulBooker {

    static ValidatableResponse response;

    @BeforeClass
    public static void inIt(){
        RestAssured.baseURI = "https://restful-booker.herokuapp.com";
        RestAssured.basePath = "/booking";

        response = given()
                .when()
                .get()
                .then().statusCode(200);
    }

    //verify total records

    @Test
    public void test001(){

        int totalRecords = response.extract().path("size");
        System.out.println("------------------StartingTest---------------------------");
        System.out.println("Total records are : " + totalRecords);
        System.out.println("------------------End of Test---------------------------");

    }


}
