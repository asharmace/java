package com.personal.designpatterns.strategy.pattern;

import com.personal.designpatterns.strategy.pattern.processor.DataProcessor;
import com.personal.designpatterns.strategy.pattern.processor.impl.DataProcessorImpl1;
import com.personal.designpatterns.strategy.pattern.processor.impl.DataProcessorImpl2;

public class MainClass {

    public static void main(String args[]) {
        DataProcessor dp1 = new DataProcessorImpl1();

        DataProcessor dp2 = new DataProcessorImpl2();


        dp1.processData();
        dp2.processData();
    }
}
