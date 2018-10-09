package com.company.appendix;

public class Person {
    private String lastName;
    private String firstName;

    public Person(){
    }

    public Person(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }
}
