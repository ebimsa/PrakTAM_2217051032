package com.Food.model
import androidx.annotation.DrawableRes

data class Food(
    val name: String,
    val description: String,
    val harga: Int,
    @DrawableRes val imageRes: Int
)