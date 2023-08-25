package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.courseList

fun main() {
    val namesList =
        listOf("alex", "ben", "chloe").asSequence().filter { it.length >= 4 }.map { it.uppercase() }.toList()
    println(namesList)
    val predicate = { course: Course -> course.category == CourseCategory.DEVELOPEMENT }

    exploreFilerUsingSequence(courseList(), predicate)
    val range = 1..1000_000_000
    range.asSequence().map { it.toDouble() }.take(40).forEach{ println(it) }
}
fun exploreFilerUsingSequence(courseList: MutableList<Course>, predicate: (course: Course) -> Boolean) {
    courseList.asSequence().filter { predicate.invoke(it) }.forEach { println(it) }
}