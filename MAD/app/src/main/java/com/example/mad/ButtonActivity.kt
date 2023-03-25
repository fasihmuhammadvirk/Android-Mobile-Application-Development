package com.example.mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.example.mad.R


class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        Log.i("Info","This is Logcat")
        Toast.makeText(this,"This is a Toast Class",Toast.LENGTH_SHORT).show()
    }

    fun topClick(v:View)
    {
        Toast.makeText(this,"This is Button 1",Toast.LENGTH_SHORT).show()

    }

    fun bottomCick(v:View)
    {
        Toast.makeText(this,"This is Button 2",Toast.LENGTH_SHORT).show()

    }
}