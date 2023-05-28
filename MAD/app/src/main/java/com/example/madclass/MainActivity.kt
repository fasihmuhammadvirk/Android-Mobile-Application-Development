package com.example.madclass

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

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

        val LayoutAct = findViewById<Button>(R.id.button3)
        LayoutAct.setOnClickListener {

            val Intent = Intent( this ,Layout_and_MaterialDesign_Activity::class.java)

            startActivity(Intent)

        }

        val LayoutCard = findViewById<Button>(R.id.button4)
        LayoutCard.setOnClickListener {

            val Intent = Intent( this ,MenuAcitvity::class.java)

            startActivity(Intent)

        }

        val LayoutBmi = findViewById<Button>(R.id.button5)
        LayoutBmi.setOnClickListener {

            val Intent = Intent( this ,BMIActivity::class.java)

            startActivity(Intent)

        }

        val LayoutBook = findViewById<Button>(R.id.button6)
        LayoutBook.setOnClickListener {

            val Intent = Intent( this ,BookActivity::class.java)

            startActivity(Intent)

        }

        val LayoutResturant = findViewById<Button>(R.id.button7)
        LayoutResturant.setOnClickListener {

            val Intent = Intent( this ,ResturantActivity::class.java)

            startActivity(Intent)

        }




    }





}

