package com.example.sprint_three_api_alertdialog.models.antonyms

import com.example.sprint_three_api_alertdialog.base.BaseDiffUtil
import com.google.gson.annotations.SerializedName

data class AntonymModel (

    @SerializedName("id")
    override val id: Int,

    @SerializedName("word")
    val word: String? = null,

    @SerializedName("antonym")
    val antonym: String? = null

): BaseDiffUtil