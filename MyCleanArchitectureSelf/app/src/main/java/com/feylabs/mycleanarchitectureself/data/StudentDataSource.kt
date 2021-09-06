package com.feylabs.mycleanarchitectureself.data

import com.feylabs.mycleanarchitectureself.domain.StudentEntity

class StudentDataSource : IStudentDataSource{

    override fun getStudentFromResource(): StudentEntity {
        return StudentEntity(
            name = "Muhammad Firriezky",
            id = "1202184264",
            address = "Bekasi",
            prodi = "Sistem Informasi"
        )
    }
}