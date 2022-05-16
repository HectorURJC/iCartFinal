package com.example.icartfinal

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//Principal activity to shopping list
class ShoppingListActivity : AppCompatActivity() {

    lateinit var adapter:ShoppingListAdapter

    @SuppressLint("NotifyDataSetChanged")
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

    //Function to delete elements
    fun onClickDelete(posicion: Int){
        ShoppingList.listaCompra.removeAt(posicion)
        adapter.setItems(ShoppingList.listaCompra)
    }
}