package com.example.mad

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.mad.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAct = findViewById<Button>(R.id.button1)
        buttonAct.setOnClickListener {

            val Intent = Intent( this ,ButtonActivity::class.java)

            startActivity(Intent)

        }
        val CalculatorAct = findViewById<Button>(R.id.button2)
        CalculatorAct.setOnClickListener {

            val Intent = Intent( this ,CalculatorActivity::class.java)

            startActivity(Intent)

        }



    }

}