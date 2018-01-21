package com.personal.designpatterns.factory.method;

public class MainClass {

    public static void main(String args[]) throws Exception{
        Animal dog = new AnimalFactory().getAnimal("dog");
        dog.speakCommand().makeSound();
        Animal cat = new AnimalFactory().getAnimal("cat");
        cat.speakCommand().makeSound();
    }
}
