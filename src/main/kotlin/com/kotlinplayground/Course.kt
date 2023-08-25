//@file:JvmName("CourseUtils")

package com.kotlinplayground

import CourseJava

data class Course @JvmOverloads
constructor(
    val id: Int,
    val name: String,
    val author: String,
    var category: CourseCategory = CourseCategory.DEVELOPMENT
) {
    @JvmField
    var noOfCourses = 10

    companion object {
        @JvmStatic
        fun printNameFromCourse(name: String = "default") {
            println("name: $name")
        }
    }
}

enum class CourseCategory {
    DEVELOPMENT,
    BUSINESS,
    DESIGN,
    MARKETING
}

@JvmName("printNameFrom")
@JvmOverloads
fun printName(name: String = "default") {
    println("name: $name")
}

fun main() {
    val course = Course(1, " Reactive programming", "dilip")
    val course1 = Course(1, " Reactive programming", "dilip")
    println(course)
    val course3 = course1.copy(id = 3, author = "new")
    println(course3)

    val marketingCourse = Course(2, "marketing", "Olga", CourseCategory.MARKETING)
    println(marketingCourse)
    val courseJava = CourseJava(1, " Reactive programming", "dilip")
    println(courseJava)
    courseJava.id = 3
    courseJava.name = "abc"
    println(courseJava)


}