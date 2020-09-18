package com.mike.dp.decorator.printer;

public class WeatherDecorator extends PersonDecorator {
    public WeatherDecorator(ABSPerson person) {
        this.person = person;
    }

    public String speak() {
        return person.speak() + "it is good weather today, ";
    }
}
