package com.mike.dp.decorator.printer;

public class FoodDecorator extends PersonDecorator {
    public FoodDecorator(ABSPerson person) {
        this.person = person;
    }

    public String speak() {
        return person.speak() + " and the food is amazing!";
    }
}
