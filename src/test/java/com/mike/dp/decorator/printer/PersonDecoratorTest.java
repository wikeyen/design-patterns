package com.mike.dp.decorator.printer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PersonDecoratorTest {

    @Test
    void should_mike_says_about_the_weather_and_food() {
        ABSPerson mike = new Mike();
        assertEquals("Mike", mike.getName());

        mike = new WeatherDecorator(mike);
        mike = new FoodDecorator(mike);
        assertEquals("Mike says: it is good weather today,  and the food is amazing!", mike.speak());
    }

}