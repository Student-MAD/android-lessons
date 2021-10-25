package com.example.messenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.messenger.databinding.ActivityCreateMessageBinding

class CreateMessageActivity : AppCompatActivity() {

    lateinit var binding: ActivityCreateMessageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateMessageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonSendMessage.setOnClickListener {
            val text = binding.editTextMessage.text.toString()
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_TEXT, text)
            startActivity(intent)
        }
    }
}