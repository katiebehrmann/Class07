package com.example.android.class07;

import java.io.Serializable;

/**
 * Created by katie on 2/27/17.
 */

public class Person implements Serializable {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name: " + name +
                "\nAge: " + age;
    }
}
