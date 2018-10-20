package com.troy.server.dto

data class TersiveDTO(
        val flags: Int,
        val phrase: String,
        val script: String,
        val key: String,
        val frequency: Int
)
