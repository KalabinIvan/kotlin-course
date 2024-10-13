package org.kalabinivan.kotlincourse.lesson12

fun main() {

    println(averageOnList(listOf(1, 6, 3, 23 ,5)))
    println(nullStringNullInt("Hello!"))
    println(noArgReturnRealNum())
    println(arfIntReturnNullString(5))
    println(noArgReturnNullString())
    println(argNullStringNullIntReturnNulBoolean(null, null))
    println("Задание 1 \n${multiplyByTwo(5)}")
    println("Задание2 \n${isEven(3)}")
    printNumbersUntil(5)
    val intList = listOf(1, -2, 4, 6, 7)
    println("Задание 4 \n${findFirstNegative(intList)}")
    val stringList = listOf("может я", "может ю", null, "а может я тебя люблю", "а может пошёл ты")
    println(processList(stringList))
    println("РЕФАКТОРИНГ ФУНКЦИИ")
    println(drawRectangle(5,5))

}
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun noArgNoReturn(){

}
//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun addition(a: Int, b: Int): Int{
    return a + b
}

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun stringArgNoReturn(argString: String) {

}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun averageOnList(listArg: List<Int>): Double{
    return listArg.average()
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun nullStringNullInt(nullString: String?): Int? {
        return nullString?.length
    }

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun noArgReturnRealNum(): Float? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun nullListReturnNothing(nullList: List<Int?>) {

}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun arfIntReturnNullString(argInt: Int): String? {
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun noArgReturnNullString(): List<String?> {
    return listOf("raz", null, "tri")
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и
// возвращает nullable булево значение.
fun argNullStringNullIntReturnNulBoolean(argString1: String?, argInt1: Int?): Boolean? {
    return null
}

//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int) = a * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true,
// если число чётное, и false в противном случае.
fun isEven(a: Int) = a % 2 == 0

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int): Unit {
    return if (n < 1) {
    } else {
        val b = 1..n
        return println("Задание 3 \n${b.toList()}")
    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число
// в списке. Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(intList: List<Int>): Int? {
    for (i in intList.indices) {
         if (intList[i] < 0)
              return intList[i]
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк.
// Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(stringList: List<String?>): Unit {
    println("Задание 5")
    for (i in stringList.indices) {
         if (stringList[i] != null){
             println(stringList[i])
         }
        else return
    }
}

//Сделай рефакторинг функции, через определение вспомогательных приватных функций.
// Требуется избавиться от дублирования кода и трудно воспринимаемых фрагментов.

//Сначала сделай запуск функции и посмотри на результат её работы.
// Сделай запуск после рефакторинга и проверь, чтобы результат работы был аналогичным.
private fun checkSize(size: Int, dimension: String) {
    if(size <= 0) throw IllegalArgumentException("$dimension должно быть положительным и больше нуля")
}
private fun topAndBottom(size: Int) {
    var symbol = "+"
    for (i in 1 until size - 1) {
        symbol += "-"
    }
    symbol += "+\n"
    print(symbol)
}

private fun middle(size: Int, size2: Int){
    for (i in 1 until size2 - 1) {
        var middleLine = "|"
        for (j in 1 until size - 1) {
            middleLine += " "
        }
        middleLine += "|\n"
        print(middleLine)
    }
}

fun drawRectangle(width: Int, height: Int) {
    checkSize(width, "width")
    checkSize(height,"height")
    // Верхняя граница
    topAndBottom(width)
    // Боковые границы
    middle(height, width)
    // Нижняя граница
    topAndBottom(width)
}






