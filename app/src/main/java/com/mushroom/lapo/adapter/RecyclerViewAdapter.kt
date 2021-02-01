package com.mushroom.lapo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.mushroom.lapo.R
import com.mushroom.lapo.model.customerData

class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items : List<customerData> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return CustomerViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is CustomerViewHolder ->{
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun submitList(customerData: List<customerData>){
        items = customerData
    }
    class CustomerViewHolder constructor(
            itemView: View
    ): RecyclerView.ViewHolder(itemView){
        val customer_Image= itemView.findViewById<ImageView>(R.id.imag)
        val customer_title = itemView.findViewById<TextView>(R.id.tv_title)
        val customer_body = itemView.findViewById<TextView>(R.id.desc)
        val customer_date = itemView.findViewById<TextView>(R.id.date)

        fun bind(customerData: customerData){
            customer_title.setText(customerData.title)
            customer_body.setText(customerData.body)
            customer_date.setText(customerData.time)
            customer_Image.setImageResource(customerData.image)
        }
    }
}