package com.demo.anime_facts.model


import com.google.gson.annotations.SerializedName



data class AnimeList (
    @SerializedName("success" ) var success : Boolean?        = null,
    @SerializedName("data"    ) var data    : ArrayList<AnimeData> = arrayListOf()
)

data class AnimeData (

    @SerializedName("anime_id"   ) var animeId   : Int?    = null,
    @SerializedName("anime_name" ) var animeName : String? = null,
    @SerializedName("anime_img"  ) var animeImg  : String? = null

)