package com.example.stopwatch

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.stopwatch.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    private var seconds = 0
    private var isRunning = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        isRunning = savedInstanceState?.getBoolean("running") ?: false
        seconds = savedInstanceState?.getInt("seconds") ?: 0

        binding.buttonStart.setOnClickListener {
            isRunning = true
        }
        binding.buttonStop.setOnClickListener {
            isRunning = false
        }
        binding.buttonReset.setOnClickListener {
            isRunning = false
            seconds = 0
        }
        runTimer()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("running", isRunning)
        outState.putInt("seconds", seconds)
    }

    fun runTimer() {
        val handler = Handler(Looper.getMainLooper())
        handler.post(
            object : Runnable {
                override fun run() {
                    val hours = seconds / 3600
                    val minutes = seconds % 3600 / 60
                    val secs = seconds % 60
                    binding.textViewTime.text = getString(R.string.timer_string, hours, minutes, secs)
                    if (isRunning) {
                        seconds++
                    }
                    handler.postDelayed(this, 1000)
                }
            }
        )
    }
}