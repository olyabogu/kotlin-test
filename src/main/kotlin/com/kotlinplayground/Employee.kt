package com.kotlinplayground

data class Employee(val id:Int, val name: String)

fun main(){
    val employee1 = Employee(1, "Olga")
    val employee2 = Employee(1, "Olga")
    val employee3 = employee1.copy(3, "Denis")
    println(employee3)
    println(employee1 == employee2)
}

