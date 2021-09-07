package com.dicoding.tourismapp.core.data.source.remote.network

import com.dicoding.tourismapp.core.data.source.remote.response.ListTourismResponse
import com.dicoding.tourismapp.core.data.source.remote.response.TourismResponse
import retrofit2.Call
import retrofit2.http.GET

interface ApiInterface {

    @GET("LIST")
    fun getList(): Call<ListTourismResponse?>

}