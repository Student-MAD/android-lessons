package com.example.juiceadvicer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.juiceadvicer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val juiceAdvicer = JuiceAdvicer()
        binding.juiceSelectButton.setOnClickListener {
            val element = binding.juiceSelectSpinner.selectedItem.toString()
            val tastes = juiceAdvicer.getJuices(element)
            binding.juiceTextView.text = tastes.joinToString("\n")
        }
        Toast.makeText(this, getString(R.string.app_name), Toast.LENGTH_SHORT).show()
    }
}