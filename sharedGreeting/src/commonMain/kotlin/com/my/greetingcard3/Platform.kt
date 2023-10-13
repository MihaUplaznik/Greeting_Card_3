package com.my.greetingcard3

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform