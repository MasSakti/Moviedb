package com.mutawalli.challenge8.networking

import com.mutawalli.challenge8.model.GetAllUserResponseItem
import com.mutawalli.challenge8.model.MovieResponse
import com.mutawalli.challenge8.model.PostUser
import com.mutawalli.challenge8.model.RequestUser
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ApiServices {
    @GET("movie/popular")
    fun getMovie(
        @Query("api_key") apiKey: String
    ): Call<MovieResponse>

    //user
    @GET("datauserlogin")
    suspend fun getAllUser(): List<GetAllUserResponseItem>

    @POST("datauserlogin")
    fun addNewUser(@Body requestUser: RequestUser): Call<PostUser>
}