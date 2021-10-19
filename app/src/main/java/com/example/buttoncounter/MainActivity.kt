package com.example.buttoncounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var numberTV: TextView
    private var number=26

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numberTV= findViewById(R.id.numberTV)

    }

    fun add(view: View) {
        numberTV.text= "${++number}!!"
    }
    fun minus(view: View) {
        numberTV.text= "${--number}!!"
    }
}