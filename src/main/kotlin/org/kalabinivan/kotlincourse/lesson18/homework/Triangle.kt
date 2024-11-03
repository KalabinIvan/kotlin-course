package org.kalabinivan.kotlincourse.lesson18.homework

class Triangle(
    val base: Double,
    val height: Double,
) : Shape() {

    override fun area(): Double {
        return (base * height) / 2
    }
}