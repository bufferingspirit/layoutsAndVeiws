package com.example.admin.layoutsandveiws;

/**
 * Created by Admin on 8/2/2017.
 */

public class Person {

    String name;
    String gender;


    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
