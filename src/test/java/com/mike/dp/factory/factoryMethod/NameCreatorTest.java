package com.mike.dp.factory.factoryMethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NameCreatorTest {
    @Test
    void should_return_mike() {
        var mikeNameCreator = new MikeNameCreator();

        assertEquals("Mike", mikeNameCreator.getName());
    }
}