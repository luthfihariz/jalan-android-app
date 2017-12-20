package com.luthfihariz.jalan.model.remote;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.luthfihariz.jalan.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by luthfihariz on 11/6/16.
 */

public class AttractionServiceBuilder {

    public AttractionServiceBuilder() {

    }

    public AttractionService build() {
        return provideRetrofit().create(AttractionService.class);
    }

    private Retrofit provideRetrofit() {
        OkHttpClient client = new OkHttpClient.Builder()
                .readTimeout(300, TimeUnit.SECONDS)
                .connectTimeout(300, TimeUnit.SECONDS)
                .build();

        Gson gson = new GsonBuilder().create();

        return new Retrofit.Builder()
                .baseUrl(BuildConfig.DUMMY_SERVER_URL)
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();

    }
}
