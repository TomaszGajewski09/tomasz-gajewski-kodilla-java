package com.kodilla.challenges;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class BikeOrderService implements OrderService {
    @Override
    public boolean order(User user, LocalDateTime purchaseTime, Map<Product, Integer> orderList) {
        System.out.println("The order from user: " + user.getUsername() + ", user id: " + user.getUserId() + ", placed on: " + purchaseTime + ", has been accepted");

        return true;
    }
}
