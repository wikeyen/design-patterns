package com.galiget.patterns.factory;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class Watermelon extends Fruit {
    private final String name = "Watermelon";

}
