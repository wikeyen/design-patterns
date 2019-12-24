package com.galiget.patterns.factory;


import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Banana extends Fruit {
    private final String name = "Banana";
}
