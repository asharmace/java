package com.personal.guicetutorial;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.personal.guicetutorial.di.DiscountGuiceModule;
import com.personal.guicetutorial.service.CheckoutService;

public class MainClass {
    public  static void main(String args[]){
<<<<<<< HEAD
        System.out.println("Hello World");
=======
>>>>>>> d2ccbaa7ac537d499522cc5c7dd64a35bff18d0a

        Injector guice = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService service = guice.getInstance(CheckoutService.class);

        service.checkout(100.00D );
    }
}
