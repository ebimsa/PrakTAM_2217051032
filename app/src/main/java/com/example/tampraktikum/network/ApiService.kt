package com.example.tampraktikum.network

import com.example.tampraktikum.model.Food
import retrofit2.http.GET

interface ApiService {
    @GET("menu_makanan.json") // Sesuai endpoint dari URL Gist
    suspend fun getFoods(): List<Food>
}