package com.investment.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.investment.cryptoItemModel
import com.investment.R
import com.investment.adapter.CustomAdapter
import com.investment.databinding.FragmentCryptoBinding


//
class Crypto : Fragment() { 

    private lateinit var binding: FragmentCryptoBinding
    lateinit var recyclerView: RecyclerView

    private val cryptoIcons = intArrayOf(
       R.drawable.bitcoin_icon,
       R.drawable.eth_icon,
       R.drawable.bnb_icon,
       R.drawable.usdt_icon,
       R.drawable.xrp_icon,
       R.drawable.litecoin_icon,
       R.drawable.doge_icon,
       R.drawable.sol_icon,
       R.drawable.shib_icon,
       R.drawable.luna_icon,
    )

   private val cryptoNames = arrayOf("BTC","ETH","BNB","USDT","XRP","LTC","DOGE","SOL","SHIBA","LUNA")


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentCryptoBinding.inflate(inflater, container, false);

//        // getting the recyclerview by its id
        recyclerView = binding.cryptoRecyclerView
//
//
//        // ArrayList of class ItemsViewModel
        val data = ArrayList<cryptoItemModel>()
//
//        // This loop will create 20 Views containing
//        // the image with the count of view
        for (i in 0..9) {
           data.add(cryptoItemModel(cryptoIcons[i], cryptoNames[i], "0.00"))
        }
//
//        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)
//
//        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
//
//        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(context)

        return binding.root
    }
}

