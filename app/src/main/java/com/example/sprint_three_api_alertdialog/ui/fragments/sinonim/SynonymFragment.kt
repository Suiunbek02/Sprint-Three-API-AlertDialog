package com.example.sprint_three_api_alertdialog.ui.fragments.sinonim

import android.app.Person
import android.util.Log
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import coil.load
import com.bumptech.glide.load.engine.Resource
import com.example.sprint_three_api_alertdialog.R
import com.example.sprint_three_api_alertdialog.base.BaseFragment
import com.example.sprint_three_api_alertdialog.databinding.FragmentSynonymBinding
import com.example.sprint_three_api_alertdialog.models.dialog.DialogModels
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import com.example.sprint_three_api_alertdialog.models.synonyms.SynonymModel
import com.example.sprint_three_api_alertdialog.models.synonyms.WordSynonym
import com.example.sprint_three_api_alertdialog.toast
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SynonymFragment :
    BaseFragment<FragmentSynonymBinding, SynonymViewModel>(R.layout.fragment_synonym) {

    override val binding by viewBinding(FragmentSynonymBinding::bind)
    override val viewModel: SynonymViewModel by viewModels()

    override fun setupSubscribes() {
        subscribeToSynonym()
    }

    private fun subscribeToSynonym() = with(binding) {

        ok.setOnClickListener {
            val word = et.text.toString()
            val wordSynonym = WordSynonym(word)

            viewModel.fetchSynonym(wordSynonym).subscribe(
                onError = {
                    Log.e("looo", "setupSubscribes: $wordSynonym")
                },
                onSuccess = { model ->
                    toast("$model")

                    Log.e(
                        "ololo",
                        "subscribeToTranslate: " + model.word + model.synonym
                    )


                    if (model != null) {
                        binding.sText.text = model.word
                        binding.sStartTextOne.text = listOf(model.synonym).toString()
                        binding.sStartTextTwo.text = model.synonym
                        binding.sEndTextOne.text = model.synonym

                        val list = listOf(model.synonym)
                        binding.sStartTextOne.text = list.get(1)
                        Log.e(
                            "ololo",
                            "subscribeToTranslate: " + list.get(1)
                        )
                    }
                }
            )
        }
    }


}


