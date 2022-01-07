package com.investment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.investment.databinding.SignupPageBinding

class SignUP : AppCompatActivity() {

    lateinit var binding: SignupPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = SignupPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.signupBTN.setOnClickListener {
            startActivity(Intent(this, FragmentHolder::class.java))
            finish()
        }
    }
}