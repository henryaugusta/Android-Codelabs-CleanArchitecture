package com.dicoding.tourismapp.core.domain

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource

interface TourismUseCase {

    fun getAllTourism(): LiveData<Resource<List<Tourism>>>
    fun getFavouriteTourism(): LiveData<List<Tourism>>
    fun setFavoriteTourism(tourism: Tourism, state: Boolean)

}