package com.investment.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.investment.R
import com.investment.fragments.Savings
import com.investment.savingItemModel

class SavingCustomAdapter (private val mList: List<savingItemModel>) : RecyclerView.Adapter<SavingCustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.savings_list_layout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val savingItemModel =  mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(savingItemModel.img)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = savingItemModel.name

        holder.detail.text = savingItemModel.details

        holder.itemView.setOnClickListener {

            Snackbar.make(it, "Savings platform...coming soon", Snackbar.LENGTH_SHORT)
                .show()
        }


    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        Log.d("Tag: ", mList.size.toString())
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.name)
        val detail: TextView = itemView.findViewById(R.id.details)
    }
}