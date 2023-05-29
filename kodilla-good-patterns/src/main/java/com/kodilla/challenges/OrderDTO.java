package com.kodilla.challenges;

public class OrderDTO {
    private User user;
    private boolean isRented;

    public OrderDTO(User user, boolean isRented) {
        this.user = user;
        this.isRented = isRented;
    }

    public User getUser() {
        return user;
    }

    public boolean isRented() {
        return isRented;
    }
}
