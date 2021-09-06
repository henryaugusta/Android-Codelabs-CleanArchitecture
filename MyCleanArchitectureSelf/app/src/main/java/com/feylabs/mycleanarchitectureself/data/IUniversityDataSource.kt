package com.feylabs.mycleanarchitectureself.data

import com.feylabs.mycleanarchitectureself.domain.UniversityEntity

interface IUniversityDataSource {
    fun setUniversityName(name:String) : UniversityEntity
}