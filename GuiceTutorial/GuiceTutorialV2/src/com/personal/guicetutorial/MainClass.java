package com.personal.guicetutorial;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.personal.guicetutorial.service.CheckoutService;

public class MainClass {
    public  static void main(String args[]) {

        Injector guice = Guice.createInjector();
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.checkout(100);
    }
}
