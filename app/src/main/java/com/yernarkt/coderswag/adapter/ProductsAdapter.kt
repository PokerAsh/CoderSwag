package com.yernarkt.coderswag.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.yernarkt.coderswag.R
import com.yernarkt.coderswag.model.ProductData

class ProductsAdapter(val context: Context, val products: List<ProductData>) :
    RecyclerView.Adapter<ProductsAdapter.Holder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): Holder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_product, p0, false)
        return Holder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(p0: Holder, p1: Int) {
        p0.bind(context, products[p1])
    }

    inner class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage = itemView.findViewById<ImageView>(R.id.productImage)
        val productTitle = itemView.findViewById<TextView>(R.id.productTitle)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)

        fun bind(context: Context, products: ProductData) {
            val resourseId = context.resources.getIdentifier(products.image, "drawable", context.packageName)
            productImage.setImageResource(resourseId)
            productTitle.text = products.title
            productPrice.text = products.price
        }
    }
}