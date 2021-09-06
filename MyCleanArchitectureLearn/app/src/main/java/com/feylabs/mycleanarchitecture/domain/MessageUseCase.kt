package com.feylabs.mycleanarchitecture.domain

interface MessageUseCase {
    fun getMessage(name:String):MessageEntity
}