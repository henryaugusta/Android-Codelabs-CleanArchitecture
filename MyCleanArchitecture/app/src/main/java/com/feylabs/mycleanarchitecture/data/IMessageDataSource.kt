package com.feylabs.mycleanarchitecture.data

import com.feylabs.mycleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name:String) : MessageEntity
}