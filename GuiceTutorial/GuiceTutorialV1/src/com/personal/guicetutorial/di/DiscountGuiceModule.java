package com.personal.guicetutorial.di;

import com.google.inject.AbstractModule;

public class DiscountGuiceModule extends AbstractModule {

    @Override
    public void configure() {
        bind(Discountable.class).to(NightOwlDiscount.class);
    }
}
