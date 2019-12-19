package com.github.perschola;

/**
 * Created by leon on 12/17/2019.
 */
public class Person {
    private String firstName;
    private String lastName;

    public Person() {
        firstName = "";
        lastName = "";
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
