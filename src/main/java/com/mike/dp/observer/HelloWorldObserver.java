package com.mike.dp.observer;

public class HelloWorldObserver implements IObserver {
    @Override
    public <T> void update(T info) {
        System.out.println(info + " World!");
    }
}
