package com.mike.dp.decorator.coffee;

import java.math.BigDecimal;

public class Mocha extends CondimentDecorator {
    private static final BigDecimal COST = BigDecimal.valueOf(0.1);
    private static final String DESCRIPTION = "Mocha";

    public Mocha(IBeverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", " + DESCRIPTION;
    }

    @Override
    public BigDecimal cost() {
        return beverage.cost().add(COST);
    }
}
