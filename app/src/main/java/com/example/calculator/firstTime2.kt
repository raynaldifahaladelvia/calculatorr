package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.calculator.databinding.ActivityFirstTime2Binding
import java.text.DecimalFormat


class firstTime2 : AppCompatActivity() {
    lateinit var binding : ActivityFirstTime2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_time2)
        binding = ActivityFirstTime2Binding.inflate(layoutInflater)

//        var et = findViewById<EditText>(R.id.my_edit_text2)
//        var btn = findViewById<Button>(R.id.my_button)
//        var tv = findViewById<TextView>(R.id.my_text_view)
//        var btn2 = findViewById<Button>(R.id.my_button2)
//        var btn3 = findViewById<Button>(R.id.my_button3)

//        myEditText = findViewById(R.id.my_edit_text)
//        myTextView = findViewById(R.id.my_text_view)


        binding.myButton.setOnClickListener(){
//            val binding = ActivityFirstTime2Binding.inflate(layoutInflater)
//
             ubahData()
        }
        setContentView(binding.root)

        binding.myButton2.setOnClickListener(){
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        binding.myButton3.setOnClickListener(){
            var intent = Intent(this,firstTime::class.java)
            startActivity(intent)
        }

    }

    fun ubahData()
    {
//        binding.myTextView.text = binding.myEditText2.text.toString()
        var x = binding.myEditText2.text.toString().toInt()
        var y = x * 10
        binding.myTextView.text = y.toString()
    }
}