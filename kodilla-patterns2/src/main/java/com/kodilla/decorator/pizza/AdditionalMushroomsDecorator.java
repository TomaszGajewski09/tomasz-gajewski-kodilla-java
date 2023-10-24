package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class AdditionalMushroomsDecorator extends AbstractPizzaOrderDecorator{
    public AdditionalMushroomsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(2));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", mushrooms";
    }
}
