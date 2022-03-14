package com.example.icartfinal

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CategoryAdapter(
    val categorias: Array<Category>,
    val listener: CategoriesActivity,

    ): RecyclerView.Adapter<CategoryAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener{ //Contains the views to manage
        var itemTitle = itemView.findViewById<TextView>(R.id.tvCategoria)

        init { //Constructor function
            itemView.setOnClickListener(this)
        }

        override fun onClick(v: View?) { //When clicking on the screen add another position in the list
            val position:Int = adapterPosition
            if(position != RecyclerView.NO_POSITION) {
                    listener.onRecyclerClick(position)
            }
        }

        fun bindCategory(categoria: Category){ //Data of category which user wants to get
            itemTitle.text = categoria.nombreCategoria
        }


    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder { //Show a view of element without personalize
        val infl = LayoutInflater.from(parent.context).inflate(R.layout.category_layout, parent, false)
        return ViewHolder(infl)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) { //Update the data of existing ViewHolder
        val cat = categorias[position]
            holder.bindCategory(cat)
        }

    override fun getItemCount(): Int { //Return total elements of category
        return categorias.size
    }

}
