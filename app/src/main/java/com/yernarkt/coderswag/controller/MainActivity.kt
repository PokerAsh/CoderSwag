package com.yernarkt.coderswag.controller

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.yernarkt.coderswag.R
import com.yernarkt.coderswag.model.CategoriesData
import com.yernarkt.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: ArrayAdapter<CategoriesData>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            DataService.categories
        )

        categoriesListView.adapter = adapter
    }
}
