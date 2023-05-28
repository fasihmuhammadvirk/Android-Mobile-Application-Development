package com.example.madclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class BookActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book)

    }

    fun nexttopage1(v:View){

        setContentView(R.layout.bookpage1)

    }

    fun prevtopage1(v:View)
    {
        setContentView(R.layout.bookpage1)
    }

    fun prevtohome(v:View)
    {
        setContentView(R.layout.activity_book)

    }

    fun nexttopage2(v:View)
    {
        setContentView(R.layout.bookpage2)
    }

    fun prevtopage2(v:View)
    {
        setContentView(R.layout.bookpage2)
    }

}