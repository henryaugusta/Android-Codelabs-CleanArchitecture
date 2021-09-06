package com.feylabs.mycleanarchitectureself.data

import com.feylabs.mycleanarchitectureself.domain.IStudentRepository
import com.feylabs.mycleanarchitectureself.domain.IUniversityRepository
import com.feylabs.mycleanarchitectureself.domain.StudentEntity
import com.feylabs.mycleanarchitectureself.domain.UniversityEntity

class UniversityRepository(private val dataSource: UniversityDataSource) : IUniversityRepository {


    override fun setUniversityName(name: String): UniversityEntity {
        return dataSource.setUniversityName(name)
    }

}