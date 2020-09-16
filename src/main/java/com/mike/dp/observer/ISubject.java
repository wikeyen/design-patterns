package com.mike.dp.observer;

public interface ISubject {
    void registerObserver(IObserver observer);

    void removeObserver(IObserver observer);

    void notifyAllObservers();
}
