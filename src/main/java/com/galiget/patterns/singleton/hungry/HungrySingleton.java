package com.galiget.patterns.singleton.hungry;

public class HungrySingleton {
    private HungrySingleton() {
    }

    private static final HungrySingleton hungry = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return hungry;
    }
}
