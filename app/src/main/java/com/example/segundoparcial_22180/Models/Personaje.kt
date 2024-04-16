package com.example.segundoparcial_22180.Models

import androidx.annotation.DrawableRes

data class Personaje (
    val job: String,
    val gender: String,
    val age: Int,
    @DrawableRes val profilePic: Int,
)