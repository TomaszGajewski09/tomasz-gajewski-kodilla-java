package com.kodilla.food2door;

public class HealthyShop implements Producer{
    @Override
    public void process(String supplier, String product, int quantity) {
        System.out.println("HealthyShop - Zamówienie: " + quantity + " sztuk " + product + " od " + supplier);
    }
}
