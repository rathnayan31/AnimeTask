package com.demo.anime_facts.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.demo.anime_facts.R
import com.demo.anime_facts.model.AnimeList
import com.demo.anime_facts.rest.APIService
import com.demo.anime_facts.rest.ServiceClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private var mApiService: APIService? = null
    // private var mAdapter: ListAdapter?= null;

    private var mAnimeList: MutableList<AnimeList> = ArrayList()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var mApiService: APIService = ServiceClient.client.create(APIService::class.java);
        val call = mApiService.fetchQuestions("data");
        call.enqueue(object : Callback<AnimeList>{
            override fun onResponse(call: Call<AnimeList>, response: Response<AnimeList>) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<AnimeList>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}