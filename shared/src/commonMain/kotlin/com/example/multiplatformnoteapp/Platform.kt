package com.example.multiplatformnoteapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform