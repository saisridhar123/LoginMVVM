package com.example.shahbazahmed.loginmvvmdatabinding.di;

import com.example.shahbazahmed.loginmvvmdatabinding.RegisterActivity;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by shahbazahmed on 14/08/17.
 */

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(RegisterActivity registerActivity);

}