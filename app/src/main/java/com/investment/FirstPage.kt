package com.investment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.investment.databinding.FirstPageBinding

class FirstPage : AppCompatActivity() {

    lateinit var binding: FirstPageBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = FirstPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //intents
        intent = Intent(this, SignIN::class.java)
        val intent2 = Intent(this, SignUP::class.java)

        binding.signinBTN.setOnClickListener {
            startActivity(intent)
        }


        binding.signupBTN.setOnClickListener {
            startActivity(intent2)
        }


    }
}