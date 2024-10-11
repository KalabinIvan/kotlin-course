package org.kalabinivan.kotlincourse.lesson5

// fun main() {
//    val sum = "5" + "3"
//    val diff = 10 - 5
//    val product = 10 * 5
//    val qoutient = 10 / 5
//    val reminder = 10 % 5
//    val reminder1 = 10 % 6
//    val reminder2 = 10 % 4
//    val isEqual = 5 == 5 // проверка эквивалентности == , результатом будет boolean
//    val isNotEqual = 5 != 5 // != значит не равно
//    val isGreater = 5 > 3
//    val isLesser = 5 < 3
//    val isGreaterOrEqual = 5 >= 3
//    val isLesserOrEqual = 5 <= 3
//    val andResult = true && true // оператор "И"
//    val orResult = true || false // оператор "ИЛИ"
//    val notResult = !(5 > 3) // переворачивает значение
//    var number = 5 // "=" оператор присваивания
//    number += 3 // присваивание путём прибавления выглядит как number = number + 3
//    number -= 2 // то же самое только с отниманием
//
//    number++ // инкримент увеличивает на единицу
//    number-- // декремент уменьшаеи на единицу
//    // если стоит в конце переменной сначала считывается переменная потом происходит вычисление, и наоборот
//
//    // === Приоритеты арифметических операций ===
//    // сначала выполняется операция в скобочках.
//    // операции умножение и деление следующие на очереди
//    // у логичесикх операций тоже есть приоритеты сначала "НЕ", потом "И" следом "ИЛИ"

    // === ПРАКТИКА ===

//    (3 + 2 < 6) && (4 * 2 == 8) // true
//    (10 - 5 >= 5) || (2 * 3 != 6)
//    (8 / 2 == 4) && (7 % 3 != 1)
//    (9 - 3 >= 6) && (8 / 2 != 4) // false
//    ((3 + 4) < 8) && (12 / 3 == 4) || (5 % 2 != 1)
//    ((10 - 5) >= 5) || (6 * 2 != 12) && !(9 / 3 > 2)
//    ((2 * 5) == 10) && !(7 - 3 < 5) || (8 / 2 == 4)
//    ((9 + 2) < 12) && (15 % 4 != 3) || !(4 * 2 == 8)
//
//    ((var a = 4; a-- == 4) || (5 * 2 != 10)) && (3 + 1 == 4)
//    (var b = 3; b++ > 3) && (6 / 2 == 3) || (7 - 2 != 5)
    // false true false = false
    // (var c = 1; ++c < 3) || ((4 % 2 == 0) && (5 + 0 == 5))
    // true (true true) = true
    // ((var d = 5; d-- == 5) && (8 / 4 == 2)) || (2 * 3 != 6)
    // (true true) false = true
    // (var e = 2; e++ < 3) && ((7 + 1 == 8) || (4 % 2 != 0))
    // true (true false) = true

    // === Оператор Элвиса ===
    
//    val name: String? = null
//
//    val result = name ?: "Unknown"

//    val result = if (name == null) {
//        "Unknown"
//    } else {
//        name
//    }

//fun main () {
//
//    printVolume( null )
//}
//
//fun printVolume(userVolume: Int?) {
//    val defaultVolume = 30
//    println(userVolume ?: defaultVolume)
//}

//fun main() {
//    printPrice(123.8, null)
//    printPrice(100.0, 10)
//
//}
//
//fun printPrice(price: Double, discount: Int?){
//    val koef = (100 - (discount ?: 0)) / 100.0
//    println(price * koef)
//}

//

//fun main() {
//    printCargo("Full")
//    printCargo(null)
//
//}
//
//fun printCargo(box: String?){
//    println(box ?: throw Exception("Box is empty"))
//
//}