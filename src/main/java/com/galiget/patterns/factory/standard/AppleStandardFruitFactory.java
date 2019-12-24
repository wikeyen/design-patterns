package com.galiget.patterns.factory.standard;

import com.galiget.patterns.factory.Apple;
import com.galiget.patterns.factory.Fruit;

public class AppleStandardFruitFactory implements StandardFruitFactory {
    public Fruit getFruit() {
        return new Apple();
    }
}
