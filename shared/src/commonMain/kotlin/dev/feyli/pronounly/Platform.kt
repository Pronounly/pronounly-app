package dev.feyli.pronounly

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform