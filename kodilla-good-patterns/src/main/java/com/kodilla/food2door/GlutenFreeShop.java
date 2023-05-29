package com.kodilla.food2door;

public class GlutenFreeShop implements Producer{
    @Override
    public void process(String supplier, String product, int quantity) {
        System.out.println("GlutenFreeShop - Zamówienie: " + quantity + " sztuk " + product + " od " + supplier);
    }
}
