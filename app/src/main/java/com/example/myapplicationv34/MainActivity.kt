package com.example.myapplicationv34

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide
import com.example.practica1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView1 = findViewById<ImageView>(R.id.imagen1)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/d/d3/Albert_Einstein_Head.jpg")
            .centerCrop()
            .into(imageView1)

        val button1 = findViewById<Button>(R.id.boton1)
        button1.setOnClickListener {
            val url = "https://es.wikipedia.org/wiki/Albert_Einstein"
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
            startActivity(intent)
        }

        val imageView2 = findViewById<ImageView>(R.id.imagen2)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Marie_Curie_%281900%29.jpg/220px-Marie_Curie_%281900%29.jpg")
            .centerCrop()
            .into(imageView2)

        val button2 = findViewById<Button>(R.id.boton2)
        button2.setOnClickListener {
            val url2 = "https://es.wikipedia.org/wiki/Marie_Curie"
            val intent2 = Intent(Intent.ACTION_VIEW, Uri.parse(url2))
            startActivity(intent2)
        }
        val imageView3 = findViewById<ImageView>(R.id.imagen3)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Nelson_Mandela_1994_%282%29.jpg/220px-Nelson_Mandela_1994_%282%29.jpg")
            .centerCrop()
            .into(imageView3)

        val button3 = findViewById<Button>(R.id.boton3)
        button3.setOnClickListener {
            val url3 = "https://es.wikipedia.org/wiki/Nelson_Mandela"
            val intent3 = Intent(Intent.ACTION_VIEW, Uri.parse(url3))
            startActivity(intent3)
        }
        val imageView4 = findViewById<ImageView>(R.id.imagen4)
        Glide.with(this)
            .load("https://upload.wikimedia.org/wikipedia/commons/0/06/Frida_Kahlo%2C_by_Guillermo_Kahlo.jpg")
            .centerCrop()
            .into(imageView4)

        val button4 = findViewById<Button>(R.id.boton4)
        button4.setOnClickListener {
            val url4 = "https://es.wikipedia.org/wiki/Frida_Kahlo"
            val intent4 = Intent(Intent.ACTION_VIEW, Uri.parse(url4))
            startActivity(intent4)
        }
    }
}
