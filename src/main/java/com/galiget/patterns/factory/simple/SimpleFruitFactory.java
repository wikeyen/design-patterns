package com.galiget.patterns.factory.simple;

import com.galiget.patterns.factory.Apple;
import com.galiget.patterns.factory.Banana;
import com.galiget.patterns.factory.Fruit;
import com.galiget.patterns.factory.Watermelon;

public class SimpleFruitFactory {
    public Fruit getFruit(String name) {
        if ("Apple".equals(name)) {
            return new Apple();
        }
        if ("Banana".equals(name)) {
            return new Banana();
        }
        if ("Watermelon".equals(name)) {
            return new Watermelon();
        }

        return null;
    }
}
