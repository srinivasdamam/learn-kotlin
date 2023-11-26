package com.kotlinplayground.basics

fun main() {
    var x = 1
    while (x < 5) {
        println(x);
        x++
    }
    x = 1;

    do {
        println("i in dowhile :$x")
        x++
    } while (x < 5)
}