package org.kalabinivan.kotlincourse.lesson6
fun main(){
    println("Задача 1: cпособ else if")
    println(season(10))
    println("Задача 1: cпособ when")
    println(season2(4))
    println("Задача 2: cпособ else if")
    println(humanAge(4))
    println("Задача3: cпособ else if")
    println(transport(5.0))
    println("Задача3: cпособ when")
    println(transport2(26.0))
    println("Задача4: cпособ else if")
    println(bonusPoints(1135))
    println("Задача4: cпособ when")
    println(bonusPoints2(555))
    println("Задача5: способ when")
    println(fileType(".png"))
    println("Задача6: способ else if")
    println(temperatureConv(38.0,"C"))
    println(temperatureConv(32.0,"F"))
    println("Задача7: способ else if")
    println(kindMeteorologist(30))
    println("Задача7: способ when")
    println(kindMeteorologist2(-15))
    println("Задача8: способ else if")
    println(ageLimit(30))
    println("Задача8: способ when")
    println(ageLimit2(15))
}

// === Задача 1 ===
//Напишите функцию, которая на основе номера месяца возвращает сезон года.
// === С помощью if else ===

fun season(numberOfMonth: Int): String{
    return if (numberOfMonth in 1..2 || numberOfMonth == 12) "Winter"
    else if (numberOfMonth in 3..5) "Spring"
    else if (numberOfMonth in 6..8) "Summer"
    else if (numberOfMonth in 9..11) "Fall"
    else "Invalid Data"

}

// === Решение от Куратора ===

//fun getSeason(month: Int): String {
//    return when (month) {
//        !in 1..12 -> "Неверно указан месяц"
//        in 3..5 -> "Весна"
//        in 6..8 -> "Лето"
//        in 9..11 -> "Осень"
//        else -> "Зима"
//    }
//}

// === С помощью when ===

fun season2(numberOfMonth2: Int): String{
    return when (numberOfMonth2) {
        in 1..2, 12 -> "Winter"
        in 3..5 -> "Spring"
        in 6..8 -> "Summer"
        in 9..11 -> "Fall"
        else -> "Invalid Data"
    }
}
// === Задача 2 ===
//Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
//До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.
// === С помощью if else ===

fun humanAge(dogsAge: Int): Any {
    return if (dogsAge < 2) { // здесь лучше сделать просто < 2 (коммент от куратора)
        dogsAge * 10.5
    } else if (dogsAge > 2) {
        (dogsAge - 2) * 4 + 21
    } else {
        println("Invalid Data")
    }
}

// === Задача 3 ===
//Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
//Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
// === С помощью if else ===

fun transport(pathLength: Double): String {
    return if (pathLength < 0){
        "Введите корректное расстояние"
    }
    else if (pathLength < 1.0) { // здесь лучше сделать просто < 1 (коммент от куратора)
        "Пешком"
    }
    else if (pathLength < 5.0) { // здесь лучше сделать просто < 5 (коммент от куратора)
        "Велосипед"
    }
    else {
        "Автотранспорт"
    }
}

// === С помощью when ===

fun transport2(pathLength2: Double): String {
    return when {
        pathLength2 < 0 -> "Введите корректные данные"
        pathLength2 in 0.0..1.0 -> "Пешком"
        pathLength2 in 1.01..5.0 -> "Велосипед"
        else -> "Автотранспорт"
    }
}

// === Задача 4 ===
//Клиенты интернет-магазина получают бонусные баллы за покупки.
//Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов:
//2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.
// === С помощью if else ===

fun bonusPoints(amount: Int): Any {
    val lessAmount: String = "Сумма слишком мала для начисления баллов"
    val incorrectData: String = "Введите корректные данные"

    return if (amount in 0..100) {
        lessAmount
    } else if  (amount in 100..999) {
    amount / 100 * 2
    } else if (amount > 999) { // завести переменную
        amount / 100 * 5 + 18 // при повторяющихся действиях лучше занести их в переменную
    } else incorrectData
}

// === С помощью when ===

fun bonusPoints2(amount2: Int): Any {
    val lessAmount2: String = "Сумма слишком мала для начисления баллов"
    val incorrectData2: String = "Введите корректные данные"

    return when (amount2) {
        in 0..100 -> lessAmount2
        in 100..999 -> amount2 / 100 * 2
        in 1000..10000000 -> amount2 / 100 * 5 + 18
        else -> incorrectData2
    }
}

// === Задача 5 ===
//В системе хранения документов каждый файл имеет расширение.
//Напишите функцию, которая на основе расширения файла возвращает его тип:
//"Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
// === С помощью when ===

fun fileType(fileExtension: String): String {
    return when(fileExtension) {
        ".txt",".doc" -> "Текстовый документ"
        ".png",".jpg" -> "Изображение"
        "xls","xlsx" -> "Таблица"
        else -> "Неизвестный тип"
    }
}

// === Задача 6 ===
//Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F).
//Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.
//Подсказка: для генерации строки из числа и буквы можно использовать шаблон “$result F” для фаренгейта или “$result C” для цельсия
// === С помощью if else ===

fun temperatureConv(temperature: Double, unitOfMeasurement: String): String {
    return if (unitOfMeasurement == "C") {
        val result = (temperature * 9 / 5) + 32
        "$result F"
    } else if (unitOfMeasurement == "F") {
        val result = (temperature - 32) * 5 / 9
        "$result C"
    }
    else "Invalid Data"
}

// === Задача 7 ===
//Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже 0,
//"ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15.
//При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
// === С помощью if else ===

fun kindMeteorologist (degrees: Int): String {
    return if (degrees in 0 downTo -30){ // ипользовалась функция until
        "Рекомендуется надеть куртку и шапку"
    } else if (degrees in 1..15){
        "Рекомендуется надеть ветровку"
    } else if (degrees in 16..35){
        "Рекомендуем надеть футболку и шорты"
    } else "Рекомендуем не выходить на улицу"
}

// === С помощью when ===

fun kindMeteorologist2 (degrees2: Int): String {
    return when(degrees2){
        in  0 downTo -30 -> "Рекомендуется надеть куртку и шапку"
        in 1..15 -> "Рекомендуется надеть ветровку"
        in 16..35 -> "Рекомендуем надеть футболку и шорты"
        else -> "Рекомендуем не выходить на улицу"
    }
}

// === Задача 8 ===
//Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя и возвращает
//доступные для него категории фильмов: "детские", "подростковые", "18+".
// === С помощью else if ===

fun ageLimit(yearsOld: Int):String {
    return if (yearsOld in 0..12){
        "Детские фильмы"
    } else if (yearsOld in 13..17){
        "Подростковые фильмы"
    } else if (yearsOld in 18..100){
        "Фильмы 18+"
    } else "Некорректные данные"
}

// === С помощью when ===

fun ageLimit2(yearsOld2: Int):String {
    return when (yearsOld2){
        in 0..12 -> "Детские фильмы"
        in 13..17 -> "Подростковые фильмы"
        in 18..100 -> "Фильмы 18+"
        else -> "Некорректные данные"
    }
}
