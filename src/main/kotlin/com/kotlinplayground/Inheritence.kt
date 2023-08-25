package com.kotlinplayground

import com.kotlinplayground.Student.Companion.noOfEnrolledCourses

open class User(val name: String) {
    open val isLoggedIn: Boolean = true
    open fun login() {
        println("Inside user login")
    }

    private fun secret() {
        println("inside user login")
    }

    protected open fun logout() {
        println("inside user logout")
    }
}

class Student(name: String) : User(name) {
    override var isLoggedIn: Boolean = true

    companion object {
        const val noOfEnrolledCourses = 10
        fun country() = "usa"
    }

    override fun login() {
        super.login()
        println("inside student login")
    }
    public override fun logout(){
        println("inside student logout")
    }
}

class Instructor(name: String) : User(name)

fun main() {
    val student = Student("Alex")
    println("name is ${student.name}")
    student.login()
    student.isLoggedIn = true
    val country = Student.country()
    println(country)
    println("noOfEnrolledCourses $noOfEnrolledCourses")
    println("${student.isLoggedIn}")
    val instructor = Instructor("Alex")
    println("name is ${instructor.name}")
    student.login()
    val user = User("Olga")
    student.logout()
}