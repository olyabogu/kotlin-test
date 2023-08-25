package com.kotlinplayground.nulls

data class Movie(
    val id: Int?, val name: String
)

fun printName(name: String) {
    println("name is $name")
}

//fun printName(name: String?) {
//    println("name is $name")
//}

fun main() {
    var nameNullable: String? = null
//    printName(nameNullable)
    nameNullable?.run { printName(this) }

    nameNullable = "alex"
    val length1 = nameNullable?.length?.toLong() ?: 0
    println(length1)

    val length = length1 ?: 0

    println("value is $length1")
    nameNullable = "abd"
    println("value is $length")

    var name: String = "Olga"
    val movie = Movie(null, "avengers")
    val savedMovie = saveMovie(movie)
    val id = savedMovie.id!!
    println(id)
    println("saved movie $savedMovie")
}

fun saveMovie(movie: Movie): Movie {
    return movie
//    return movie.copy(id = 1)
}
