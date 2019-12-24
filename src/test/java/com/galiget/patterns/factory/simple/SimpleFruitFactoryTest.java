package com.galiget.patterns.factory.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class SimpleFruitFactoryTest {

    @Test
    void should_return_correct_fruit_when_getFruit() {
        SimpleFruitFactory fruitFactory = new SimpleFruitFactory();

        assertEquals("Apple", fruitFactory.getFruit("Apple").getName());
        assertEquals("Banana", fruitFactory.getFruit("Banana").getName());
        assertEquals("Watermelon", fruitFactory.getFruit("Watermelon").getName());
        assertNull(fruitFactory.getFruit("I_M_NOT_A_FRUIT"));
    }
}