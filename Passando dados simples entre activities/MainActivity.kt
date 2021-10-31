package com.ummin.myapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val editTextNome = findViewById<EditText>(R.id.editTextNome)

        button.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            intent.putExtra("nome",editTextNome.text.toString())
            startActivity(intent)
        }
    }
}