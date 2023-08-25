package com.kotlinplayground

data class Course(
    val id: Int,
    val name: String,
    val author: String,
    var category: CourseCategory = CourseCategory.DEVELOPMENT
)

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

fun main() {
    val course = Course(1, " Reactive programming", "dilip")
    val course1 = Course(1, " Reactive programming", "dilip")
    println(course)
    val course3 = course1.copy(id = 3, author = "new")
    println(course1)

    val marketingCourse = Course(2, "marketing", "Olga", CourseCategory.MARKETING)
    println(marketingCourse)
}