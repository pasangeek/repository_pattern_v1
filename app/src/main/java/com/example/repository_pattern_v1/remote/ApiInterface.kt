package com.example.repository_pattern_v1.remote

import com.example.repository_pattern_v1.model.UserResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiInterface {

    @GET("/api/users?page=2")
    suspend fun getUsers() : Response<UserResponse>

//     @GET("/api/users")
//     suspend fun getUsers(@Query("page") pageNumber : Int) : Response<UserResponse>

//    @GET("/api/users/{userId}")
//    suspend fun getUserById(@Path("userId") userId: String) : Response<User>

//    @POST("/api/users/new")
//    suspend fun addUser(@Body user: User) : Response<Int>

}