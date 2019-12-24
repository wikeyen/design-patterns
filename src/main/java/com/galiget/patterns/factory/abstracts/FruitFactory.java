package com.galiget.patterns.factory.abstracts;

import com.galiget.patterns.factory.Apple;
import com.galiget.patterns.factory.Banana;
import com.galiget.patterns.factory.Fruit;
import com.galiget.patterns.factory.Watermelon;

public class FruitFactory extends AbstractFruitFactory {
    public Fruit getApple() {
        return new Apple();
    }

    public Fruit getBanana() {
        return new Banana();
    }

    public Fruit getWatermelon() {
        return new Watermelon();
    }
}
