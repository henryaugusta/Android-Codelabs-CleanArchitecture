package com.feylabs.mycleanarchitectureself.domain

interface UniversityUseCase  {
    fun getUniversityName(name:String) : UniversityEntity
}