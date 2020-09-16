package com.mike.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject implements ISubject {
    private final List<IObserver> observerList;

    public Subject() {
        this.observerList = new ArrayList<>();
    }

    public void registerObserver(IObserver observer) {
        observerList.add(observer);
    }

    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    public void notifyAllObservers() {
        observerList.forEach(
                observer -> observer.update(buildName())
        );

    }

    private String buildName() {
        return "Hello,";
    }
}
