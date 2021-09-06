package com.feylabs.mycleanarchitectureself.domain

import com.feylabs.mycleanarchitectureself.data.UniversityRepository

class UniversityInteractor(private val repository: UniversityRepository) : UniversityUseCase {
    override fun getUniversityName(name: String): UniversityEntity {
        return repository.setUniversityName(name)
    }


}