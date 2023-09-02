package com.example.sprint_three_api_alertdialog.models

import com.google.gson.annotations.SerializedName

data class DialogResponse<T>(

    @SerializedName("count")
    val count: Int,

    @SerializedName("previous")
    val previous: String,

    @SerializedName("next")
    val next: String?,

    @SerializedName("results")
    val results: List<T>
)