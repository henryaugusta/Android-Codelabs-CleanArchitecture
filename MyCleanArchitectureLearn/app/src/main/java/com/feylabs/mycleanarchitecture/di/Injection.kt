package com.feylabs.mycleanarchitecture.di

import com.feylabs.mycleanarchitecture.data.IMessageDataSource
import com.feylabs.mycleanarchitecture.data.MessageDataSource
import com.feylabs.mycleanarchitecture.data.MessageRepository
import com.feylabs.mycleanarchitecture.domain.MessageInteractor
import com.feylabs.mycleanarchitecture.domain.MessageUseCase

object Injection {


    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    fun provideRepository(): MessageRepository {
        val messageDataSource = MessageDataSource()
        return MessageRepository(messageDataSource)
    }

    fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }


}