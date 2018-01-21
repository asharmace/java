package com.personal.guicetutorial;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Singleton;

public class CModule extends AbstractModule {

    @Override
    public  void configure(){
    }

    @Singleton
    @Provides
    public A provideA(){
        return  new A();
    }

    @Singleton
    @Provides
    public B provideB(){
        return new B();
    }
}
