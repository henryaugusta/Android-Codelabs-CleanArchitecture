package com.feylabs.mycleanarchitectureself.data

import com.feylabs.mycleanarchitectureself.domain.IStudentRepository
import com.feylabs.mycleanarchitectureself.domain.StudentEntity

class StudentRepository(private val studentDataSource: StudentDataSource) : IStudentRepository {

    override fun getStudentData(): StudentEntity {
        return studentDataSource.getStudentFromResource()
    }

}