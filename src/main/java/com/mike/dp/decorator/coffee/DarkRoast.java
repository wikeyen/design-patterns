package com.mike.dp.decorator.coffee;

import java.math.BigDecimal;

public class DarkRoast implements IBeverage {
    private static final String DESCRIPTION = "Dark Roast";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }

    @Override
    public BigDecimal cost() {
        return BigDecimal.valueOf(1);
    }
}
