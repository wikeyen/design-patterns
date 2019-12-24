package com.galiget.patterns.factory;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Apple extends Fruit {
    private final String name = "Apple";
}
