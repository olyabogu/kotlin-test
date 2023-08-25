package com.kotlinplayground.cast

import com.kotlinplayground.Course

fun main() {
    val course = Course(1, " Reactive programming", "dilip")
    checkType(course)
    checkType("course")
    castNumber(1)
}


fun castNumber(any: Any) {
    when (any) {
        any as? Double -> println("value is double")
        any as? Int -> println("value is int")
    }

}

fun checkType(variable: Any) {
    when (variable) {
        is Course -> {
//            val course
            println(variable)
        }

        is String -> {
            println(variable.lowercase())
        }
    }
}
