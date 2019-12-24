package com.galiget.patterns.factory.standard;

import com.galiget.patterns.factory.Fruit;
import com.galiget.patterns.factory.Watermelon;

public class WatermelonFactoryStandard implements StandardFruitFactory {
    public Fruit getFruit() {
        return new Watermelon();
    }
}
