package com.example.simplecalculator3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Button
import android.widget.EditText
import android.view.View
import com.google.android.material.snackbar.Snackbar
import com.example.simplecalculator3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private lateinit var result: TextView

    private var operatorSelected: String? = null
    private var calculateClicked = false
    private var firstNumberEntered: Double? = null
    private var secondNumberEntered: Double? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        result = findViewById(R.id.resultTextView)

        binding.plusRadioButton.setOnClickListener{
            operatorSelected = "+";
        }

        binding.minusRadioButton.setOnClickListener{
            operatorSelected = "-";
        }

        binding.multiplyRadioButton.setOnClickListener{
            operatorSelected = "*";
        }

        binding.divideRadioButton.setOnClickListener{
            operatorSelected = "/"
        }

        binding.modulusRadioButton.setOnClickListener{
            operatorSelected = "%"
        }

        binding.calculateButton.setOnClickListener{view: View ->
            calculateClicked = true

            if(operatorSelected != null && findViewById<EditText>(R.id.firstNumberEditText).text.isNotEmpty() && findViewById<EditText>(R.id.secondNumberEditText).text.isNotEmpty())
            {
                firstNumberEntered = findViewById<EditText>(R.id.firstNumberEditText).text.toString().toDouble()
                secondNumberEntered = findViewById<EditText>(R.id.secondNumberEditText).text.toString().toDouble()
                if(operatorSelected.equals("+"))
                {
                    result.text = (firstNumberEntered!! + secondNumberEntered!!).toString()
                }
                else if(operatorSelected.equals("-"))
                {
                    result.text = (firstNumberEntered!! - secondNumberEntered!!).toString()
                }
                else if(operatorSelected.equals("*"))
                {
                    result.text = (firstNumberEntered!! * secondNumberEntered!!).toString()
                }
                else if(operatorSelected.equals("/"))
                {
                    if(secondNumberEntered == 0.0)
                    {
                        Snackbar.make(
                            this,
                            view,
                            "Cannot Divide By 0",
                            Snackbar.LENGTH_SHORT)
                            .show()
                    }
                    else
                    {
                        result.text = (firstNumberEntered!! / secondNumberEntered!!).toString()
                    }
                }
                else
                {
                    if(secondNumberEntered == 0.0)
                    {
                        Snackbar.make(
                            this,
                            view,
                            "Cannot Modulus By 0",
                            Snackbar.LENGTH_SHORT)
                            .show()
                    }
                    else
                    {
                        result.text = (firstNumberEntered!! % secondNumberEntered!!).toString()
                    }
                }
            }
            else if(operatorSelected == null && findViewById<EditText>(R.id.firstNumberEditText).text.isNotEmpty() && findViewById<EditText>(R.id.secondNumberEditText).text.isNotEmpty())
            {
                Snackbar.make(
                    this,
                    view,
                    "Must Select Operation",
                    Snackbar.LENGTH_SHORT)
                    .show()
            }
            else if(operatorSelected != null && !findViewById<EditText>(R.id.firstNumberEditText).text.isNotEmpty() && !findViewById<EditText>(R.id.secondNumberEditText).text.isNotEmpty())
            {
                Snackbar.make(
                    this,
                    view,
                    "Must Enter Two Valid Numbers",
                    Snackbar.LENGTH_SHORT)
                    .show()
            }
            else
            {
                Snackbar.make(
                    this,
                    view,
                    "Must Select Operation and Enter Two Valid Numbers",
                    Snackbar.LENGTH_SHORT)
                    .show()
            }
        }
    }
}