package com.investment

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.investment.fragments.Crypto
import com.investment.fragments.Home
import com.investment.fragments.Invest
import com.investment.fragments.Savings




class FragmentHolder : AppCompatActivity() {

    // lateinit var binding : FragmentHolderBinding
    lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        //  binding = FragmentHolderBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_holder)

        bottomNavigationView = this.findViewById(R.id.bottom_nav_view)

        val home = Home()
        val invest = Invest()
        val savings = Savings()
        val crypto = Crypto()

        setCurrentFragment(home)
        bottomNavigationView.selectedItemId = R.id.home


        bottomNavigationView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.home -> {
                    setCurrentFragment(home)
                }
                R.id.invest -> {
                    setCurrentFragment(invest)
                }
                R.id.savings -> {
                    setCurrentFragment(savings)
                }

                R.id.crypto -> setCurrentFragment(crypto)
            }
            true
        }

    }

    private fun setCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply{replace(R.id.nav_fragment, fragment)
            commit()
        }
}