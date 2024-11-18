package org.kalabinivan.kotlincourse.lesson22.homeWork22

import kotlin.math.absoluteValue

fun Number.within(other: Number, deviation: Number): Boolean {
    val difference = this.toDouble() - other.toDouble()
    return difference.absoluteValue <= deviation.toDouble()
}