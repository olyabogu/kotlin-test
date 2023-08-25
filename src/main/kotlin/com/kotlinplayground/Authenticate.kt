package com.kotlinplayground

object Authenticate {
    fun authenticate(userName: String, password: String) {
        println("user authenticate for userName: $userName")
    }
}

fun main() {
    Authenticate.authenticate("Olga", "abc")
}