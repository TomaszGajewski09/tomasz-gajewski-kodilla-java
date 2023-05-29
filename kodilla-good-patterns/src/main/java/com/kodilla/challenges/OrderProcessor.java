package com.kodilla.challenges;

public class OrderProcessor {
    private InformationService informationService; // wysylanie informacji do uzytkownika (mail,sms, itp)
    private OrderService orderService; // serwis zamowien, informuje czy jest mozliwosc przyjecia zamowienia
    private OrderRepository orderRepository;    // gromadzenie danych o zamowieniach

    public OrderProcessor(InformationService informationService, OrderService orderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    // OrderRequest - posiada informacje o zamowieniu (data, produkt, ilosc)
    public OrderDTO process(OrderRequest orderRequest) {
        boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getPurchaseTime(), orderRequest.getOrderList());

        if (isOrdered) {
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getPurchaseTime(), orderRequest.getOrderList());
            return new OrderDTO(orderRequest.getUser(), true);
        } else {
            return new OrderDTO(orderRequest.getUser(), false);
        }
    }


}
