package com.example.sprint_three_api_alertdialog.data.repositories

import com.example.sprint_three_api_alertdialog.base.BaseRepository
import com.example.sprint_three_api_alertdialog.data.remote.apiservices.DialogApiService
import com.example.sprint_three_api_alertdialog.models.antonyms.WordAnonym
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import com.example.sprint_three_api_alertdialog.models.synonyms.WordSynonym
import javax.inject.Inject

class DialogRepository @Inject constructor(
    private val translateService: DialogApiService
) : BaseRepository() {

    fun fetchTranslate(model: Word) = doRequest {
        translateService.fetchDia(model)
    }

    fun fetchAnonym(model: WordAnonym) = doRequest {
   translateService.fetchAntonyms(model)
    }

    fun  fetchSynonym(model: WordSynonym) = doRequest {
        translateService.fetchSynonyms(model)
    }
}