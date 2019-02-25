package com.example.test_api;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONplaceholderAPI {
    // https://jsonplaceholder.typicode.com/posts
    @GET("posts")
    Call<List<Post>> getPosts();
    // https://jsonplaceholder.typicode.com/posts/3/comments
    @GET("posts/3/comments")
    Call<List<Comment>> getComments();
}
