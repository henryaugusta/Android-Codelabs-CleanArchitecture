package com.feylabs.mycleanarchitectureself.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.feylabs.mycleanarchitectureself.R
import com.feylabs.mycleanarchitectureself.databinding.ActivityMainBinding
import com.feylabs.mycleanarchitectureself.domain.StudentEntity
import com.feylabs.mycleanarchitectureself.util.Injection

class MainActivity : AppCompatActivity() {

    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val factory = MyViewModelFactory(
            Injection.provideStudentUseCase(),
            Injection.provideUniversityUseCase()
        )

        viewModel = ViewModelProvider(this, factory)[MainViewModel::class.java]

        viewModel.getStudentData(
            StudentEntity(name = "Henry", prodi = "Sistem Informasi", "1202184264", "Bekasi")
        )

        viewModel.getUniversityName("Universitas Tokyo")

        viewModel.univ.observe(this, Observer {
            binding.textUniv.text = "${it.name}"
        })

        viewModel.student.observe(this, Observer {
            binding.text.text = it.name + " " + it.address + " " + it.id
        })

    }
}