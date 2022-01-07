package com.deepshikhayadav.makeupclub.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.deepshikhayadav.makeupclub.R
import com.deepshikhayadav.makeupclub.model.BrandModel
import com.deepshikhayadav.makeupclub.ui.dashboard.DashboardViewModel
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.hor_rec_resource.view.*
import kotlinx.android.synthetic.main.hor_rec_resource.view.name
import kotlinx.android.synthetic.main.hor_tablayout.view.*

class Hor_tabAdapter (val viewModel:DashboardViewModel, private val res: List<BrandModel>) : RecyclerView.Adapter<Hor_tabAdapter.MyViewHolder>() {
private val myConst:Int=1
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(brandModel: BrandModel){
            itemView.tab.text=brandModel.brand
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.hor_tablayout,parent,false)
        val viewHolder=MyViewHolder(view)

        view.setOnClickListener{

            val txt=res[viewHolder.adapterPosition].brand.toLowerCase()
           // Toast.makeText(parent.context,txt, Toast.LENGTH_SHORT).show()
            viewModel.makeupResponse(txt,myConst)
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =holder.bind(res[position])

    override fun getItemCount(): Int = res.count()
}

