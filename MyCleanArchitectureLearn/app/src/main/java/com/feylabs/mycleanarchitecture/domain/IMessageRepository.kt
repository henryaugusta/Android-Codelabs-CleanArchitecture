package com.feylabs.mycleanarchitecture.domain

interface IMessageRepository {

    fun getWelcomeMessage(name: String): MessageEntity

}