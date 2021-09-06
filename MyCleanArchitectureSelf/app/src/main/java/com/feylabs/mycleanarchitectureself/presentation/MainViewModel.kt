package com.feylabs.mycleanarchitectureself.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.feylabs.mycleanarchitectureself.data.UniversityRepository
import com.feylabs.mycleanarchitectureself.domain.StudentEntity
import com.feylabs.mycleanarchitectureself.domain.StudentUseCase
import com.feylabs.mycleanarchitectureself.domain.UniversityEntity
import com.feylabs.mycleanarchitectureself.domain.UniversityUseCase

class MainViewModel(
    private val studentUseCase: StudentUseCase,
    private val universityUseCase: UniversityUseCase,
//    private val universityRepository: UniversityRepository
    ) : ViewModel() {

    var _student = MutableLiveData<StudentEntity>()
    val student: LiveData<StudentEntity> get() = _student

    var _univ = MutableLiveData<UniversityEntity>()
    val univ: LiveData<UniversityEntity> get() = _univ

    fun getStudentData(entity: StudentEntity) {
        val data = studentUseCase.getStudent(entity)
        _student.postValue(data)
    }



    fun getUniversityName(name: String) {
        val data = universityUseCase.getUniversityName(name)
//        val data = universityRepository.setUniversityName(name)
        _univ.postValue(data)
    }

}