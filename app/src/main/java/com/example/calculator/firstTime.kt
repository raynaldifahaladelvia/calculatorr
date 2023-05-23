package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class firstTime : AppCompatActivity() {
//    private lateinit var myEditText: EditText
//    private lateinit var myTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_time)

        var et = findViewById<EditText>(R.id.my_edit_text)
        var btn = findViewById<Button>(R.id.my_button)
        var tv = findViewById<TextView>(R.id.my_text_view)
        var btn2 = findViewById<Button>(R.id.my_button2)
        var btn3 = findViewById<Button>(R.id.my_button3)

//        myEditText = findViewById(R.id.my_edit_text)
//        myTextView = findViewById(R.id.my_text_view)

        btn.setOnClickListener {
//            val newText = myEditText.text.toString()
//            myTextView.text = newText
              tv.text = et.text.toString()
        }

        btn2.setOnClickListener {
            var intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {
            var intent = Intent(this,firstTime2::class.java)
            startActivity(intent)
        }

    }
}