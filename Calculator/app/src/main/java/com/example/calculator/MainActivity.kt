package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.example.calculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding

    private var firstNum = 0.0
    private var secondNum = 0.0
    private var result = 0.0
    private var firstNumEntered = false
    private var currNumHasPeriod = false
    private var currDecimalCount = 0.0
    private var currOperator = ""
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.one.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 1
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*1
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 1
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*1
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.two.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 2
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*2
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 2
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*2
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.three.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 3
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*3
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 3
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*3
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.four.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 4
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*4
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 4
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*4
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.five.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 5
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*5
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 5
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*5
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.six.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 6
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*6
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 6
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*6
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.seven.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 7
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*7
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 7
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*7
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.eight.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 8
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*8
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 8
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*8
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.nine.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10 + 9
                }
                else
                {
                    firstNum = firstNum + Math.pow(10.0, -currDecimalCount)*9
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10 + 9
                }
                else
                {
                    secondNum = secondNum + Math.pow(10.0, -currDecimalCount)*9
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.zero.setOnClickListener{
            if(!firstNumEntered)
            {
                if(!currNumHasPeriod)
                {
                    firstNum = firstNum * 10
                }
                else
                {
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
            }
            else
            {
                if(!currNumHasPeriod)
                {
                    secondNum = secondNum * 10
                }
                else
                {
                    currDecimalCount ++
                }
                findViewById<EditText>(R.id.textBar).setText(secondNum.toString())
            }
        }

        binding.period.setOnClickListener{
            currNumHasPeriod = true
            currDecimalCount = 1.0
        }

        binding.plus.setOnClickListener{
            if(currOperator.equals("+"))
            {
                result = firstNum + secondNum
            }
            else if(currOperator.equals("-"))
            {
                result = firstNum - secondNum
            }
            else if(currOperator.equals("*"))
            {
                result = firstNum * secondNum
            }
            else if(currOperator.equals("/"))
            {
                result = firstNum / secondNum
            }
            else if(currOperator.equals("sqrt"))
            {
                result = Math.sqrt(firstNum)
            }

            if(!firstNumEntered) {
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
                secondNum = 0.0
                firstNumEntered = true
                currNumHasPeriod = false
                currOperator = "+"
            }
            else{
                if(currOperator.equals("/") && secondNum == 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot Divide by Zero. Clearing.")
                    clear()
                }
                else if(currOperator.equals("sqrt") && firstNum < 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot get SQRT of Negative. Clearing.")
                    clear()
                }
                else {
                    findViewById<EditText>(R.id.textBar).setText(result.toString())
                    firstNum = result
                    secondNum = 0.0
                    firstNumEntered = true
                    currNumHasPeriod = false
                    currOperator = "+"
                }
            }
        }

        binding.min.setOnClickListener{
            if(currOperator.equals("+"))
            {
                result = firstNum + secondNum
            }
            else if(currOperator.equals("-"))
            {
                result = firstNum - secondNum
            }
            else if(currOperator.equals("*"))
            {
                result = firstNum * secondNum
            }
            else if(currOperator.equals("/"))
            {
                result = firstNum / secondNum
            }
            else if(currOperator.equals("sqrt"))
            {
                result = Math.sqrt(firstNum)
            }

            if(!firstNumEntered) {
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
                secondNum = 0.0
                firstNumEntered = true
                currNumHasPeriod = false
                currOperator = "-"
            }
            else{
                if(currOperator.equals("/") && secondNum == 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot Divide by Zero. Clearing.")
                    clear()
                }
                else if(currOperator.equals("sqrt") && firstNum < 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot get SQRT of Negative. Clearing.")
                    clear()
                }
                else {
                    findViewById<EditText>(R.id.textBar).setText(result.toString())
                    firstNum = result
                    secondNum = 0.0
                    firstNumEntered = true
                    currNumHasPeriod = false
                    currOperator = "-"
                }
            }
        }

        binding.mul.setOnClickListener{
            if(currOperator.equals("+"))
            {
                result = firstNum + secondNum
            }
            else if(currOperator.equals("-"))
            {
                result = firstNum - secondNum
            }
            else if(currOperator.equals("*"))
            {
                result = firstNum * secondNum
            }
            else if(currOperator.equals("/"))
            {
                result = firstNum / secondNum
            }
            else if(currOperator.equals("sqrt"))
            {
                result = Math.sqrt(firstNum)
            }

            if(!firstNumEntered) {
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
                secondNum = 0.0
                firstNumEntered = true
                currNumHasPeriod = false
                currOperator = "*"
            }
            else{
                if(currOperator.equals("/") && secondNum == 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot Divide by Zero. Clearing.")
                    clear()
                }
                else if(currOperator.equals("sqrt") && firstNum < 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot get SQRT of Negative. Clearing.")
                    clear()
                }
                else {
                    findViewById<EditText>(R.id.textBar).setText(result.toString())
                    firstNum = result
                    secondNum = 0.0
                    firstNumEntered = true
                    currNumHasPeriod = false
                    currOperator = "*"
                }
            }
        }

        binding.div.setOnClickListener{
            if(currOperator.equals("+"))
            {
                result = firstNum + secondNum
            }
            else if(currOperator.equals("-"))
            {
                result = firstNum - secondNum
            }
            else if(currOperator.equals("*"))
            {
                result = firstNum * secondNum
            }
            else if(currOperator.equals("/"))
            {
                result = firstNum / secondNum
            }
            else if(currOperator.equals("sqrt"))
            {
                result = Math.sqrt(firstNum)
            }

            if(!firstNumEntered) {
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
                secondNum = 0.0
                firstNumEntered = true
                currNumHasPeriod = false
                currOperator = "/"
            }
            else{
                if(currOperator.equals("/") && secondNum == 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot Divide by Zero. Clearing.")
                    clear()
                }
                else if(currOperator.equals("sqrt") && firstNum < 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot get SQRT of Negative. Clearing.")
                    clear()
                }
                else {
                    findViewById<EditText>(R.id.textBar).setText(result.toString())
                    firstNum = result
                    secondNum = 0.0
                    firstNumEntered = true
                    currNumHasPeriod = false
                    currOperator = "/"
                }
            }
        }

        binding.sqrt.setOnClickListener{
            if(currOperator.equals("+"))
            {
                result = firstNum + secondNum
            }
            else if(currOperator.equals("-"))
            {
                result = firstNum - secondNum
            }
            else if(currOperator.equals("*"))
            {
                result = firstNum * secondNum
            }
            else if(currOperator.equals("/"))
            {
                result = firstNum / secondNum
            }
            else if(currOperator.equals("sqrt"))
            {
                result = Math.sqrt(firstNum)
            }

            if(currOperator.equals("/") && secondNum == 0.0)
            {
                findViewById<EditText>(R.id.textBar).setText("Err: Cannot Divide by Zero. Clearing.")
                clear()
            }
            else if(currOperator.equals("sqrt") && firstNum < 0.0)
            {
                findViewById<EditText>(R.id.textBar).setText("Err: Cannot get SQRT of Negative. Clearing.")
                clear()
            }
            else {
                findViewById<EditText>(R.id.textBar).setText(result.toString())
                firstNum = result
                secondNum = 0.0
                firstNumEntered = true
                currNumHasPeriod = false
                currOperator = "sqrt"
            }
        }

        binding.equals.setOnClickListener{
            if(currOperator.equals("+"))
            {
                result = firstNum + secondNum
            }
            else if(currOperator.equals("-"))
            {
                result = firstNum - secondNum
            }
            else if(currOperator.equals("*"))
            {
                result = firstNum * secondNum
            }
            else if(currOperator.equals("/"))
            {
                result = firstNum / secondNum
            }
            else if(currOperator.equals("sqrt"))
            {
                result = Math.sqrt(firstNum)
            }

            if(!firstNumEntered) {
                findViewById<EditText>(R.id.textBar).setText(firstNum.toString())
                secondNum = 0.0
                firstNumEntered = true
                currNumHasPeriod = false
                currOperator = "+"
            }
            else{
                if(currOperator.equals("/") && secondNum == 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot Divide by Zero. Clearing.")
                    clear()
                }
                else if(currOperator.equals("sqrt") && firstNum < 0.0)
                {
                    findViewById<EditText>(R.id.textBar).setText("Err: Cannot get SQRT of Negative. Clearing.")
                    clear()
                }
                else {
                    findViewById<EditText>(R.id.textBar).setText(result.toString())
                    firstNum = result
                    secondNum = 0.0
                    firstNumEntered = true
                    currNumHasPeriod = false
                    currOperator = "+"
                }
            }
        }

        binding.clear.setOnClickListener{
            clear()
            findViewById<EditText>(R.id.textBar).setText("0.0")
        }

    }
    fun clear()
    {
        firstNum = 0.0
        secondNum = 0.0
        result = 0.0
        firstNumEntered = false
        currNumHasPeriod = false
        currDecimalCount = 0.0
        currOperator = ""

    }
}