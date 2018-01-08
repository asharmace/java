package com.personal.guicetutorial.service;

import com.personal.guicetutorial.di.Discountable;

import com.google.inject.Inject;

public class CheckoutService {

    private final Discountable discountable;

    @Inject
    CheckoutService(Discountable discountable){
        this.discountable = discountable;
    }

    public double checkout(double shoppingCartTotal){
        double totalAfterDiscount = shoppingCartTotal * (1 - discountable.getDiscount());
        System.out.printf("Price %.2f after %.2f discount is %.2f: ", shoppingCartTotal,
                discountable.getDiscount(), totalAfterDiscount);
        return  totalAfterDiscount;
    }

}
