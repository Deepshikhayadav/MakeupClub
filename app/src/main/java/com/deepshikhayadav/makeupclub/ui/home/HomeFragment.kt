package com.deepshikhayadav.makeupclub.ui.home

import android.app.Application
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.RecyclerView
import com.deepshikhayadav.makeupclub.MainActivity2
import com.deepshikhayadav.makeupclub.R
import com.deepshikhayadav.makeupclub.adapter.BrandAdapter
import com.deepshikhayadav.makeupclub.model.MyResponse
import com.deepshikhayadav.makeupclub.model.Suppliers

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
  //  private val brands = arrayOf("annabelle","almay","alva","anna sui","benefit","boosh","clinique","colourpop","covergirl","dalish","marcelle","marienatie","maybelline","milani","misa","mistura","moov","nudus","nyx","orly")

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        val textView: TextView = root.findViewById(R.id.text)
       /* homeViewModel.properties.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/

        val recyclerView: RecyclerView = root.findViewById(R.id.recycle2)
        val brand=Suppliers.brands
        recyclerView.setHasFixedSize(true)
        recyclerView.itemAnimator=DefaultItemAnimator()
        recyclerView.adapter=BrandAdapter(brand)

        homeViewModel.properties.observe(viewLifecycleOwner, Observer {
           // recyclerView.adapter=BrandAdapter(it)

        })
        return root
    }

    companion object {
       // private const val brands = arrayOf("annabelle","almay","alva","anna sui","benefit","boosh","clinique","colourpop","covergirl","dalish","marcelle","marienatie","maybelline","milani","misa","mistura","moov","nudus","nyx","orly")
    }
}