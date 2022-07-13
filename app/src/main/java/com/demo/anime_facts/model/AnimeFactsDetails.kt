package com.demo.anime_facts.model
import com.google.gson.annotations.SerializedName
    data class AnimeFactsDetails (

        @SerializedName("success"     ) var success    : Boolean?        = null,
        @SerializedName("img"         ) var img        : String?         = null,
        @SerializedName("total_facts" ) var totalFacts : Int?            = null,
        @SerializedName("data"        ) var data       : ArrayList<AnimeFactsData> = arrayListOf()

    )

data class AnimeFactsData (

    @SerializedName("fact_id" ) var factId : Int?    = null,
    @SerializedName("fact"    ) var fact   : String? = null

)