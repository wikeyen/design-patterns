package com.mike.dp.singleton.eager;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {

    }

    public static EagerSingleton getINSTANCE() {
        return INSTANCE;
    }
}
