package com.example.sprint_three_api_alertdialog.ui.fragments.anonim

import androidx.lifecycle.ViewModel
import com.example.sprint_three_api_alertdialog.data.repositories.DialogRepository
import com.example.sprint_three_api_alertdialog.models.antonyms.AntonymModel
import com.example.sprint_three_api_alertdialog.models.antonyms.WordAnonym
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnonymViewModel @Inject constructor(
    private val anonymrepository: DialogRepository
) : ViewModel() {

    fun fetchAnonym(model: WordAnonym) = anonymrepository.fetchAnonym(model)

}