package com.galiget.patterns.factory.abstracts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitFactoryTest {
    @Test
    void should_return_correct_fruit_name_when_get_each_fruit() {
        AbstractFruitFactory fruitFactory = new FruitFactory();

        assertEquals("Apple", fruitFactory.getApple().getName());
        assertEquals("Banana", fruitFactory.getBanana().getName());
        assertEquals("Watermelon", fruitFactory.getWatermelon().getName());
    }
}