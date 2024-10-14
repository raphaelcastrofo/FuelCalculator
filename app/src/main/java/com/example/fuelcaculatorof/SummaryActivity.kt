package com.example.fuelcaculatorof

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.ViewOutlineProvider
import androidx.appcompat.app.AppCompatActivity
import com.example.fuelcaculatorof.databinding.ActivitySummaryBinding


class SummaryActivity: AppCompatActivity() {

    private lateinit var binding: ActivitySummaryBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySummaryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val total = intent.getFloatExtra("total", 0.0f)
        val price = intent.getFloatExtra("price", 0.0f)
        val consumption = intent.getFloatExtra("consumption", 0.0f)
        val distance = intent.getFloatExtra("distance", 0.0f)


        binding.tvPrice.text = price.toString()
        binding.tvConsumption.text = consumption.toString()
        binding.tvDistance.text = distance.toString()
        binding.tvTotal.text = "$" + total.toString()

        binding.btnRemake.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            binding.tvPrice.setText("")
            binding.tvConsumption.setText("")
            binding.tvDistance.setText("")
            binding.tvTotal.setText("")

            startActivity(intent)

        }

    }

}