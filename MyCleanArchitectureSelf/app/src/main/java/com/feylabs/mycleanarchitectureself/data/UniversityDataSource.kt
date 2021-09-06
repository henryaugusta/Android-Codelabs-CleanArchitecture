package com.feylabs.mycleanarchitectureself.data

import com.feylabs.mycleanarchitectureself.domain.UniversityEntity

class UniversityDataSource : IUniversityDataSource {
    override fun setUniversityName(name: String): UniversityEntity {
        return UniversityEntity(name)
    }
}