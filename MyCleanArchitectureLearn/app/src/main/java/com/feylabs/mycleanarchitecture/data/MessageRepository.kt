package com.feylabs.mycleanarchitecture.data

import com.feylabs.mycleanarchitecture.domain.IMessageRepository
import com.feylabs.mycleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: MessageDataSource) : IMessageRepository {

    override fun getWelcomeMessage(name: String): MessageEntity
    = messageDataSource.getMessageFromSource(name)

}