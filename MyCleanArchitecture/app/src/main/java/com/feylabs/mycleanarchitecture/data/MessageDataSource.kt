package com.feylabs.mycleanarchitecture.data

import com.feylabs.mycleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity =
        MessageEntity("Hello nama saya $name")

}