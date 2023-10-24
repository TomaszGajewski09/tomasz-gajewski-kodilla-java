package com.kodilla.decorator.taxiportal;

import com.kodilla.decorator.taxiportal.AbstractTaxiOrderDecorator;
import com.kodilla.decorator.taxiportal.TaxiOrder;

import java.math.BigDecimal;

public class UberNetworkOrderDecorator extends AbstractTaxiOrderDecorator {
    public UberNetworkOrderDecorator(TaxiOrder taxiOrder) {
        super(taxiOrder);
    }

    @Override
    public BigDecimal getCost() {
        // hardcoded stub cost = 20
        return super.getCost().add(new BigDecimal(20));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " by Uber Network";
    }
}