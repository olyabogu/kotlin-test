package week5

fun fibonacci(): Sequence<Int> = sequence {
    val list = listOf<Int>(0, 1, 1, 2, 3, 5, 8, 13, 21, 34)
    yieldAll(list)
}

fun main(args: Array<String>) {
    fibonacci().take(4).toList().toString() eq
            "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}