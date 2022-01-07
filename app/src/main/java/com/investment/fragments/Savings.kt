package com.investment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.investment.databinding.FragmentHomeBinding
import com.investment.databinding.FragmentSavingsBinding


class Savings : Fragment() {
    private lateinit var binding: FragmentSavingsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        binding = FragmentSavingsBinding.inflate(inflater,container,false);
        return binding.root
    }
}
