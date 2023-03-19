package com.example.multiplatformnoteapp

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Bornak is running this module in, ${platform.name}!"
    }
}