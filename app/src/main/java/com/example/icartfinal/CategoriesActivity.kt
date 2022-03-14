package com.example.icartfinal

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


//Principal class of category
class CategoriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) { //The principal function when running.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories)

        val btnVerLista = findViewById<Button>(R.id.btnVerListaCat)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewCategorias)
        val adaptador = CategoryAdapter(ShoppingList.listadoCategorias, this)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adaptador
        recyclerView.setHasFixedSize(true)
        btnVerLista.setOnClickListener {
            val intent = Intent(this, ShoppingListActivity::class.java)
            startActivity(intent)
        }
        val numProduct = findViewById<TextView>(R.id.numProducts)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }

    override fun onResume() { //The function which showing all elements in list
        super.onResume()
        val numProduct = findViewById<TextView>(R.id.numProducts)
        numProduct.text = ShoppingList.listaCompra.size.toString()
    }

    //Insert one position in list
    fun onRecyclerClick(position: Int) { //Insert one position in list
        val intent = Intent(this, ProductsActivity::class.java)
        intent.putExtra("posicion", position)
        startActivity(intent)
    }
}