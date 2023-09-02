package com.example.sprint_three_api_alertdialog.models.dialog

import com.example.sprint_three_api_alertdialog.base.BaseDiffUtil
import com.google.gson.annotations.SerializedName

data class DialogModels (

    @SerializedName("id")
    override val id: Int,

    @SerializedName("word")
    val word: String? = null,

    @SerializedName("image_url")
    val image_url: String? = null,

    @SerializedName("translation")
    val translation: String? = null
) : BaseDiffUtil
