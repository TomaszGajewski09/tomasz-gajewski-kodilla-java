package com.kodilla.food2door;

public class OrderProcessor {
    private Producer producer;

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public void processOrder(String supplier, String product, int quantity) {
        producer.process(supplier, product, quantity);
    }
}
