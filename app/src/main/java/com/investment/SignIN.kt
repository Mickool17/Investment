package com.investment

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.investment.databinding.SigninPageBinding

class SignIN : AppCompatActivity() {

    lateinit var binding: SigninPageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = SigninPageBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.signinBTN.setOnClickListener {
            startActivity(Intent(this, FragmentHolder::class.java))
            finish()
        }
    }
}