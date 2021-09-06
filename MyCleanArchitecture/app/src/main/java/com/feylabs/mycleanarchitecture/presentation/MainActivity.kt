package com.feylabs.mycleanarchitecture.presentation

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.feylabs.mycleanarchitecture.R
import com.feylabs.mycleanarchitecture.databinding.ActivityMainBinding
import com.feylabs.mycleanarchitecture.di.Injection

class MainActivity : AppCompatActivity() {

    val binding by lazy {ActivityMainBinding.inflate(layoutInflater)}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val factory = MainViewModelFactory.getInstance()
        val viewModel = ViewModelProvider(this,factory)[MainViewModel::class.java]

        viewModel.setName("Henry Augusta")
        viewModel.message.observe(this, Observer {
            binding.tvWelcome.text = it.welcomeMessage
        })

    }
}