package com.example.myapplicationv34

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.practica1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val urls_img = arrayListOf(
            "https://upload.wikimedia.org/wikipedia/commons/d/d3/Albert_Einstein_Head.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/5/51/Marie_Curie_%281900%29.jpg/220px-Marie_Curie_%281900%29.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Nelson_Mandela_1994_%282%29.jpg/220px-Nelson_Mandela_1994_%282%29.jpg",
            "https://upload.wikimedia.org/wikipedia/commons/0/06/Frida_Kahlo%2C_by_Guillermo_Kahlo.jpg"
        )
        val urls_buttonlinks = arrayListOf(
            "https://es.wikipedia.org/wiki/Albert_Einstein",
            "https://es.wikipedia.org/wiki/Marie_Curie",
            "https://es.wikipedia.org/wiki/Nelson_Mandela",
            "https://es.wikipedia.org/wiki/Frida_Kahlo"
        )
        val buttons = arrayListOf(
            findViewById<Button>(R.id.boton1),
            findViewById<Button>(R.id.boton2),
            findViewById<Button>(R.id.boton3),
            findViewById<Button>(R.id.boton4)
        )
        val imageViews = arrayListOf(
            findViewById<ImageView>(R.id.imagen1),
            findViewById<ImageView>(R.id.imagen2),
            findViewById<ImageView>(R.id.imagen3),
            findViewById<ImageView>(R.id.imagen4)
        )

        //Carga de Cards
        CargarCards(urls_img,imageViews,buttons,urls_buttonlinks)

    }
    fun CargarCards(urls_img: ArrayList<String>, imageViews: ArrayList<ImageView>,
                    buttons: ArrayList<Button>, urls_buttonlinks: ArrayList<String>,) {

        for (i in 0..3) {
            Glide.with(this)
                .load(urls_img[i])
                .centerCrop()
                .into(imageViews[i])
            buttons[i].setOnClickListener {
                val intent = Intent(Intent.ACTION_VIEW, Uri.parse(urls_buttonlinks[i]))
                startActivity(intent)
            }
        }
    }
}
