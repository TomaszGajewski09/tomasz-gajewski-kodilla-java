package com.kodilla.food2door;

public class ProductOrderService {
    public static void main(String[] args) {
        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.setProducer(new ExtraFoodShop());
        orderProcessor.processOrder("ExtraFoodSupplier", "Jabłka", 10);

        orderProcessor.setProducer(new HealthyShop());
        orderProcessor.processOrder("HealthySupplier", "Marchewki", 5);

        orderProcessor.setProducer(new GlutenFreeShop());
        orderProcessor.processOrder("GlutenFreeSupplier", "Chleb", 2);
    }

}
