package com.galiget.patterns.factory.statics;

import com.galiget.patterns.factory.Apple;
import com.galiget.patterns.factory.Banana;
import com.galiget.patterns.factory.Fruit;
import com.galiget.patterns.factory.Watermelon;

public final class FruitStaticFactory {
    private static final Fruit apple = new Apple();
    private static final Fruit banana = new Banana();
    private static final Fruit watermelon = new Watermelon();

    private FruitStaticFactory() {
    }

    public static Fruit getApple() {
        return apple;
    }

    public static Fruit getBanana() {
        return banana;
    }

    public static Fruit getWatermelon() {
        return watermelon;
    }
}
