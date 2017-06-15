package com.example.nicolas.mvpsimpleexample.Model;

/**
 * Created by Nicolas on 13/06/2017.
 */

// Basic User class with the default properties

public class User {

    private String fullName;
    private String email;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "FullName : " + fullName + "\nEmail : " + email;
    }
}
