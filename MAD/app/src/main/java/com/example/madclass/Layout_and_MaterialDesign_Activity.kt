package com.example.madclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Layout_and_MaterialDesign_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_and_materialdesign)
    }


    fun GoBack()
    {

        setContentView(R.layout.activity_main)

    }
}