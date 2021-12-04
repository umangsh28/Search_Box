package ug.sharma.takeaway_search_box.recycler

import androidx.recyclerview.widget.RecyclerView
import ug.sharma.takeaway_search_box.databinding.ItemDesignBinding
import ug.sharma.takeaway_search_box.model.Data

class VviewHolder(private val itemDesignBinding: ItemDesignBinding)
    :RecyclerView.ViewHolder(itemDesignBinding.root) {

        fun SetData(data: Data){
            itemDesignBinding.cinema=data

            itemDesignBinding.title.text=data.addressList.get(adapterPosition).city

            itemDesignBinding.popularity.text=data.addressList.get(adapterPosition).addressString
        }




}