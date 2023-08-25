package com.kotlinplayground.exceptions

import java.lang.Exception
import java.lang.RuntimeException

fun main() {
    println(nameLength(null))
    returnNothing()
}

fun returnNothing(): Nothing {
    throw RuntimeException("RuntimeException")
}

fun nameLength(name: String?): Int? {
    return try {
        name!!.length
    } catch (ex: Exception) {
        println(ex)
        null
    }

}
