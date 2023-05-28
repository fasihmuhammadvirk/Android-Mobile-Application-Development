package com.example.madclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast

class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)
        Log.i("Info","This is Logcat")
        Toast.makeText(this,"This is a Toast Class",Toast.LENGTH_SHORT).show()
        Toast.makeText(this, "In onCreate",
            Toast.LENGTH_SHORT).show()
        Log.i("info", "In onCreate")



    }

    fun topClick(v:View)
    {
        Toast.makeText(this,"This is Button 1",Toast.LENGTH_SHORT).show()

    }

    fun bottomCick(v:View)
    {
        Toast.makeText(this,"This is Button 2",Toast.LENGTH_SHORT).show()
        setContentView(R.layout.activity_main)

    }





    override fun onStart() {
        // First call the "official" version of this function
        super.onStart()
        Toast.makeText(this, "In onStart",
            Toast.LENGTH_SHORT).show()
        Log.i("info", "In onStart")
    }


    override fun onResume() {
        // First call the "official" version of this function
        super.onResume()
        Toast.makeText(this, "In onResume",
            Toast.LENGTH_SHORT).show()
        Log.i("info", "In onResume")
    }
    override fun onPause() {
        // First call the "official" version of this function
        super.onPause()
        Toast.makeText(this, "In onPause",
            Toast.LENGTH_SHORT).show()
        Log.i("info", "In onPause")
    }
    override fun onStop() {
        // First call the "official" version of this function
        super.onStop()
        Toast.makeText(this, "In onStop",
            Toast.LENGTH_SHORT).show()
        Log.i("info", "In onStop")
    }
    override fun onDestroy() {
        // First call the "official" version of this function
        super.onDestroy()
        Toast.makeText(this, "In onDestroy",
            Toast.LENGTH_SHORT).show()
        Log.i("info", "In onDestroy")
    }



}