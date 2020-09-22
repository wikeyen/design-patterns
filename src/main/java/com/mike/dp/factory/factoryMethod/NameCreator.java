package com.mike.dp.factory.factoryMethod;

/**
 * return one string at a time,
 * subclass will implement the factory method with implementing details
 */
public abstract class NameCreator {
    public String getName() {
        return createName();
    }

    /**
     * factory method
     *
     * @return
     */
    protected abstract String createName();
}
