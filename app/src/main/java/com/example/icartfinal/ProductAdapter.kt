package com.example.icartfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

//Class to adapter the products
class ProductAdapter(
    val listadoProductos: Array<Product>,
    val listener: ProductsActivity,
): RecyclerView.Adapter<ProductAdapter.ViewHolder>() {

    //Contains the views to manage
    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
        var itemTitle = itemView.findViewById<TextView>(R.id.tvProducto)

        init { //Constructor function
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) { //When clicking on the screen add another position in the list
            val position:Int = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                listener.onRecyclerClick(position, listadoProductos)
            }
        }

        //Data of product which user wants to get
        fun bindProduct(prod: Product){
            itemTitle.text = prod.nombre

        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { //Show a view of element without personalize
        val infl = LayoutInflater.from(parent.context).inflate(R.layout.product_layout, parent, false)
        return ViewHolder(infl)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //Update the data of existing ViewHolder
        val prod = listadoProductos[position]
        holder.bindProduct(prod)
    }

    override fun getItemCount(): Int { //Return total elements in product list
        return listadoProductos.size
    }

}


