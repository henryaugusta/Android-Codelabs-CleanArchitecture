package com.feylabs.mycleanarchitectureself.util

import com.feylabs.mycleanarchitectureself.data.StudentDataSource
import com.feylabs.mycleanarchitectureself.data.StudentRepository
import com.feylabs.mycleanarchitectureself.data.UniversityDataSource
import com.feylabs.mycleanarchitectureself.data.UniversityRepository
import com.feylabs.mycleanarchitectureself.domain.StudentInteractor
import com.feylabs.mycleanarchitectureself.domain.StudentUseCase
import com.feylabs.mycleanarchitectureself.domain.UniversityInteractor
import com.feylabs.mycleanarchitectureself.domain.UniversityUseCase

object Injection {

    fun provideStudentUseCase(): StudentUseCase {
        val repository = provideStudentRepository()
        val useCase = StudentInteractor(repository)
        return useCase
    }

    fun provideUniversityUseCase(): UniversityUseCase {
        val repository = provideUniversityRepository()
        val useCase = UniversityInteractor(repository)
        return useCase
    }

    fun provideStudentRepository(): StudentRepository {
        val studentDataSource = StudentDataSource()
        return StudentRepository(studentDataSource)
    }

    fun provideUniversityRepository(): UniversityRepository {
        val dataSource = UniversityDataSource()
        return UniversityRepository(dataSource)
    }
}