package com.example.test_api;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JSONplaceholderAPI {
    // https://jsonplaceholder.typicode.com/posts
    @GET("posts")
    Call<List<Post>> getPosts();

    @GET("posts")
    Call<List<Post>> getPosts(@Query("userId") int userId);
    // https://jsonplaceholder.typicode.com/posts/3/comments
    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postId);
}
