package com.example.continuadaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun comprar(view: View) {
        val apiCachorros = ConexaoApiCachorros.criar()

        val etId1: EditText = findViewById(R.id.et_id1)
        val id1 = etId1.text.toString().toInt()

        val etId2: EditText = findViewById(R.id.et_id2)
        val id2 = etId2.text.toString().toInt()
    }
}