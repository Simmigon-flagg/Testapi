package com.example.test_api;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONplaceholderAPI {
    // https://jsonplaceholder.typicode.com/ {posts}
    @GET("posts")
    Call<List<Post>> getPosts();
}
