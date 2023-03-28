package com.kodilla.exception.test.flights;

public class RouteNotFoundException extends Exception{
    public RouteNotFoundException() {
        super("Invalid airport");
    }
}
