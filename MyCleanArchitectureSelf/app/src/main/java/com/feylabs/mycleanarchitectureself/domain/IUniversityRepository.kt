package com.feylabs.mycleanarchitectureself.domain

interface IUniversityRepository {

    fun setUniversityName(name:String) : UniversityEntity
}