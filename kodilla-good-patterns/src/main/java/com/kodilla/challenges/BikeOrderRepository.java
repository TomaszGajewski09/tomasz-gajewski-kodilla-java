package com.kodilla.challenges;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class BikeOrderRepository implements OrderRepository {
    @Override
    public void createOrder(User user, LocalDateTime purchaseTime, Map<Product, Integer> orderList) {
        System.out.println("Order has been added to the repository.");
    }
}
