package com.kodilla.challenges;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

public class OrderRequest {
    private User user;
    private LocalDateTime purchaseTime;
    private Map<Product, Integer> orderList;

    public OrderRequest(User user, LocalDateTime purchaseTime, Map<Product, Integer> orderList) {
        this.user = user;
        this.purchaseTime = purchaseTime;
        this.orderList = orderList;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getPurchaseTime() {
        return purchaseTime;
    }

    public Map<Product, Integer> getOrderList() {
        return orderList;
    }
}
