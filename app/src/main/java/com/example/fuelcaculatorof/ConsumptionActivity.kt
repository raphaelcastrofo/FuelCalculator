package com.example.fuelcaculatorof

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fuelcaculatorof.databinding.ActivityConsumptionBinding


class ConsumptionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConsumptionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityConsumptionBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    val consumption = binding.tieConsumption.toString().toFloat()
    val price = intent.getFloatExtra("price", 0.0f)




}