package com.personal.designpatterns.factory.method;

public class AnimalFactory {

    private static final String DOG = "dog";
    private static final String CAT = "cat";

    public static Animal getAnimal(final String animalType) throws WrongAnimalType {
        if (animalType == DOG) {
            return  new Dog();
        }
        else if (animalType == CAT) {
            return  new Cat();
        }
        else {
            throw new WrongAnimalType ();
        }
    }
}
