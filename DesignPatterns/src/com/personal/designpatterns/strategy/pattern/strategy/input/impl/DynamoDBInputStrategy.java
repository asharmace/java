package com.personal.designpatterns.strategy.pattern.strategy.input.impl;

import com.personal.designpatterns.strategy.pattern.strategy.input.InputStrategy;

public class DynamoDBInputStrategy implements InputStrategy {

    @Override
    public String getInput(int key) {
        return new StringBuilder().append("Got input from DDB ").append(key).toString();
    }
}
