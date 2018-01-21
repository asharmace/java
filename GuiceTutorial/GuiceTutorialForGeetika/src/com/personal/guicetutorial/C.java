package com.personal.guicetutorial;

import com.google.inject.Inject;

public class C {

    private  A a;
    private B b;

    @Inject
    C(final A a, final B b){
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() { return a.toString() + b.toString();}

}
