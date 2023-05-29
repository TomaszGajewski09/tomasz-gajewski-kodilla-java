package com.kodilla.food2door;

public class ExtraFoodShop implements Producer{
    @Override
    public void process(String supplier, String product, int quantity) {
        System.out.println("ExtraFoodShop - Zamówienie: " + quantity + " sztuk " + product + " od " + supplier);
    }
}
