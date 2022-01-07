package com.investment

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.investment.databinding.SplashBinding
import java.util.*

class Splash : AppCompatActivity() {

    private lateinit var binding: SplashBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        binding = SplashBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        intent = Intent(this, FirstPage::class.java)

        val timer = object : CountDownTimer(3000, 1000) {
            override fun onTick(p0: Long) {
                //do nothing)
            }

            override fun onFinish() {
                startActivity(intent)
                finish()
            }

        }

        timer.start()

    }
}