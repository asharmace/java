package com.personal.designpatterns.strategy.pattern.processor.impl;

import com.personal.designpatterns.strategy.pattern.processor.DataProcessor;
import com.personal.designpatterns.strategy.pattern.strategy.input.impl.DynamoDBInputStrategy;
import com.personal.designpatterns.strategy.pattern.strategy.output.impl.ConsoleOutputStrategy;

public class DataProcessorImpl2 extends DataProcessor {

    public DataProcessorImpl2() {
        inputStrategy = new DynamoDBInputStrategy();
        outputStrategy = new ConsoleOutputStrategy();
    }

    @Override
    public void init() {
        key = 999;
    }

    @Override
    public String process(String input) {
        return "Processed input {" + input + "} from DataProcessorImpl2";
    }
}
