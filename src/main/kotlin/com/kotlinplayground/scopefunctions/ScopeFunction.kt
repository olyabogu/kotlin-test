package com.kotlinplayground.scopefunctions

import com.kotlinplayground.Course
import com.kotlinplayground.CourseCategory

fun main() {
//    exploreApply()
//    exploreAlso()
    exploreRun()
}

fun exploreRun() {
    var numbers: MutableList<Int>? = null
    val sum = numbers.run {
        numbers = mutableListOf(1, 2, 3)
        (numbers?.sum())
    }
    println(sum)
    val lenght = run {
        val name = "Olga"
        println(name)
        name.length
    }
    println(lenght)
}

fun exploreWith() {
    val numbers = mutableListOf<Int>(1, 2, 3, 4, 5)
    val result = with(numbers) {
        println(this.size)
        plus(5)
        sum()
    }
    println(result)
}

fun exploreLet() {
    val numbers = mutableListOf<Int>(1, 2, 3, 4, 5)
    numbers.map { it * 2 }.filter { it > 5 }.let {
        println(it)
        println(it.sum())
    }
}

fun exploreApply() {
    val course = Course(1, "marketing", "Olga").apply {
        this.category = CourseCategory.DESIGN
        println(this)
    }
    var name: String? = null
    name?.let {
        println(it)
        println(it.uppercase())
    }

}

fun exploreAlso() {
    val course = Course(1, "marketing", "Olga").also {
        it.category = CourseCategory.DESIGN
        println(it)
    }

}
