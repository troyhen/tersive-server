package com.troy.server.dto

import java.util.*

data class UserDTO(
        val id: UUID = UUID.randomUUID(),
        val email: String,
        val password: String,
        val password2: String,
        val question: String,
        val answer: String
)
