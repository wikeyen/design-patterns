package com.mike.dp.strategy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class StrategyPrinter {
    @Setter
    private PrintBehaviour printBehaviour;

    public String print() {
        return this.printBehaviour.print();
    }
}
