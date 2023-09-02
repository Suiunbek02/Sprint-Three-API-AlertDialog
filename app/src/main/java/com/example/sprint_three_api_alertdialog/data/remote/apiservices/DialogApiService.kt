package com.example.sprint_three_api_alertdialog.data.remote.apiservices

import com.example.sprint_three_api_alertdialog.models.antonyms.AntonymModel
import com.example.sprint_three_api_alertdialog.models.antonyms.WordAnonym
import com.example.sprint_three_api_alertdialog.models.dialog.DialogModels
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import com.example.sprint_three_api_alertdialog.models.synonyms.SynonymModel
import com.example.sprint_three_api_alertdialog.models.synonyms.WordSynonym
import retrofit2.http.Body
import retrofit2.http.Multipart
import retrofit2.http.POST

interface DialogApiService {

    @POST("word_translate/?format=json")
    suspend fun fetchDia(@Body model: Word): DialogModels

    @POST("antonym/?format=json")
    suspend fun fetchAntonyms(@Body model: WordAnonym): AntonymModel

    @POST("synonym/?format=json")
    suspend fun fetchSynonyms(@Body model: WordSynonym): SynonymModel
}