package com.example.icartfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
//import androidx.core.os.persistableBundleOf
import androidx.recyclerview.widget.RecyclerView

//Class principal of shopping list
class ShoppingListAdapter(
    listaCompra:ArrayList<String>,
    val listener: ShoppingListActivity,
    val onClickDelete: (Int) -> Unit):
    RecyclerView.Adapter<ShoppingListAdapter.ViewHolder>() {
    var lista = listaCompra

    //Contains the views to manage
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var itemTitle = itemView.findViewById<TextView>(R.id.tvShoppingList)
        val btnEliminar = itemView.findViewById<Button>(R.id.btnEliminar)

        init { //Constructor function
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) { //When clicking on the screen add another position in the list
        }

        //Data of product which user want to get
        fun bindName(nombre: String, position: Int) {
            itemTitle.text = nombre
            btnEliminar.setOnClickListener { onClickDelete(position) }
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { //Show a view of element without personalize
        val infl = LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_layout, parent, false)
        return ViewHolder(infl)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //Update the data of existing ViewHolder
        val nombre = lista[position]
        holder.bindName(nombre, position)
    }

    override fun getItemCount(): Int { //Return total elements in shopping cart
        return lista.size
    }

    //Setter of items
    fun setItems(listaCompra:ArrayList<String>){
        lista = listaCompra
        notifyDataSetChanged()
    }
}
