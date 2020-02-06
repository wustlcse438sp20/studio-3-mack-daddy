package com.example.cse438.studio3.data

data class Question(
    val city: String,
    val name: String,
    val question:String
)

data class Payload(val response_code: Int, val results: List<Question>)