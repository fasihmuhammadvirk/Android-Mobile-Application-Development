package com.example.bmi_calculator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.app.Activity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.bmi_calculator.R

class MainActivity : AppCompatActivity() {

    private lateinit var weightEditText: EditText
    private lateinit var heightEditText: EditText
    private lateinit var calculateButton: Button
    private lateinit var resultTextView: TextView
    private lateinit var resetButton: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weightEditText = findViewById(R.id.weightEditText)
        heightEditText = findViewById(R.id.heightEditText)
        calculateButton = findViewById(R.id.calculateButton)
        resultTextView = findViewById(R.id.resultTextView)
        resetButton = findViewById(R.id.resetButton)

        calculateButton.setOnClickListener {
            calculateBMI()
        }

        resetButton.setOnClickListener {
            resetFields()
        }
    }

    private fun calculateBMI() {
        val weightStr = weightEditText.text.toString()
        val heightStr = heightEditText.text.toString()

        if (weightStr.isEmpty() || heightStr.isEmpty()) {
            resultTextView.text = "Please enter weight and height."
            return
        }

        val weight = weightStr.toFloat()
        val height = heightStr.toFloat() / 100

        val bmi = weight / (height * height)

        val interpretation = when {
            bmi < 18.5 -> "Underweight"
            bmi < 25 -> "Normal weight"
            bmi < 30 -> "Overweight"
            else -> "Obese"
        }

        val result = "BMI: %.2f\n%s".format(bmi, interpretation)
        resultTextView.text = result
    }

    private fun resetFields() {
        weightEditText.text.clear()
        heightEditText.text.clear()
        resultTextView.text = ""
    }
}
