package com.personal.guicetutorial.di;

public class DiscountModule {

    @Override
    protected void configure(){
        bind(Discountable.class).toProvider(DiscountProvider.class);
    }
}
