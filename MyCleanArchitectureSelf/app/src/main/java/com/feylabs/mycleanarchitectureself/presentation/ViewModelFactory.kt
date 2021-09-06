package com.feylabs.mycleanarchitectureself.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.feylabs.mycleanarchitectureself.domain.StudentUseCase
import com.feylabs.mycleanarchitectureself.domain.UniversityUseCase
import com.feylabs.mycleanarchitectureself.util.Injection

class MyViewModelFactory(
    private var studentUseCase: StudentUseCase,
    private var universityUseCase: UniversityUseCase,
) : ViewModelProvider.NewInstanceFactory() {


    companion object {
        @Volatile
        private var instance: MyViewModelFactory? = null

        fun getInstance(): MyViewModelFactory =
            instance ?: synchronized(this) {
                instance ?: MyViewModelFactory(
                    Injection.provideStudentUseCase(),
                    Injection.provideUniversityUseCase()
                )
            }
    }

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MainViewModel::class.java)
            -> MainViewModel(studentUseCase,universityUseCase) as T


            else ->
                throw IllegalArgumentException("Unknown ViewModel class: " + modelClass.name)
        }
    }


}