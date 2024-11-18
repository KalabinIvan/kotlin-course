package org.kalabinivan.kotlincourse.lesson22.homeWork22

fun Long?.toFormattedString(): String {
    return when(this) {
        null -> "Значение отсутствует"
        else -> "$this"
    }
}