package com.feylabs.mycleanarchitectureself.data

import com.feylabs.mycleanarchitectureself.domain.StudentEntity

interface IStudentDataSource {
    fun getStudentFromResource(): StudentEntity
}