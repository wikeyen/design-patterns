package com.mike.dp.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StrategyPrinterTest {
    private StrategyPrinter printer;

    @Test
    void should_print_hello_world_when_print_given_hello_world_printer() {
        PrintBehaviour helloWorldBehaviour = new HelloWorldPrintBehaviour();
        printer = new StrategyPrinter(helloWorldBehaviour);

        String res = printer.print();

        assertEquals("Hello World!", res);
    }

    @Test
    void should_print_hello_mike_when_print_given_hello_mike_printer() {
        printer = new StrategyPrinter();
        PrintBehaviour helloMikeBehaviour = new HelloMikePrintBehaviour();
        printer.setPrintBehaviour(helloMikeBehaviour);

        String res = printer.print();

        assertEquals("Hello Mike!", res);
    }

    @Test
    void should_first_print_hello_world_then_hello_mike_when_print_given_change_helloWorldBehaviour_to_helloMikeBehaviour_dynamically() {
        HelloWorldPrintBehaviour helloWorldPrintBehaviour = new HelloWorldPrintBehaviour();
        printer = new StrategyPrinter(helloWorldPrintBehaviour);

        String firstRes = printer.print();

        HelloMikePrintBehaviour helloMikePrintBehaviour = new HelloMikePrintBehaviour();
        printer.setPrintBehaviour(helloMikePrintBehaviour);

        String secondRes = printer.print();

        assertEquals("Hello World!", firstRes);
        assertEquals("Hello Mike!", secondRes);
    }

}