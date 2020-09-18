package com.mike.dp.decorator.coffee;

import java.math.BigDecimal;

public class Sugar extends CondimentDecorator {
    private static final String DESCRIPTION = "Sugar";
    private static final BigDecimal COST = BigDecimal.valueOf(0.2);

    public Sugar(IBeverage beverage) {
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
