package org.kalabinivan.kotlincourse.lesson4

val myInt: Int = 214748647 // есть минимальное и максимальное число
val myFloat: Float = Float.MIN_VALUE // тип переменной с плавающей точкой обязательно дописывать F в конце
val myLong: Long = Long.MIN_VALUE // более длинный тип данных для больших чисел
val myShort: Short = Short.MIN_VALUE // для малых чисел
val myByte: Byte = Byte.MIN_VALUE // для хранение байтовой информации
val myDouble: Double = Double.MIN_VALUE // больше знаков после запятой

val myBoolean: Boolean = true // логическая переменная для хранения двух значений true и false

var letter: Char = 'A' // всегда одиночный символ, обрамляется кавычками ''

val text: String = "Hello world" // строковая переменная, сотоящая из символов, может быть пустыми. Менять нельзя

// коллекции
val numbers: Array<Int> = arrayOf(1,2,3) // коллекция чисел
val strings: MutableList<String> = mutableListOf("one", "two")
val doubles: Set<Double> = setOf(1.5, 23.4)

// словари
val keysToValuses: Map<String, String> = mapOf(
    "Key 1" to "meaning 1",
    "Key 2" to "meaning 2"
)

val anything: Any = true // любой тип можно положить в Any

// не указанный тип переменной

fun fail(message: String): Nothing {
    throw IllegalStateException(message)
}