package com.example.sprint_three_api_alertdialog

import android.widget.ImageView
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide

fun ImageView.setupImageWithGlide(picture: String) {
    Glide.with(this).load(picture).into(this)
}

fun Fragment.toast(text: String) {
    Toast.makeText(requireContext(), text, Toast.LENGTH_SHORT).show()
}




