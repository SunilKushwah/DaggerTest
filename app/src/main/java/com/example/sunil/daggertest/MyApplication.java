package com.example.sunil.daggertest;

import android.app.Application;

import com.example.sunil.daggertest.dagger.AppComponent;
import com.example.sunil.daggertest.dagger.ApiModule;
import com.example.sunil.daggertest.dagger.AppModule;
import com.example.sunil.daggertest.dagger.DaggerAppComponent;


public class MyApplication extends Application {
    private AppComponent mAppComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mAppComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .apiModule(new ApiModule("https://simplifiedcoding.net/demos/"))
                .build();
    }

    public AppComponent getNetComponent() {
        return mAppComponent;
    }
}
