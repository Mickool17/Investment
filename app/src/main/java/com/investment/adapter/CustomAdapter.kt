package com.investment.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.investment.cryptoItemModel
import com.investment.R

class CustomAdapter(private val mList: List<cryptoItemModel>) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_layout, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val cryptoItemModel =  mList[position]

        // sets the image to the imageview from our itemHolder class
        holder.imageView.setImageResource(cryptoItemModel.img)

        // sets the text to the textview from our itemHolder class
        holder.textView.text = cryptoItemModel.text

        holder.price.text = cryptoItemModel.price

    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        Log.d("Tag: ", mList.size.toString())
        return mList.size
    }

    // Holds the views for adding it to image and text
    class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        val textView: TextView = itemView.findViewById(R.id.textView)
        val price: TextView = itemView.findViewById(R.id.amt)
    }
}
