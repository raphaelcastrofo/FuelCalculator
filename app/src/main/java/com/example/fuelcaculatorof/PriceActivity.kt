package com.example.fuelcaculatorof

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.fuelcaculatorof.databinding.ActivityPriceBinding
import com.google.android.material.snackbar.Snackbar

class PriceActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPriceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPriceBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener {
            val priceTemp = binding.tiePrice.text

            if (priceTemp?.isEmpty() == true) {
                Snackbar.make(binding.tilPrice, "Please inform the price!", Snackbar.LENGTH_LONG)
                    .show()
            } else {

                val price: Float = priceTemp.toString().toFloat()

                val intent = Intent(this, ConsumptionActivity::class.java)
                intent.putExtra("price", price)
                startActivity(intent)
            }

        }

    }
}