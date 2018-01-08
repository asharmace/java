package com.personal.designpatterns.factory.method;

public class Dog implements Animal {

    @Override
    public Sound makeSound(){
        return new Bark();
    }
}
