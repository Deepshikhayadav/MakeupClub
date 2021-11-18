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
    val product_type: String
        )

/*
object Brands{
    private val brands = arrayListOf("annabelle","almay","alva","anna sui","benefit","boosh","clinique","colourpop","covergirl","dalish","marcelle","marienatie","maybelline","milani","misa","mistura","moov","nudus","nyx","orly")

    var list : ArrayList<MyResponse>? =null
    get() {
       if(field!=null)
            return field

            field= ArrayList()
            for( i in brands.indices){
                val brand= brands[i]
                val myResponse : MyResponse(brand)
                field!!.add(myResponse)
            }
           return field


    }
}

*/
