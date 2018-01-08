package com.personal.designpatterns.factory.method;

public class Cat implements Animal {

    @Override
    public Sound makeSound() {
        return new Meow();
    }
}
