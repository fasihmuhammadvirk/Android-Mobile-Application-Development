package com.example.mad

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.mad.databinding.ActivityCalculatorBinding


class CalculatorActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculatorBinding
    private  var canAddOperation = false
    private  var canAddDecimal = true
    private var result = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculatorBinding.inflate(layoutInflater) // inflate the layout
        setContentView(binding.root)

    }

    fun numberAction(view: View){

        if (result) {
            binding.WorkingTV.text = ""
            result = false
        }

        if(view is Button)
        {

            if(view.text == ".")
            {
                if(canAddDecimal)
                  binding.WorkingTV.append(view.text)

                canAddDecimal = false

            }

            else
                binding.WorkingTV.append(view.text)
            canAddOperation = true

        }

    }



    fun operationAction(view: View){

        if (result)
            result = false

        if(view is Button && canAddOperation )
        {
            binding.WorkingTV.append(view.text)
            canAddOperation = false

        }

    }


    fun allClearAction(view: View){

        binding.WorkingTV.text = ""

    }


    fun backSpaceAction(view: View){


        val length = binding.WorkingTV.length()
        if (length>0)
            binding.WorkingTV.text = binding.WorkingTV.text.subSequence(0,length-1)

    }


    fun equalAction(view: View){

        binding.WorkingTV.text = calculateResult()
        result = true


    }

    private fun calculateResult():String{

        val digitsOperator = digitsOperators()
        if(digitsOperator.isEmpty()) return ""


        val timeDivision = timeDivisionCalculate(digitsOperator)
        if(timeDivision.isEmpty()) return ""


        val result = addSubtractCalculate(timeDivision)

        return result.toString()
    }

    private fun addSubtractCalculate(passedList: MutableList<Any>): Float {

        var result = passedList[0] as Float


        for (i in passedList.indices){

            if(passedList[i] is Char && i !=  passedList.lastIndex)
            {

                 val operator = passedList[i]
                 val nexDigit = passedList[i + 1] as Float

                if(operator == '+')
                    result += nexDigit


                if(operator == '-')
                    result -= nexDigit


            }

        }

        return result

    }

    private fun timeDivisionCalculate(passList: MutableList<Any>):MutableList<Any>
    {

        var list = passList
        while (list.contains('*') || list.contains("/"))
        {

            list = calTimesDiv(list)

        }

        return list
    }


    private fun calTimesDiv (passList: MutableList<Any>):MutableList<Any>
    {
        val newlist = mutableListOf<Any>()
        var restartIndex = passList.size

        for(i in passList.indices)
        {

            if (passList[i] is Char && i != passList.lastIndex && i < restartIndex ){

                val operator = passList[i]
                val prevDigit = passList[i -1] as Float
                val nextDigit = passList[i + 1] as Float
                when(operator)
                {
                    '*'->
                    {
                        newlist.add(prevDigit * nextDigit)
                        restartIndex = i+1
                    }
                    '/'->
                    {
                        newlist.add(prevDigit / nextDigit)
                        restartIndex = i+1
                    }

                    else ->
                    {
                        newlist.add(prevDigit)
                        newlist.add(operator)
                    }

                }


            }

            if (i > restartIndex)
                newlist.add(passList[i])

        }


        return newlist
    }


    private fun digitsOperators():MutableList<Any>
    {

        val list = mutableListOf<Any>()

        var currentDigit = ""

        for (character in binding.WorkingTV.text)
        {
            if(character.isDigit() || character == '.')
                currentDigit += character
            else {

            list.add(currentDigit.toFloat())
                currentDigit = ""
                list.add(character)
            }
        }

        if (currentDigit != "")
            list.add(currentDigit.toFloat())

        return list
    }
}