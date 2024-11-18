package org.kalabinivan.kotlincourse.lesson22.homeWork22

fun Char?.myExtensionFunction(num1: Int, num2: Double, isConditionTrue: Boolean) {
    if (this != null && isConditionTrue) {
        println("Символ: $this, Число 1: $num1, Число 2: $num2")
    } else {
        println("Символ равен null или условие ложно.")
    }
}