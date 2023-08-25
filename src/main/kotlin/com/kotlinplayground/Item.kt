package com.kotlinplayground

import java.lang.IllegalArgumentException

class Item() {
    var name: String = ""
    var price: Double = 0.0
        get() {
            println("inside getter")
            return field
        }
        set(value) {
            println("inside setter")
            if (value >= 0.0) {
                field = value
            } else {
                throw IllegalArgumentException("negative price can not be set")
            }
        }

    constructor(_name: String) : this() {
        name = _name
    }
}

fun main() {
    val item = Item("iphone")
//    println("Item name is ${item.name}")
//    item.name = "iphone 13"
//    println("Item name is ${item.name}")
    item.price = 10.0
    println("Item price is ${item.price}")


}