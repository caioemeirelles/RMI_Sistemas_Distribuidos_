package com.company;

public class GreetingObject implements Greeting {

    private String fmtString = "Hello, %s";

    public String greet(String name) {
        return String.format(this.fmtString, name);
    }
}
