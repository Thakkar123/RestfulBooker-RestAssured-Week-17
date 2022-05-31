package com.herokuapp.com.restful_booker.testbase;

import io.restassured.RestAssured;
import org.junit.BeforeClass;

public class TestBase {

    @BeforeClass

    public static void inIt(){

        RestAssured.baseURI = "https://restful-booker.herokuapp.com";

    }

}
