package com.dicoding.tourismapp.core.domain

import androidx.lifecycle.LiveData
import com.dicoding.tourismapp.core.data.Resource

class TourismInteractor(val tourismRepository: ITourismRepository) : TourismUseCase {

    override fun getAllTourism(): LiveData<Resource<List<Tourism>>> {
        return tourismRepository.getAllTourism()
    }


    override fun getFavouriteTourism(): LiveData<List<Tourism>> {
        return tourismRepository.getFavoriteTourism()
    }


    override fun setFavoriteTourism(tourism: Tourism, state: Boolean) =
        tourismRepository.setFavoriteTourism(tourism, state)
}