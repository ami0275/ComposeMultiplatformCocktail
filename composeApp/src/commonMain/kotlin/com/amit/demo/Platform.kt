package com.amit.demo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform