
package com.example.obd2demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val speedText = findViewById<TextView>(R.id.speedText)
        val rpmText = findViewById<TextView>(R.id.rpmText)

        // Demo dữ liệu giả lập
        speedText.text = "Speed: 60 km/h"
        rpmText.text = "RPM: 2500"
    }
}
