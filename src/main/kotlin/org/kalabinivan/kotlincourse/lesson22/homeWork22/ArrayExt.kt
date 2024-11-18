package org.kalabinivan.kotlincourse.lesson22.homeWork22

fun IntArray.firstAndLast(): Pair<Int, Int> {
    return if (isNotEmpty()) {
        this[0] to this[lastIndex]
    } else {
        0 to 0
    }
}