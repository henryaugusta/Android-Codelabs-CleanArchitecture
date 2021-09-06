package com.feylabs.mycleanarchitectureself.domain

class StudentInteractor(private val studentRepository: IStudentRepository) : StudentUseCase {
    override fun getStudent(student: StudentEntity): StudentEntity {
        return studentRepository.getStudentData()
    }
}