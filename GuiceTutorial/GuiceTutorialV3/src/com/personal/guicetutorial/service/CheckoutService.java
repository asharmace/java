package com.personal.guicetutorial.service;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.personal.guicetutorial.di.Discountable;

public class CheckoutService {

    private final Provider<Discountable> discountable;

    @Inject
    CheckoutService(Provider<Discountable> discountable){
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal){
        double discount = discountable.get().getDiscount();

        double totalAfterDiscount = shoppingCartTotal * (1 - discount);
        System.out.printf("Price %.2f after %.2f discount is %.2f: ", shoppingCartTotal,
                discount * 100, totalAfterDiscount);
        return  totalAfterDiscount;
    }

}
