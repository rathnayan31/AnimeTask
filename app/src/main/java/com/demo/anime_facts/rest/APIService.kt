package com.demo.anime_facts.rest
import com.demo.anime_facts.model.AnimeList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {
    @GET("/api/v1")    //End Url
    fun fetchQuestions(@Query("data") data: String): Call<AnimeList>
}
