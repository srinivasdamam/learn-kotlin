package com.kotlinplayground.basics

/**
 * NOTES:
 * Use val for immutable variables
 * Use var for mutable variables
 */
fun main() {
    val name: String = "Sree"
    println("Name is $name")

    var city: String = "Bengaluru"
    city = "Pune"
    println("City is $city")

    // Types are automatically inferred by compiler
    // when initialisation is done with declaration
    val salary = 30000L;
    println("Salary is $salary")

    // String interpolation is done by :$
    val age = 30;
    println("Age is $age")
}