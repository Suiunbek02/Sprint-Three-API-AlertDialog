package com.example.sprint_three_api_alertdialog.ui.fragments.sinonim

import androidx.lifecycle.ViewModel
import com.example.sprint_three_api_alertdialog.data.repositories.DialogRepository
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import com.example.sprint_three_api_alertdialog.models.synonyms.SynonymModel
import com.example.sprint_three_api_alertdialog.models.synonyms.WordSynonym
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SynonymViewModel @Inject constructor(
    private val synonymRepository: DialogRepository
) : ViewModel() {

    fun fetchSynonym(model: WordSynonym) = synonymRepository.fetchSynonym(model)

}