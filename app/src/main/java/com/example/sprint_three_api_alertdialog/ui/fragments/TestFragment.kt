package com.example.sprint_three_api_alertdialog.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.sprint_three_api_alertdialog.R
import com.example.sprint_three_api_alertdialog.databinding.FragmentTestBinding
import com.example.sprint_three_api_alertdialog.models.dialog.Word
import com.example.sprint_three_api_alertdialog.ui.fragments.dialog.DialogViewModel
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class TestFragment : Fragment(R.layout.fragment_test) {

    private val binding by viewBinding(FragmentTestBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() = with(binding) {

        btn.setOnClickListener {
            val word = etText.text?.trim().toString()
            findNavController().navigate(R.id.action_testFragment_to_dialogFragment)
        }
        btn1.setOnClickListener {
            findNavController().navigate(R.id.action_testFragment_to_anonymousFragment)
        }
        btn2.setOnClickListener {
            findNavController().navigate(R.id.action_testFragment_to_synonymFragment)
        }
    }

}