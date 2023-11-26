package com.kotlinplayground.basics

fun main() {
    var position = 1
    val result = when(position) {
        1 -> "GOLD"
        2 -> "SILVER"
        3 -> "BRONZE"
        else -> "NO MEDAL"
    }
    println(result)
}