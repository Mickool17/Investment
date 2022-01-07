package com.investment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.investment.R
import com.investment.adapter.CustomAdapter
import com.investment.adapter.SavingCustomAdapter
import com.investment.cryptoItemModel
import com.investment.databinding.FragmentCryptoBinding
import com.investment.databinding.FragmentHomeBinding
import com.investment.databinding.FragmentSavingsBinding
import com.investment.savingItemModel


class Savings : Fragment() {
    private lateinit var binding: FragmentSavingsBinding
    private lateinit var recyclerView: RecyclerView

    private var icon_arr = intArrayOf(
        R.drawable.target_icon,
        R.drawable.piggy_icon,
        R.drawable.safe_lock_icon,
        R.drawable.flex_icon,
    )

    private val title_arr = arrayOf("Target", "Piggy vest", "Safe lock", "Flex savings")

    private val details_arr = arrayOf(
        "Reach your unique individual saving goals. 9% p.a",
        "Strict savings automatically",
        "Lock funds to avoid temptation",
        "Flexible savings for emergencies, free transfer and withdrawal",
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentSavingsBinding.inflate(inflater, container, false);

//        // getting the recyclerview by its id
        recyclerView = binding.savingsRecyclerView
//
//
//        // ArrayList of class ItemsViewModel
        val data = ArrayList<savingItemModel>()
//
//        // This loop will create 20 Views containing
//        // the image with the count of view
        for (i in 0..3) {
            data.add(savingItemModel(icon_arr[i], title_arr[i], details_arr[i]))
        }
//
//        // This will pass the ArrayList to our Adapter
        val adapter = SavingCustomAdapter(data)
//
//        // Setting the Adapter with the recyclerview
        recyclerView.adapter = adapter
//
//        // this creates a vertical layout Manager
        recyclerView.layoutManager = LinearLayoutManager(context)





        return binding.root
    }
}
