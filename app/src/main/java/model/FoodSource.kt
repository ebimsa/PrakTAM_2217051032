package com.example.tampraktikum.model
import com.Food.model.Food
import com.example.tampraktikum.R

object FoodSource {
    val dummyFood = listOf(
        Food("Rendang", "Rendang khas Padang", 15000,R.drawable.rendang),
        Food(name = "Nasi Goreng", description = "Nasi goreng khas Cikunyit", harga = 20000, imageRes = R.drawable.nasgor),
        Food(name = "Sate", description = "Sate enak 10 pcs", harga = 12000, imageRes = R.drawable.sate),
        )
}