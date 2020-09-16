package com.mike.dp.observer;

public interface IObserver {
    <T> void update(T info);
}
