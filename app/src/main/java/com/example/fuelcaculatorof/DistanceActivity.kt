package com.example.fuelcaculatorof

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fuelcaculatorof.databinding.ActivityDistanceBinding
import com.google.android.material.snackbar.Snackbar


class DistanceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDistanceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDistanceBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val price = intent.getFloatExtra("price", 0.0f)
        val consumption = intent.getFloatExtra("consumption", 0.0f)

        binding.btnCalculate.setOnClickListener() {
            val distanceTemp = binding.tieDistance.text

            if (distanceTemp.isNullOrEmpty()) {
                Snackbar.make(binding.tilDistance, "Please enter distance!", Snackbar.LENGTH_LONG)
                    .show()
            } else {
                val distance = distanceTemp.toString().toFloat()

                val totalLiter = distance / consumption
                val total = totalLiter * price

                val intent = Intent(this, SummaryActivity::class.java)
                intent.putExtra("price", price)
                intent.putExtra("consumption", consumption)
                intent.putExtra("distance", distance)
                intent.putExtra("total", total)
                startActivity(intent)

            }
        }
    }
}