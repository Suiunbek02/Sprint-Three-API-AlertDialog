package com.example.sprint_three_api_alertdialog.models.synonyms

import com.example.sprint_three_api_alertdialog.base.BaseDiffUtil
import com.google.gson.annotations.SerializedName

data class SynonymModel (

    @SerializedName("id")
    override val id: Int,

    @SerializedName("word")
    val word: String? = null,

    @SerializedName("synonym")
    val synonym: String? = null

): BaseDiffUtil
