package com.itschool.oauthexample.github_api;

import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HEAD;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Path;

public interface GithubAPI {


    @Headers("Accept: application/json")
    @FormUrlEncoded
    @POST("login/oauth/access_token")
    Call<AccessToken> getToken(
            @Field("client_id") String client,
            @Field("client_secret") String secret,
            @Field("code") String code
    );

    @GET("/users/{user}/repos")
    Call<List<Repository>> reposUser(@Header("Authorisation") String auth , @Path("user") String userName);
}
