package com.personal.guicetutorial.di;

import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)
public interface Discountable {

    void double getDiscount();
}
