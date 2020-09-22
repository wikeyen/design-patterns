package com.mike.dp.factory.simpleFactory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameFactoryTest {
    private final NameFactory nameFactory = new NameFactory();

    @Test
    void should_return_mike() {
        assertEquals("Mike", nameFactory.getName(NAME.MIKE));
    }
}