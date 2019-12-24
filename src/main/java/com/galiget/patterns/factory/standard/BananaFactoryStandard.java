package com.galiget.patterns.factory.standard;

import com.galiget.patterns.factory.Banana;
import com.galiget.patterns.factory.Fruit;

public class BananaFactoryStandard implements StandardFruitFactory {

    public Fruit getFruit() {
        return new Banana();
    }
}
