package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalNachosDecorator extends AbstractPizzaOrderDecorator{
    public AdditionalNachosDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(3));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", nachos";
    }
}
