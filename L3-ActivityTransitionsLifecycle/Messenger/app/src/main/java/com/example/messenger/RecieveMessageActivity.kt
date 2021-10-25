package com.example.messenger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messenger.databinding.ActivityRecieveMessageBinding

class RecieveMessageActivity : AppCompatActivity() {

    lateinit var binding: ActivityRecieveMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRecieveMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val receivedText = intent.extras?.getString("Message")
        binding.textViewReceiveMessage.text = receivedText
    }
}