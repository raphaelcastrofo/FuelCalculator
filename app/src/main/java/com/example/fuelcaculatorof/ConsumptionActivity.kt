package com.example.fuelcaculatorof


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fuelcaculatorof.databinding.ActivityConsumptionBinding
import com.google.android.material.snackbar.Snackbar


class ConsumptionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConsumptionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConsumptionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val price = intent.getFloatExtra("price", 0.0f)



        binding.btnNext.setOnClickListener {
            val consumptionTemp = binding.tieConsumption.text

            if (consumptionTemp.isNullOrEmpty()) {
                Snackbar.make(binding.tilConsumption, "Please enter consumption!", Snackbar.LENGTH_LONG)
                    .show()
            } else {

                val consumption = consumptionTemp.toString().toFloat()
                val intent = Intent(this, DistanceActivity::class.java)
                intent.putExtra("price", price)
                intent.putExtra("consumption", consumption)
                startActivity(intent)
            }
        }

    }

}