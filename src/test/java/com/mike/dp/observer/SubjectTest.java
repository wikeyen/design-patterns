package com.mike.dp.observer;

import org.junit.jupiter.api.Test;

class SubjectTest {
    private ISubject subject = new Subject();

    @Test
    void should_print_hello_mike_and_hello_world_when_notify_observers() {
        IObserver helloMikeObserver = new HelloMikeObserver();
        IObserver helloWorldObserver = new HelloWorldObserver();

        subject.registerObserver(helloMikeObserver);
        subject.registerObserver(helloWorldObserver);

        subject.notifyAllObservers();
    }
}