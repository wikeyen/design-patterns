package com.mike.dp.factory.abstractyFactory;

import com.mike.dp.factory.abstractyFactory.factories.AbsNameFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AbsNameFactoryTest {
    @Test
    void should_return_mikes_firstName() {
        AbsNameFactory mikeName = new MikeName();

        assertEquals("Mike", mikeName.createFirstName().getFirstName());
        assertEquals("Yan", mikeName.createLastName().getLastName());
    }
}