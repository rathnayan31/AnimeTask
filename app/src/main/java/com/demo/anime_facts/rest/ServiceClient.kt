package com.demo.anime_facts.rest


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceClient {

    private val BASE_URL = "https://anime-facts-rest-api.herokuapp.com"
    private var mRetrofit: Retrofit? = null

    val client: Retrofit
        get() {
            if (mRetrofit == null) {
                mRetrofit = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
            }
            return this.mRetrofit!!
        }

}