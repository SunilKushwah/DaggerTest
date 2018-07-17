package com.example.sunil.daggertest.dagger;

import com.example.sunil.daggertest.MainActivity;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class, ApiModule.class})
public interface AppComponent {
    void inject(MainActivity activity);
}
