package com.deepshikhayadav.makeupclub.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.deepshikhayadav.makeupclub.R
import com.deepshikhayadav.makeupclub.model.MyResponse
import com.deepshikhayadav.makeupclub.ui.dashboard.DashboardViewModel
import kotlinx.android.synthetic.main.slider_horizon.view.*

class CategoryAdapter(private val res: List<MyResponse>) : RecyclerView.Adapter<CategoryAdapter.myViewHolder>() {
    class myViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(myResponse: MyResponse){
            itemView.productName.text=myResponse.category
            itemView.category.text=myResponse.description
            itemView.price.text= myResponse.price
            Glide.with(itemView.img.context)
                    .load(myResponse.imageLink)
                    .into(itemView.img)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.slider_horizon,parent,false)
        val viewHolder= myViewHolder(view)

        view.setOnClickListener{
            //listener.onItemClicked(res[viewHolder.adapterPosition])
        }
        return viewHolder
    }


    override fun onBindViewHolder(holder: myViewHolder, position: Int) =holder.bind(res[position])

    override fun getItemCount(): Int = res.count()

}
