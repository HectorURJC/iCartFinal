package com.example.icartfinal

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Vibrator
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//Principal class to products
class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) { //The principal function when running on the screen.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)
        val data = intent.extras
        val posicion = data!!.getInt("posicion")
        val tvTitulo = findViewById<TextView>(R.id.tvNombreCategoria)
        tvTitulo.text = ShoppingList.listadoCategorias[posicion].nombreCategoria

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewProductos)
        val adaptador = ProductAdapter(ShoppingList.listadoCategorias[posicion].productos, this)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adaptador
        recyclerView.setHasFixedSize(true)

        val btnVerLista = findViewById<Button>(R.id.btnVerLista)
        btnVerLista.setOnClickListener {
            val intent = Intent(this, ShoppingListActivity::class.java)
            startActivity(intent)
        }
        val numProduct = findViewById<TextView>(R.id.numProducts2)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }

    //When clicking any products, vibrate the device.
    fun onRecyclerClick(position: Int, listaProductos: Array<Product>) {
        ShoppingList.addToList(listaProductos[position].nombre)
        val vibratorService = getSystemService(Context.VIBRATOR_SERVICE) as Vibrator
        vibratorService.vibrate(200)
        val numProduct = findViewById<TextView>(R.id.numProducts2)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }

    override fun onResume() { //The function which showing all elements in list
        super.onResume()
        val numProduct = findViewById<TextView>(R.id.numProducts2)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }
}