package com.kodilla.challenges;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface OrderRepository {
    public void createOrder(User user, LocalDateTime purchaseTime, Map<Product, Integer> orderList);
}
