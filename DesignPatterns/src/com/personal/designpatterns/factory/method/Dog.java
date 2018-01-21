package com.personal.designpatterns.factory.method;

public class Dog implements Animal {

    @Override
    public Sound speakCommand(){
        return new Bark();
    }
}
