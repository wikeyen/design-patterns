package com.galiget.patterns.factory.standard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StandardFruitFactoryTest {
    @Test
    void should_return_correct_fruits_when_getFruit() {
        StandardFruitFactory appleStandardFruitFactory = new AppleStandardFruitFactory();
        StandardFruitFactory bananaFactoryStandard = new BananaFactoryStandard();
        StandardFruitFactory watermelonFactoryStandard = new WatermelonFactoryStandard();

        assertEquals("Apple", appleStandardFruitFactory.getFruit().getName());
        assertEquals("Banana", bananaFactoryStandard.getFruit().getName());
        assertEquals("Watermelon", watermelonFactoryStandard.getFruit().getName());
    }
}