package com.example.kotlintute7_agecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



    }

    fun onSubmit(view: View) {
        val inputYear = findViewById<TextView>(R.id.etYear)
        val txtAge = findViewById<TextView>(R.id.tvAge)
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        txtAge.text="Age :" + (currentYear - inputYear.text.toString().toInt())
    }
}