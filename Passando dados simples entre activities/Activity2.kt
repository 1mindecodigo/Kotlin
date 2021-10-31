package com.ummin.myapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.service.autofill.TextValueSanitizer
import android.widget.TextView
import org.w3c.dom.Text

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        val textViewTitulo = findViewById<TextView>(R.id.textViewTitulo)

        val nome = intent.extras?.getString("nome")
        textViewTitulo.text = "Olá, "+nome
    }
}