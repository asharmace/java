package com.personal.designpatterns.builder.pattern;

public class MainClass {
    public static void main(String args[]){
        Car c = new Car.Builder().withName("MyCar").withWheels(5).withDoors(2).build();
        System.out.println(c);

        Car c2 = new Car.Builder().build();
        System.out.println(c2);
    }
}
