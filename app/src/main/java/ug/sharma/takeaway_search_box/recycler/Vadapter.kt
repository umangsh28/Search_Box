package ug.sharma.takeaway_search_box.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import ug.sharma.takeaway_search_box.R
import ug.sharma.takeaway_search_box.databinding.ItemDesignBinding
import ug.sharma.takeaway_search_box.model.Data
import ug.sharma.takeaway_search_box.model.ResponseDTO

class Vadapter(private  val result: ResponseDTO):RecyclerView.Adapter<VviewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): VviewHolder {
        val layoutInflater= LayoutInflater.from(parent.context)
        val itemLayoutBinding: ItemDesignBinding = DataBindingUtil.
        inflate(layoutInflater, R.layout.item_design,parent,false)
        return VviewHolder(itemLayoutBinding)
    }

    override fun onBindViewHolder(holder: VviewHolder, p1: Int) {
        val result: Data = result.data
        holder.SetData(result)
    }

    override fun getItemCount(): Int {
        return result.data.addressList.size
    }

}