package com.personal.designpatterns.strategy.pattern.strategy.output.impl;

import com.personal.designpatterns.strategy.pattern.strategy.output.OutputStrategy;

public class ConsoleOutputStrategy implements OutputStrategy {

    @Override
    public void writeOutput(String  output) {
        System.out.println(output);
    }
}
