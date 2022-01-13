package com.kgoncharov.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.kgoncharov.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val preferenceManager = PreferenceManager(this)
//        preferenceManager.testValue = "test123"
        val databaseManager = DatabaseManager(this)

        Toast.makeText(this, preferenceManager.testValue, Toast.LENGTH_SHORT).show()

        val adapter = UsersAdapter()
        binding.recyclerView.adapter = adapter
        adapter.submitList(databaseManager.getUsers())

        binding.button.setOnClickListener {
            databaseManager.insertUser(
                User(
                    id = 5,
                    firstName = "Name5",
                    lastName = "Surname5"
                )
            )
            adapter.submitList(databaseManager.getUsers())
        }
    }
}