package com.example.sprint_three_api_alertdialog.ui.fragments.dialog

import androidx.lifecycle.ViewModel
import com.example.sprint_three_api_alertdialog.data.repositories.DialogRepository
import com.example.sprint_three_api_alertdialog.models.dialog.DialogModels
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DialogViewModel @Inject constructor(
    private val repository: DialogRepository
) : ViewModel() {

    fun fetchTranslate(model:Word) = repository.fetchTranslate(model)
}