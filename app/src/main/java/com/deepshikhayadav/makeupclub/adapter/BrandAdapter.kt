package com.deepshikhayadav.makeupclub.adapter

import android.os.Parcel
import android.os.Parcelable
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.deepshikhayadav.makeupclub.R
import com.deepshikhayadav.makeupclub.adapter.BrandAdapter.MyViewHolder
import com.deepshikhayadav.makeupclub.model.BrandModel
import com.deepshikhayadav.makeupclub.model.MyResponse
import kotlinx.android.synthetic.main.hor_rec_resource.view.*

class BrandAdapter(private val res: List<BrandModel>/*,private val listener: HorItemClicked*/) : RecyclerView.Adapter<MyViewHolder>() {

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
       // val brands = arrayOf("annabelle","almay","alva","anna sui","benefit","boosh","clinique","colourpop","covergirl","dalish","marcelle","marienatie","maybelline","milani","misa","mistura","moov","nudus","nyx","orly")

        fun bind(brandModel: BrandModel){

            itemView.name.text=brandModel.brand
            Glide.with(itemView.imageView.context)
                .load(brandModel.link)
                .into(itemView.imageView)
           /* itemView.setOnClickListener(View.OnClickListener {
                //Toast.makeText(this,"Clicked",Toast.LENGTH_SHORT).show()
                Log.i("url to image","Clicked")
            })*/
        }

    }

    interface HorItemClicked {
        fun onItemClicked(item : BrandModel)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.hor_rec_resource,parent,false)
        val viewHolder=MyViewHolder(view)

        view.setOnClickListener{
            //listener.onItemClicked(res[viewHolder.adapterPosition])
        }
        return viewHolder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) =holder.bind(res[position])

    override fun getItemCount(): Int = res.count()
}


