package com.yernarkt.coderswag.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.yernarkt.coderswag.R
import com.yernarkt.coderswag.model.CategoriesData

class CategoriesAdapter(context: Context, categories: List<CategoriesData>) : BaseAdapter() {
    val context = context;
    val categories = categories;

    override fun getItem(position: Int): Any {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View = LayoutInflater.from(context).inflate(R.layout.item_category, parent, false)
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)
        val category = categories[position]

        val resourseId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        categoryImage.setImageResource(resourseId)
        categoryName.text = category.title
        return categoryView
    }

    override fun getItemId(position: Int): Long {
        return 0
    }
}