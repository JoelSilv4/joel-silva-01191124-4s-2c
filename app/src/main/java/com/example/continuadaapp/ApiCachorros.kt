package com.example.continuadaapp

import retrofit2.Call
import retrofit2.http.*

interface ApiCachorros {
    @GET("cachorros")
    fun get(): Call<List<Cachorro>>

    @GET("cachorros/{id}")
    fun get(@Path("id") id:Int): Call<Cachorro>
}