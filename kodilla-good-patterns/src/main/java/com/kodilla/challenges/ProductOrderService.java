package com.kodilla.challenges;

public class ProductOrderService {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new BikeOrderService(), new BikeOrderRepository());
        orderProcessor.process(orderRequest);
    }
}
