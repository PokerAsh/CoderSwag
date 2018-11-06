package com.yernarkt.coderswag.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.yernarkt.coderswag.R
import com.yernarkt.coderswag.model.CategoriesData

class CategoriesRVAdapter(val context: Context, val categories: List<CategoriesData>) :
    RecyclerView.Adapter<CategoriesRVAdapter.CategoriesRVViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriesRVViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_category, parent, false)

        return CategoriesRVViewHolder(view)
    }

    override fun getItemCount(): Int {
        return categories.count()
    }

    override fun onBindViewHolder(holder: CategoriesRVViewHolder, position: Int) {
        val category = categories[position]
        holder.bind(category, context)
    }

    inner class CategoriesRVViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val categoryImage = itemView.findViewById<ImageView>(R.id.categoryImage)
        val categoryTitle = itemView.findViewById<TextView>(R.id.categoryName)!!

        fun bind(category: CategoriesData, context: Context){
            val resourseId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
            categoryImage.setImageResource(resourseId)
            categoryTitle.text = category.title
        }
    }
}