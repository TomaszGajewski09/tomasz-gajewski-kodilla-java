package com.kodilla.challenges;

import java.time.LocalDateTime;
import java.util.*;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("Adam", "Kowalski", "AKow33", 343277);

        LocalDateTime purchaseTime = LocalDateTime.of(2023, 5, 12, 13, 43);

        Map<Product, Integer> orderList = new HashMap<>();
        orderList.put(new Product("Rowerek biegowy", 280, 4), 1);
        orderList.put(new Product("Rower miejski", 1300, 14), 2);

        return new OrderRequest(user, purchaseTime, orderList);
    }
}
