package com.example.icartfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class InfoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)

        val mensaje =
                "iCart es una aplicación que te permite crear listas de la compra.\n" +
                "\n" +
                "Para crear una lista, se le da al botón de \"nueva lista\". A continuación, " +
                        "se selecciona la categoría de los productos a escoger, como lácteos, fruta…\n" +
                "\n" +
                "Una vez en la categoría, se pueden visualizar los productos. Basta con clicar " +
                "sobre ellos para añadirlos en la lista.\n" +
                "\n" +
                "Se puede navegar con el botón de atrás para volver a categorías y en cualquier momento " +
                "se puede consultar la lista creada y sus productos."
        val tvInfo = findViewById<TextView>(R.id.tvInfo)
        tvInfo.text= mensaje
        tvInfo.textSize = 18f
    }
}