package com.example.android.gym;

import com.example.android.gym.POJO.Example;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;


public interface RetrofitMaps {
    @GET("api/place/nearbysearch/json?sensor=true&key=AIzaSyABQObhQ1zUWKmx4MQtqCvwPRrPfyRLNqU")
    Call<Example> getNearbyPlaces(@Query("type") String type, @Query("location") String location, @Query("radius") int radius);


}
