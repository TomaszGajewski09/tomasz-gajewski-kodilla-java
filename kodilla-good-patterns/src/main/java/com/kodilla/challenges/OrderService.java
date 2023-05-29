package com.kodilla.challenges;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public interface OrderService {
    public boolean order(User user, LocalDateTime purchaseTime, Map<Product, Integer> orderList);
}
