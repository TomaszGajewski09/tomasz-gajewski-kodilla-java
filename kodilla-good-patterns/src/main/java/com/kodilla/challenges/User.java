package com.kodilla.challenges;

public class User {
    private String name, lastName, username;
    private int userId;

    public User(String name, String lastName, String username, int userId) {
        this.name = name;
        this.lastName = lastName;
        this.username = username;
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getUserId() {
        return userId;
    }
}
