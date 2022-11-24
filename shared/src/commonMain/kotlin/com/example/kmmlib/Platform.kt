package com.example.kmmlib

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform