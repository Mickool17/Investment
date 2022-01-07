package com.investment.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.investment.databinding.FragmentHomeBinding
import com.investment.databinding.FragmentInvestBinding

class Invest : Fragment() {
    private lateinit var binding: FragmentInvestBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentInvestBinding.inflate(inflater, container, false);
        return binding.root
    }
}
