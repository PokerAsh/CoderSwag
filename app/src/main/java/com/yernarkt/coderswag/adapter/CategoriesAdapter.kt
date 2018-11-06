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
        return categories[position]
    }

    override fun getCount(): Int {
        return categories.count()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.item_category, parent, false)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryTitle = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position]

        val resourseId = context.resources.getIdentifier(category.image, "drawable", context.packageName)
        holder.categoryImage?.setImageResource(resourseId)
        holder.categoryTitle?.text = category.title
        return categoryView
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryTitle: TextView? = null
    }
}