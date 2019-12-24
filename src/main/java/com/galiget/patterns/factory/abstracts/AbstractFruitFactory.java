package com.galiget.patterns.factory.abstracts;

import com.galiget.patterns.factory.Fruit;

public abstract class AbstractFruitFactory {
    public abstract Fruit getApple();

    public abstract Fruit getBanana();

    public abstract Fruit getWatermelon();
}
