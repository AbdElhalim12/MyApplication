package com.example.user2.myapplication;

import com.firebase.client.Firebase;

/**
 * Created by user2 on 6/21/16.
 */
public class CrowdWeather extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
