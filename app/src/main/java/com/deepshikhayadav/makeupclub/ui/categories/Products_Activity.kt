package com.deepshikhayadav.makeupclub.ui.categories

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.Window
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import com.deepshikhayadav.makeupclub.R
import com.deepshikhayadav.makeupclub.adapter.CategoryAdapter
import com.deepshikhayadav.makeupclub.adapter.Hor_tabAdapter
import com.deepshikhayadav.makeupclub.adapter.ProductAdapter
import com.deepshikhayadav.makeupclub.model.Suppliers
import com.deepshikhayadav.makeupclub.ui.dashboard.DashboardViewModel
import kotlinx.android.synthetic.main.activity_products_.*
import kotlinx.coroutines.DelicateCoroutinesApi
import java.lang.Exception

class Products_Activity : AppCompatActivity() {
    private lateinit var myViewModel: DashboardViewModel

    @OptIn(DelicateCoroutinesApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products_)

        try {
            val bundle = intent.extras
            var s = bundle!!.getString("cat")
            var i = bundle.getInt("con")

            myViewModel = ViewModelProvider(this)[DashboardViewModel::class.java]
            myViewModel.makeupResponse(s.toString(), i)

            val recyclerView2: RecyclerView = findViewById(R.id.product_recycle)
            recyclerView2.setHasFixedSize(true)
            recyclerView2.itemAnimator = DefaultItemAnimator()


            myViewModel.properties.observe(this) {
                progresss.visibility = View.GONE
                recyclerView2.adapter = CategoryAdapter(it)
            }
        }
        catch (e:Exception){
            Log.i("------",e.localizedMessage)
        }


    }
    
}