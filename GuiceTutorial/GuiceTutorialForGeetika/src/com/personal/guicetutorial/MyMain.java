package com.personal.guicetutorial;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class MyMain {
    public static void main(String args[]){

        Injector guice = Guice.createInjector(new CModule());
        C c = guice.getInstance(C.class);

        System.out.println(c);
    }
}
