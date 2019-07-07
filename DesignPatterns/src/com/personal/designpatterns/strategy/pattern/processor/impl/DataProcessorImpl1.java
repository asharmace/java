package com.personal.designpatterns.strategy.pattern.processor.impl;

import com.personal.designpatterns.strategy.pattern.processor.DataProcessor;
import com.personal.designpatterns.strategy.pattern.strategy.input.impl.S3InputStrategy;
import com.personal.designpatterns.strategy.pattern.strategy.output.impl.ConsoleOutputStrategy;

public class DataProcessorImpl1 extends DataProcessor {

    public DataProcessorImpl1() {
        inputStrategy = new S3InputStrategy();
        outputStrategy = new ConsoleOutputStrategy();
    }

    @Override
    public void init() {
        key = 100;
    }

    @Override
    public String process(String input) {
        return "Processed input {" + input + "} from DataProcessorImpl1";
    }
}
