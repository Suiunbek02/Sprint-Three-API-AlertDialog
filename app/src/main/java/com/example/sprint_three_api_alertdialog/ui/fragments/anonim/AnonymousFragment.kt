package com.example.sprint_three_api_alertdialog.ui.fragments.anonim

import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.sprint_three_api_alertdialog.R
import com.example.sprint_three_api_alertdialog.base.BaseFragment
import com.example.sprint_three_api_alertdialog.databinding.FragmentAnonymousBinding
import com.example.sprint_three_api_alertdialog.models.antonyms.AntonymModel
import com.example.sprint_three_api_alertdialog.models.antonyms.WordAnonym
import com.example.sprint_three_api_alertdialog.models.dialog.DialogModels
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import com.example.sprint_three_api_alertdialog.toast
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AnonymousFragment :
    BaseFragment<FragmentAnonymousBinding, AnonymViewModel>(R.layout.fragment_anonymous) {

    override val binding by viewBinding(FragmentAnonymousBinding::bind)
    override val viewModel: AnonymViewModel by viewModels()

    override fun setupSubscribes() {
        subscribeToAnonym()
    }

    private fun subscribeToAnonym() = with(binding) {

        ok.setOnClickListener {
            val word = et.text.toString()
            val wordAnonymous = WordAnonym(word)

            viewModel.fetchAnonym(wordAnonymous).subscribe(
                onError = {
                    Log.e("looo", "subscribeToAnonym: $wordAnonymous")
                },
                onSuccess = { model ->
                    toast("$model")
//                    Log.e("antonyms", "subscribeToAnonym: " + model.word + model.antonym)
//                    if (model != null) {
//                        binding.aText.text = model.word
//                        binding.aEndTextOne.text = model.antonym
//                        binding.aStartTextTwo.text = model.antonym
//                        binding.aStartTextOne.text = model.antonym
//                        binding.aEndTextTwo.text = model.antonym
//                    }
//                    Log.e("antonyms", "subscribeToAnonym: " + model.word + model.antonym)

                    val get = AntonymModel(id = 137, word = "", antonym = "").antonym

                    when (true) {
                        true -> binding.aStartTextTwo.text =
                            model.copy(id = 136, word = word, antonym = "").toString()

                        true -> binding.aStartTextTwo.text =
                            model.copy(id = 137, word = word, antonym = "").antonym

                        true -> binding.aEndTextTwo.text =
                            model.copy(id = 138, word = word, antonym = "").antonym

                        else -> {}

                    }
                }
            )
        }
    }
}