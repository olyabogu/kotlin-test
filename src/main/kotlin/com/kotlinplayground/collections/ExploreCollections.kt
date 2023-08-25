package com.kotlinplayground.collections

fun main() {
    val names = listOf("alex", "ben", "chloe")
    println("names $names")
    val namesMutable = mutableListOf("alex", "ben", "chloe")
    println(namesMutable)
    namesMutable.add("adam")
    println(namesMutable)
    val namesSet = setOf("alex", "ben", "chloe")
    println(namesSet)
    val namesMutableSet = mutableSetOf("alex", "ben", "chloe")
    println(namesMutableSet)
    namesMutableSet.add("adam")
    println(namesMutableSet)
    val nameToAge = mapOf("Olga" to 36, "Denis" to 35)
    println(nameToAge)
    val nameToAgeMutable = mutableMapOf("Olga" to 36, "Denis" to 35)

    nameToAgeMutable.put("Ian" ,  33)
    println(nameToAgeMutable)



}