package com.integrator.giti.examoptativa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val covid = findViewById<CardView>(R.id.covid)
        val forex = findViewById<CardView>(R.id.forex)
        val bValores = findViewById<CardView>(R.id.bValores)

        covid.setOnClickListener {

            val intent = Intent(this, CovidActivity::class.java)
            startActivity(intent)

        }

        forex.setOnClickListener {

            val intent = Intent(this, ForexActivity::class.java)
            startActivity(intent)

        }

        bValores.setOnClickListener {

            val intent = Intent(this, BValoresActivity::class.java)
            startActivity(intent)

        }

    }
}