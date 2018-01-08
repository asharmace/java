package com.personal.guicetutorial.di;

import javax.xml.ws.Provider;

public class DiscountProvider implements Provider<Discountable> {

    public Discountable get(){
        return  new EarlyBirdDiscount();
    }
}
