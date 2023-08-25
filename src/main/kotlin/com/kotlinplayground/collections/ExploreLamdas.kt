package com.kotlinplayground.collections

fun calculate(x: Int, y: Int, op: (x: Int, y: Int) -> Int): Int {
    return op(x, y)
}

fun main() {
    val addLambda = { x: Int -> x + x }
    val result = addLambda(3)
    println(result)
    val multiplyLambda = { x: Int, y: Int ->
        println("x=$x, y=$y")
        x * y
    }
    val result2 = multiplyLambda(2, 3)
    println(result2)

    val result3 = calculate(x = 2, y = 3) { a, b -> a * b }
    println(result3)

    val result4 = calculate(x = 2, y = 3) { a, b -> a + b }
    println(result4)
}