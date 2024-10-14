package com.example.fuelcaculatorof

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fuelcaculatorof.databinding.ActivitySummaryBinding


class SummaryActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySummaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySummaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val price = intent.getFloatExtra("price", 0.0f)
        val consumption = intent.getFloatExtra("consumption", 0.0f)
        val distance = intent.getFloatExtra("distance", 0.0f)
        val total = intent.getFloatExtra("price", 0.0f)

    }

}