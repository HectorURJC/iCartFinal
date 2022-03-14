package com.example.icartfinal

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ShoppingListActivity : AppCompatActivity() {

    lateinit var adapter:ShoppingListAdapter

    override fun onCreate(savedInstanceState: Bundle?) { //The principal function when running on the screen.
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_list)

        val btnBorrarTodo = findViewById<Button>(R.id.btnBorrarTodo)
        btnBorrarTodo.setOnClickListener { //Button of delete all elements in list
            ShoppingList.listaCompra.clear()
            adapter.notifyDataSetChanged()
        }

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewShoppingList)
        adapter = ShoppingListAdapter(ShoppingList.listaCompra, this){index -> onClickDelete(index)}
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)

    }

    fun onClickDelete(posicion: Int){ //Function to delete elements
        ShoppingList.listaCompra.removeAt(posicion)
        adapter.setItems(ShoppingList.listaCompra)
    }
}