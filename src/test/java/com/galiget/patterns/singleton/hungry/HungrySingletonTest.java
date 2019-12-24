package com.galiget.patterns.singleton.hungry;

import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HungrySingletonTest {

    @Test
    void should_get_same_HungrySingleton_object_when_getInstance_given_100_threads_running() throws InterruptedException {
        int count = 100;
        final CountDownLatch latch = new CountDownLatch(count);
        final Set<HungrySingleton> syncSet = Collections.synchronizedSet(new HashSet<HungrySingleton>());

        for (int i = 0; i < count; i++) {
            new Thread() {
                @Override
                public void run() {
                    HungrySingleton instance = HungrySingleton.getInstance();
                    System.out.println(instance);
                    syncSet.add(instance);
                    latch.countDown();
                }
            }.start();
        }

        latch.await();

        assertEquals(1, syncSet.size());
    }
}