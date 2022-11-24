package com.example.kmmlib

class Greeting {
    private val platform: Platform = getPlatform()

    fun greeting(): String {
        return "Hello, ${platform.name} from myself!"
    }
}