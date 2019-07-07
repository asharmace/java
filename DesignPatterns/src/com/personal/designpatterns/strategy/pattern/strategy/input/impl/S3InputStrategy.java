package com.personal.designpatterns.strategy.pattern.strategy.input.impl;

import com.personal.designpatterns.strategy.pattern.strategy.input.InputStrategy;

public class S3InputStrategy implements InputStrategy {

    @Override
    public String getInput(int key) {
        return new StringBuilder().append("Got input from S3 ").append(key).toString();
    }
}
