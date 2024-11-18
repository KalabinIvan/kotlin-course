package org.kalabinivan.kotlincourse.lesson22.homeWork22

fun <T> Pair<T, T?>.revert(): Pair<T?, T> {
    return second to first
}