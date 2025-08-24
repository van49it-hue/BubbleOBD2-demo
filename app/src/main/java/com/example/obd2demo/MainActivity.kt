package com.example.obd2demo

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this).apply {
            text = "Hello OBD2 🚗"
            textSize = 24f
            setPadding(48, 48, 48, 48)
        }
        setContentView(tv)
    }
}