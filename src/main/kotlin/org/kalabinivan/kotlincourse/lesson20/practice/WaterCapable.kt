package org.kalabinivan.kotlincourse.lesson20.practice

interface WaterCapable {

    val volume: Double
    fun fill(amount: Double)
    fun take(amount: Double)

}