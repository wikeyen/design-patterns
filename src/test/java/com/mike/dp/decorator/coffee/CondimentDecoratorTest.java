package com.mike.dp.decorator.coffee;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CondimentDecoratorTest {
    @Test
    void should_return_decaf_description_and_2_point_3_as_cost() {
        IBeverage deCaf = new Decaf();
        deCaf = new Mocha(deCaf);
        deCaf = new Sugar(deCaf);

        assertEquals("Decaf, Mocha, Sugar", deCaf.getDescription());
        assertEquals(BigDecimal.valueOf(2.3), deCaf.cost());
    }

    @Test
    void should_return_darkRoast_description_and_1_point_3_as_cost() {
        IBeverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Sugar(darkRoast);

        assertEquals("Dark Roast, Mocha, Sugar", darkRoast.getDescription());
        assertEquals(BigDecimal.valueOf(1.3), darkRoast.cost());
    }

}