package com.mike.dp.singleton.double_checked_locking;

import java.util.Objects;

public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton INSTANCE;

    private DoubleCheckedLockingSingleton() {
    }

    private static DoubleCheckedLockingSingleton getInstance() {
        if (Objects.isNull(INSTANCE)) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (Objects.isNull(INSTANCE)) {
                    INSTANCE = new DoubleCheckedLockingSingleton();
                }
            }
        }

        return INSTANCE;
    }
}
