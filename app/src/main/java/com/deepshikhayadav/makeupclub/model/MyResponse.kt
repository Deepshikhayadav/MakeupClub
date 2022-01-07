package com.deepshikhayadav.makeupclub.model

import com.google.gson.annotations.SerializedName

data class MyResponse (
    val brand: String,
    val name: String,
    val price_sign: String,
    val price: String,
    @SerializedName("image_link")
    val imageLink: String,
    val description: String,
    val category: String,
    val product_type: String)

