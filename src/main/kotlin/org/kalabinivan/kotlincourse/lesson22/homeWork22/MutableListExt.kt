package org.kalabinivan.kotlincourse.lesson22.homeWork22

fun <T> MutableList<T>.findElementOrNull(element: T?, index: Int): T? {
    return if (index in 0 until size && element == get(index)) {
        element
    } else {
        null
    }
}