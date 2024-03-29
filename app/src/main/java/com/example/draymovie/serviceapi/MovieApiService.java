package com.example.draymovie.serviceapi;

import com.example.draymovie.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieApiService {
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apikey);
}
