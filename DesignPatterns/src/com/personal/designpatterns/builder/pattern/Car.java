package com.personal.designpatterns.builder.pattern;

public class Car {
    private String name;
    private Integer wheels;
    private Integer doors;

    private Car(Builder builder){
        this.name = builder.name;
        this.wheels = builder.wheels;
        this.doors = builder.doors;
    }

     static class Builder{
        private String name;
        private Integer wheels;
        private Integer doors;

        public Builder withName(String name){
            this.name = name;
            return this;
        }

        public Builder withWheels(Integer wheels){
            this.wheels = wheels;
            return this;
        }

        public Builder withDoors(Integer doors){
            this.doors = doors;
            return this;
        }

        Builder(){
        }

        public Car build(){

            if (this.name == null || this.name == "") name = "BMW 328i";;
            if (this.wheels == null) wheels = 4;
            if (this.doors == null) doors = 4;

            return new Car(this);
        }

    }

    public String toString(){
        StringBuilder sb = new StringBuilder()
                                .append(name)
                                .append(wheels != null ? " " + wheels : " " + 0)
                                .append(doors != null ? " " + doors : " " + 0);
        return  sb.toString();
    }
}