package com.personal.designpatterns.strategy.pattern.processor;

import com.personal.designpatterns.strategy.pattern.strategy.input.InputStrategy;
import com.personal.designpatterns.strategy.pattern.strategy.output.OutputStrategy;

public abstract class DataProcessor {

    protected int key;
    protected InputStrategy inputStrategy;
    protected OutputStrategy outputStrategy;

    public abstract void init();
    public abstract String process(String input);

    public final void processData() {
        init();
        String input = inputStrategy.getInput(key);
        String output = process(input);
        outputStrategy.writeOutput(output);
    }
}
