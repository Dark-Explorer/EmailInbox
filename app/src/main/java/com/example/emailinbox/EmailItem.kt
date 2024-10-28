package com.example.emailinbox

data class EmailItem(
    val sender: String,
    val subject: String,
    val preview: String,
    val time: String,
    val color: Int
)