package org.kalabinivan.kotlincourse.lesson6

fun main () {

}


//    === IF ELSE ===

    //    val number = 6
//    if (number > 5){
//        println("число больше 5")
//    } else {
//        println("число меньше или равно 5")
//    }

//    val number: Int = 1
//
//    if (number < 0){
//        println("Число отрицательное")
//    } else if (number == 0) {
//        println("Число равно 0")
//    } else {
//        println("Число положительное")
//    }

//    === ДИАПАЗОНЫ ===

//    val intRange: IntRange = 1..10 // диапазон, всего возрастает, диапазон включает в себя указанные значения
//    val intRangeUntil = 1 until 10 // диапазон, всегда возрастает, включает в себя первое, но не последнее значение
//    val downTo = 10 downTo 1 // диапазон, всегда убывает, включает в себя указанные значения
//    val charRange: CharRange = 'd'..'r' //символьный диапазон, символ - это код. Включает в себя указанные значения
//
//    val inRange = 15 in intRange // проверка входит ли значение в диапазон, будет boolean
//    val notInRange = 20 !in intRange // проверка отсутствия значения в диапазоне
//
//    println(intRange)
//    println(inRange)
//    println(notInRange)

//    === WHEN ELSE ===

//    val score = 96
//    when (score) {
//        in 101..1000 -> println("Некорректное")
//        in 90..100 -> println("Отлично")
//        in 80..90 -> println("Хорошо")
//        in 70..79 -> println("Удовлетворительно")
//        else -> println("Нужно подучить")
//    } // когда мы слишком часто повторяем вывод на экран его лучше заключить в переменную смотри ниже

//    val score = 578
//    if (score in 90..100) {
//        println("Отлично")
//    } else if (score in 89..90) {
//        println("Хорошо")
//    } else if (score in 70..79) {
//        println("Удовлетворительно")
//    } else if (score > 100) {
//        println("Некорректное")
//    } else {
//        println("Нужно подучить")
//    }

//    === OPERATOR MAX ===

//    val a = 3
//    val b = 4
//
//    val max = if (a > b){// использования условного оператора для расчета значения переменной
//       a}
//       else{
//       b
//   }
//
//    println(max)

//  === УБИРАЕМ ПОВТОРЯЮЩУЮСЯ КОМАНДУ PRINTLN ===

//    val score = 109
//    val result = when (score)
//    {in 101..1000 -> "Некорректное"
//        in 90..100 -> "Отлично"
//        in 80..90 -> "Хорошо"
//        in 70..79 -> "Удовлетворительно"
//        else -> "Нужно подучить"
//    }
//    println(result)

// === ПРАКТИКА ===

// === ЗАДАЧА 1 ===

//    === ИПОЛЬЗУЕМ IF ELSE ===

//fun getTimesOfDay(hour: Int): String {
//    return if (hour < 0 || hour > 23) {
//        "Error"
//    } else if (hour in 0..4) {
//        "Night"
//    } else if (hour in 5..11) {
//        "Morning"
//    } else if (hour in 12..16) {
//        "Day"
//    } else {
//        "Evening"
//    }
//}
//    println(getTimesOfDay(8))

//    === ИСПОЛЬЗУЕМ WHEN ===

//    fun getTimesOfDay(hour: Int = 3): String {
//        return when {
//            hour < 0 || hour > 23 -> "Error"
//            hour in 0..4 -> "Night"
//            hour in 5..11 -> "Morning"
//            hour in 12..16 -> "Day"
//            else -> "Evening"
//        }
//    }
//    println(getTimesOfDay(45))

//    === ЗАДАЧА 2 ===

//    fun checkPassword(password: String): Boolean {
//        if (password.length <= 8) return false
//        if (checkSymbols(password)) return true
//        return false
//    }
//
//    fun checkSymbols(password: String): Boolean {
//    return false
//    }

// === ЗАДАЧА 2 ===

//    fun convertMark(mark: Int = 15): String {
//
//        val result = when (mark) {
//            in 0..20 -> "F"
//            in 21..40 -> "E"
//            in 41..60 -> "D"
//            in 61..75 -> "C"
//            in 76..90 -> "B"
//            in 91..100 -> "A"
//            else -> "Invalid mark"
//
//        }
//        return result
//    }
//    println(convertMark(98))



