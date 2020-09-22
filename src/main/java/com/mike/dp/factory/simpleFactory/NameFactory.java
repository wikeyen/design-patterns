package com.mike.dp.factory.simpleFactory;

public class NameFactory {
    public String getName(NAME name) {
        switch (name) {
            case MIKE:
                return "Mike";
            case KATHERINE:
                return "Katherine";
            default:
                return "";
        }
    }
}

enum NAME {
    MIKE, KATHERINE
}
