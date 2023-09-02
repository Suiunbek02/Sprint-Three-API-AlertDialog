package com.example.sprint_three_api_alertdialog.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sprint_three_api_alertdialog.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


}