package dev.sanskar.flowdemo

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

// Network Code
const val BASE_URL = "http://localhost:8000"

val retrofit: Retrofit =
    Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(
            MoshiConverterFactory.create(
            Moshi.Builder().addLast(KotlinJsonAdapterFactory()).build()
        ))
        .build()

interface Api {
    @GET("latest")
    suspend fun getRecords(): ApiResponse
}

object ApiService {
    val retrofitService: Api by lazy {
        retrofit.create(Api::class.java)
    }
}