package com.herokuapp.com.restful_booker.userinfo;

import com.herokuapp.com.restful_booker.model.UserPojo;
import com.herokuapp.com.restful_booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class UserPostTest extends TestBase {

    @Test
    public void createUser(){

        HashMap<String,String> checkInOutDatesData = new HashMap<>();
        checkInOutDatesData.put("checkin","2018-01-01");
        checkInOutDatesData.put("checkout","2019-01-01");

        UserPojo userPojo = new UserPojo();
        userPojo.setFirstname("Jim");
        userPojo.setLastname("Brown");
        userPojo.setTotalprice(111);
        userPojo.setDepositpaid(true);
        userPojo.setCheckInOutDates(checkInOutDatesData);
        userPojo.setAdditionalneeds("Breakfast");

        Response response = given()
                .header("Content-Type","application/json")
                .header("Accept", "application/json")
                .body(userPojo)
                .when()
                .post("/booking");
        response.then().statusCode(200);
        response.prettyPrint();
    }

}
