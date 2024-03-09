package com.example.kotlinstudy

import org.springframework.data.repository.CrudRepository

interface MessageRepository : CrudRepository<Message, String> {
    fun findByTextContains(text: String): List<Message>
}
