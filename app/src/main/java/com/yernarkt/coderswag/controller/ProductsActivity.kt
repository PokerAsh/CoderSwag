package com.yernarkt.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import com.yernarkt.coderswag.R
import com.yernarkt.coderswag.adapter.ProductsAdapter
import com.yernarkt.coderswag.services.DataService
import com.yernarkt.coderswag.util.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {
    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)

        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))
        productsListView.adapter = adapter
        productsListView.setHasFixedSize(true)
        val manager = GridLayoutManager(this, 2)
        productsListView.layoutManager = manager
    }
}
