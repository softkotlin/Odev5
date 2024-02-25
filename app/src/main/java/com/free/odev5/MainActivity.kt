package com.free.odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.free.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding;
    var result: String? = ""
    var isResultActive = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.result.text = ""

        binding.button0.setOnClickListener() {
            buttonClick("0")
        }

        binding.button1.setOnClickListener() {
            buttonClick("1")
        }

        binding.button2.setOnClickListener() {
            buttonClick("2")
        }

        binding.button3.setOnClickListener() {
            buttonClick("3")
        }

        binding.button4.setOnClickListener() {
            buttonClick("4")
        }

        binding.button5.setOnClickListener() {
            buttonClick("5")
        }

        binding.button6.setOnClickListener() {
            buttonClick("6")
        }

        binding.button7.setOnClickListener() {
            buttonClick("7")
        }

        binding.button8.setOnClickListener() {
            buttonClick("8")
        }

        binding.button9.setOnClickListener() {
            buttonClick("9")
        }

        binding.buttonAC.setOnClickListener() {
            binding.result.text = ""
            result = ""
        }

        binding.buttonPlus.setOnClickListener() {
            if (result != "" && result?.last() != '+') {
                buttonClick("+")
            }
        }

        binding.buttonResult.setOnClickListener() {
            val numList = result?.split("+")
            val listSize = numList?.size ?: 0
            Log.e("ListSize", "${listSize}")

            if (listSize > 1 && result?.last() != '+') {
                var showResult = 0
                if (numList != null) {
                    for (num in numList) {
                        showResult += num.toInt()
                    }
                }

                isResultActive = true
                result = ""
                binding.result.text = showResult.toString()
            }
        }
    }

    fun buttonClick(num: String) {
        if (true) {
            binding.result.text = ""
            isResultActive = false
        }
        result = result + num
        binding.result.text = result
    }
}