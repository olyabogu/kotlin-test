package com.kotlinplayground.collections

import com.kotlinplayground.dataset.Course
import com.kotlinplayground.dataset.CourseCategory
import com.kotlinplayground.dataset.KAFKA
import com.kotlinplayground.dataset.courseList

fun main() {
    val courseList = courseList()
    val predicate = { course: Course -> course.category == CourseCategory.DEVELOPEMENT }
    val list = listOf(listOf(1, 2, 3), listOf(1, 2, 3))
    val mapResult = list.map { outerList -> outerList.map { it.toDouble() } }
    val flatMapResult = list.flatMap { outerList -> outerList.map { it.toDouble() } }

//    println(mapResult)
//    println(flatMapResult)

//    exploreFiler(courseList, predicate)
//    exploreMap(courseList, predicate)
    val courses = exploreFlatMap(courseList, KAFKA)
//    println(courses)
//    exploreHashMap(courses)

    collectionNullability()
}

fun collectionNullability() {
    var list: MutableList<String>? = null
    list = mutableListOf()
    list?.add("dilip")
    list?.forEach {
        println(it)
    }
    val list1 = listOf<String?>("adam", null, "alex")
    list1.forEach {
        print(it?.length)
    }
}

fun exploreHashMap(courses: List<String>) {
    val nameToAge = mutableMapOf("Olga" to 36, "Denis" to 35)
    nameToAge.forEach { t, u -> println("key $t and value $u") }
    println(nameToAge.getOrElse("gdb") { "abc" })
    println(nameToAge.containsKey("Denis"))
    val map = nameToAge.filterKeys { it.length > 3 }.map { it.key.uppercase() }
    println(map)
    val map2 = nameToAge.maxByOrNull { it.value }
    println(map2)

}

fun exploreFlatMap(courseList: MutableList<Course>, name: String): List<String> {
    val courses = courseList.flatMap { course ->
        val courseName = course.name
        course.topicsCovered.filter { it == name }.map { courseName }
    }
    return courses
}

fun exploreMap(courseList: MutableList<Course>, predicate: (course: Course) -> Boolean) {
    val map = courseList.filter(predicate).map { "${it.name}  ${it.category}" }.forEach { println(it) }
//    println(map)
}

fun exploreFiler(courseList: MutableList<Course>, predicate: (course: Course) -> Boolean) {
    courseList.filter { predicate.invoke(it) }.forEach { println(it) }
}
