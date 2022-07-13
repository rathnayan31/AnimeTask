package com.demo.anime_facts.model

import com.google.gson.annotations.SerializedName

data class SpecificFacts (

    @SerializedName("success" ) var success : Boolean? = null,
    @SerializedName("data"    ) var data    : SpecificFactsData?    = SpecificFactsData()

)

data class SpecificFactsData (

    @SerializedName("fact_id" ) var factId : Int?    = null,
    @SerializedName("fact"    ) var fact   : String? = null

)