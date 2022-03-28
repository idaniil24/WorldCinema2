package com.example.worldcinema2.network.service;

import com.example.worldcinema2.network.models.LoginBody;
import com.example.worldcinema2.network.models.LoginResponse;
import com.example.worldcinema2.network.models.RegisterBody;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface ApiService {
    @POST("/auth/login")
    Call<LoginResponse> doLogin(@Body LoginBody loginBody);
    @POST("/auth/register")
    Call<RegisterBody> doRegister(@Body RegisterBody registerBody);
}