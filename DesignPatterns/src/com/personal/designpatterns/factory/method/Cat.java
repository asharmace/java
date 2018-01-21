package com.personal.designpatterns.factory.method;

public class Cat implements Animal {

    @Override
    public Sound speakCommand() {
        return new Meow();
    }
}
