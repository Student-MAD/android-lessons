package com.kgoncharov.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kgoncharov.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId) {
                R.id.menuFragment1 -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, OneFragment(12))
                        .commit()
                    true
                }
                R.id.menuFragment2 -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, TwoFragment())
                        .commit()
                    true
                }
                R.id.menuFragment3 -> {
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragmentContainer, ThreeFragment())
                        .commit()
                    true
                }
                else -> true
            }
        }
    }
}