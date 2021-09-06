package com.feylabs.mycleanarchitectureself.domain

interface IStudentRepository {
    fun getStudentData(): StudentEntity
}