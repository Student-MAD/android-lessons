package com.kgoncharov.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kgoncharov.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val users = listOf(
            User(
                id = 1,
                firstName = "Name1",
                lastName = "Surname1"
            ),
            User(
                id = 2,
                firstName = "Name2",
                lastName = "Surname2"
            ),
            User(
                id = 3,
                firstName = "Name3",
                lastName = "Surname3"
            ),
            User(
                id = 4,
                firstName = "Name4",
                lastName = "Surname4"
            ),
            User(
                id = 5,
                firstName = "Name5",
                lastName = "Surname5"
            ),
            User(
                id = 1,
                firstName = "Name1",
                lastName = "Surname1"
            )
        )
        val adapter = UsersAdapter()
        binding.recyclerView.adapter = adapter
        adapter.submitList(users)

        binding.button.setOnClickListener {
            adapter.addItem(
                User(
                    id = 5,
                    firstName = "Name5",
                    lastName = "Surname5"
                )
            )
        }
    }
}