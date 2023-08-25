package com.kotlinplayground

class Person(val name: String = "", val age: Int = 0) {
    var email: String = ""
    var nameLength: Int = 0

    constructor(_name: String, _age: Int, _email: String) : this(_name, _age) {
        email = _email
    }
    init {
        println("Inside init block")
        nameLength = name.length
    }

}

fun main() {
//    val person = Person("Alex", 25)
//    println("Name: ${person.name} and the age is ${person.age}")
//    val person1 = Person()
//    println("Name: ${person1.name} and the age is ${person1.age}")

    val person2 = Person("Alex", 25, "abc@gmail.com")
    println("Name: ${person2.name} and the age is ${person2.age} and the email is ${person2.email} and name lenght ${person2.nameLength}")

}