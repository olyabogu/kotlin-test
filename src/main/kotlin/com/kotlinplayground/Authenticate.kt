package com.kotlinplayground

object Authenticate {
    @JvmStatic
    fun authenticate(userName: String, password: String) {
        println("user authenticate for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate("Olga", "abc")
}