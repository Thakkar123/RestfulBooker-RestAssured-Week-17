package com.herokuapp.com.restful_booker.model;

import java.util.HashMap;

public class UserPojo {

    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private Integer totalprice;
    private Boolean depositpaid;
    private HashMap<String,String> checkInOutDates;
    private String additionalneeds;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(Integer totalprice) {
        this.totalprice = totalprice;
    }

    public Boolean getDepositpaid() {
        return depositpaid;
    }

    public void setDepositpaid(Boolean depositpaid) {
        this.depositpaid = depositpaid;
    }

    public HashMap<String,String> getCheckInOutDates() {
        return checkInOutDates;
    }

    public void setCheckInOutDates(HashMap<String,String> checkInOutDates) {
        this.checkInOutDates = checkInOutDates;
    }

    public String getAdditionalneeds() {
        return additionalneeds;
    }

    public void setAdditionalneeds(String additionalneeds) {
        this.additionalneeds = additionalneeds;
    }

 }