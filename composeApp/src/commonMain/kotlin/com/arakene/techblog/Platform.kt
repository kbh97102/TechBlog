package com.arakene.techblog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform