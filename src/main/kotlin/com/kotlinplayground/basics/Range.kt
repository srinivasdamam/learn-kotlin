package com.kotlinplayground.basics

fun main() {
    var range = 1..2;
    for (i in range) {
        println("i: $i")
    }

    var reverseRange = 10 downTo 1;
    for (i in reverseRange step 2) {
        println("reverse range : $i")
    }
}