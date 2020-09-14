package com.mike.dp.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * encapsulate algorithms by using mixin rather than inheritance,
 * proving a setting to allow change of algorithm at runtime.
 */
@NoArgsConstructor
@AllArgsConstructor
public class StrategyPrinter {
    @Setter
    private PrintBehaviour printBehaviour;

    public String print() {
        return this.printBehaviour.print();
    }
}
