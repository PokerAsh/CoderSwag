package com.yernarkt.coderswag.controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.yernarkt.coderswag.R
import com.yernarkt.coderswag.adapter.CategoriesRVAdapter
import com.yernarkt.coderswag.services.DataService
import com.yernarkt.coderswag.util.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: CategoriesRVAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = CategoriesRVAdapter(this, DataService.categories) { categoriesData ->
            val intent = Intent(this, ProductsActivity::class.java)
            intent.putExtra(EXTRA_CATEGORY, categoriesData.title)
            startActivity(intent)
        }

        categoriesListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        categoriesListView.layoutManager = layoutManager
        categoriesListView.setHasFixedSize(true)
    }
}
