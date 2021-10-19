package com.example.imageviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val image = findViewById<ImageView>(R.id.imageView)
        val blackBtn = findViewById<Button>(R.id.blackbtn)
        val cortadoBtn = findViewById<Button>(R.id.Cortadobtn)

        blackBtn.setOnClickListener {
            image.setImageResource(R.drawable.black)
        }

        cortadoBtn.setOnClickListener {
            image.setImageResource(R.drawable.cortado)
        }

    }
}