package com.deepshikhayadav.makeupclub.model

data class BrandModel (var brand: String, var link: String)

object Suppliers{
    val brands = listOf<BrandModel>(
            BrandModel("Annabelle","https://d3t32hsnjxo7q6.cloudfront.net/i/8ca9c5677e8b27321069490cc08b3d46_ra,w158,h184_pa,w158,h184.png"),
            BrandModel("Almay","https://d3t32hsnjxo7q6.cloudfront.net/i/d9b88855df583049fa9f995c88781338_ra,w158,h184_pa,w158,h184.png"),
            BrandModel("Alva","https://images.squarespace-cdn.com/content/v1/55853594e4b0f2164ef93df1/1484941515197-B7H0BWX6YNGPSYBA6SB9/alva-eyeshadow-cool-silk.jpg"),
            BrandModel("Anna sui","https://d3t32hsnjxo7q6.cloudfront.net/i/eea60b0c4f3b6539c1573415a610230d_ra,w158,h184_pa,w158,h184.jpg"),
            BrandModel("Benefit","https://s3.amazonaws.com/donovanbailey/products/api_featured_images/000/000/641/original/open-uri20171223-4-1yca462?1514061764"),
            BrandModel("Boosh","https://s3.amazonaws.com/donovanbailey/products/api_featured_images/000/001/044/original/data?1531071233"),
            BrandModel("Clinique","https://www.clinique.com/media/export/cms/products/181x209/clq_7M81_181x209.png"),
            BrandModel("Colourpop","https://cdn.shopify.com/s/files/1/1338/0845/products/brain-freeze_a_800x1200.jpg?v=1502255076"),
            BrandModel("Covergirl","https://d3t32hsnjxo7q6.cloudfront.net/i/60f9f4f29be5221ff70cf20fabc03564_ra,w158,h184_pa,w158,h184.png"),
            BrandModel("Dalish","https://d3t32hsnjxo7q6.cloudfront.net/i/6804e2a3b19200e7a7a67456421763c4_ra,w158,h184_pa,w158,h184.jpg"),
            BrandModel("Marcelle","https://d3t32hsnjxo7q6.cloudfront.net/i/f15f238ecfe181067f7b6158ade61f6e_ra,w158,h184_pa,w158,h184.jpg"),
            BrandModel("Marienatie","https://www.purpicks.com/wp-content/uploads/csm/pressed_eyeshadow_LORES_1024x1024_55deb6c3-b7cd-4cb5-9ede-f2931c07312a1.jpg"),
            BrandModel("Maybelline","https://d3t32hsnjxo7q6.cloudfront.net/i/991799d3e70b8856686979f8ff6dcfe0_ra,w158,h184_pa,w158,h184.png"),
            BrandModel("Milani","https://d3t32hsnjxo7q6.cloudfront.net/i/1b01ce49ace4842e034664361f1310de_ra,w158,h184_pa,w158,h184.jpg"),
            BrandModel("Misa","https://m.media-amazon.com/images/I/71cibEqDmGS._SY450_.jpg"),
            BrandModel("Mistura","https://d3t32hsnjxo7q6.cloudfront.net/i/d45c12626255b3ebd4d674060e1a38b3_ra,w158,h184_pa,w158,h184.jpeg"),
            BrandModel("Moov","https://d3t32hsnjxo7q6.cloudfront.net/i/f426b2e2e9ff8e01788a0947aad93512_ra,w158,h184_pa,w158,h184.jpg"),
            BrandModel("Nudus","https://cdn.shopify.com/s/files/1/0487/7509/products/NUDUS-all-colors-samples_250x.png?v=1484885826"),
            BrandModel("Nyx","https://www.nyxcosmetics.com/dw/image/v2/AANG_PRD/on/demandware.static/-/Sites-cpd-nyxusa-master-catalog/default/dw8068dbc4/ProductImages/Eyes/Propel_My_Eyes_Mascara/propelmyeyesmascara_main.jpg?sw=390&sh=390&sm=fit"),
            BrandModel("Orly","https://d3t32hsnjxo7q6.cloudfront.net/i/648283e42d7fafb7c03e8c60274cd5e0_ra,w158,h184_pa,w158,h184.png")
    )
}