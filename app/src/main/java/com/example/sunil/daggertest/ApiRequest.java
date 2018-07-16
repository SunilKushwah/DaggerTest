package com.example.sunil.daggertest;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiRequest {
    String BASE_URL = "https://simplifiedcoding.net/demos/";
    @GET("marvel")
    Call<List<Hero>> getHeroList();
}
