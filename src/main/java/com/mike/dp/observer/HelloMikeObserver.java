package com.mike.dp.observer;

public class HelloMikeObserver implements IObserver {
    @Override
    public <T> void update(T info) {
        System.out.println(info + " Mike!");
    }
}
