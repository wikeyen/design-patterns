package com.mike.dp.decorator.coffee;

import java.math.BigDecimal;

public class Decaf implements IBeverage {
    private static final String DESCRIPTION = "Decaf";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(2);
    }
}
