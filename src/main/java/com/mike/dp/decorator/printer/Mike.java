package com.mike.dp.decorator.printer;

public class Mike extends ABSPerson {
    public Mike() {
        this.name = "Mike";
    }

    public String speak() {
        return this.name + " says: ";
    }
}
