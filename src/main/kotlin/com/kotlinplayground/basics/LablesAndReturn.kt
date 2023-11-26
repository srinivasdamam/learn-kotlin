package com.kotlinplayground.basics

fun main() {
    loop@ for (i in 1..5) {
        innerloop@ for (j in 1..5) {
            if (j == 1) {
                break@innerloop
            }
        }
    }
}