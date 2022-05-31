package com.herokuapp.com.restful_booker.userinfo;

import com.herokuapp.com.restful_booker.model.UserPojo;
import com.herokuapp.com.restful_booker.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class UserPutTest extends TestBase {

    @Test
    public void updateUserWithPut(){
        HashMap<String,String> checkInOutDatesData = new HashMap<>();
        checkInOutDatesData.put("checkin", "2018-01-01");
        checkInOutDatesData.put("checkout", "2019-01-01");
        UserPojo userPojo = new UserPojo();
        userPojo.setFirstname("Jimmy");
        userPojo.setLastname("Brown");
        userPojo.setTotalprice(111);
        userPojo.setDepositpaid(true);
        userPojo.setCheckInOutDates(checkInOutDatesData);
        userPojo.setAdditionalneeds("Veg");

        Response response = given()
                .header("Content-Type","application/json")
                .auth().preemptive().basic("admin","password123")
                .body(userPojo)
                .pathParam("id",1512)
                .when()
                .put("/booking/{id}");
        response.prettyPrint();
        response.then().statusCode(200);

    }
}
