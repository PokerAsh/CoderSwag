package com.yernarkt.coderswag.services

import com.yernarkt.coderswag.model.CategoriesData
import com.yernarkt.coderswag.model.ProductData

object DataService {
    val categories = listOf(
        CategoriesData("SHIRTS", "shirtimage"),
        CategoriesData("HOODIES", "hoodieimage"),
        CategoriesData("HAT", "hatimage"),
        CategoriesData("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
        ProductData("Devslopes Graphoc Beanie", "$18", "hat1"),
        ProductData("Devslopes Hat Black", "$21", "hat2"),
        ProductData("Devslopes Hat White", "$25", "hat3"),
        ProductData("Devslopes Hat Snapback", "$15", "hat4")
    )

    val hoodies = listOf(
        ProductData("Devslopes Hoodie Gray", "$28", "hoodie1"),
        ProductData("Devslopes Hoodie Red", "$32", "hoodie2"),
        ProductData("Devslopes Gray Hoodie", "$40", "hoodie3"),
        ProductData("Devslopes Black Hoodie", "$30", "hoodie4")
    )

    val shirts = listOf(
        ProductData("Devslopes Shirt Black", "$18", "shirt1"),
        ProductData("Devslopes Badge Light Gray", "$20", "shirt2"),
        ProductData("Devslopes Logo Shirt Red", "$22", "shirt3"),
        ProductData("Devslopes Hustle", "$22", "shirt4"),
        ProductData("Kickflip Studio", "$25", "shirt5")
    )

    val digitalGoods = listOf<ProductData>()

    fun getProducts(categories: String) : List<ProductData>{
        return when(categories){
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGoods
        }
    }
}