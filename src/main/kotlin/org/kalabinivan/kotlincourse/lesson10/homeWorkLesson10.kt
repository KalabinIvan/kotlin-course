package org.kalabinivan.kotlincourse.lesson10

fun main() {

     println("Массивы")
//    Задание 1: Создание и Инициализация Массива
//    Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val array1: Array<Int> = arrayOf(5, 4, 3, 2, 1)

//    Задание 2: Создание Пустого Массива
//    Создайте пустой массив строк размером 10 элементов.

    val array2 = Array(10) { " " }

//    Задание 3: Заполнение Массива в Цикле
//    Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.

    val array3 = Array<Double>(5) { 0.0 }
    for (i in array3.indices) {
        array3[i] = i * 2.0
    }
    println("Задание 3")
    println(array3.toList())

//    Задание 4: Изменение Элементов Массива
//    Создайте массив из 5 элементов типа Int.
//    Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.

    val array4: Array<Int> = arrayOf(111, 34, 56, 46, 55)
    for (i in array4.indices) {
        array4[i] = i * 3
    }
    println("Задание 4")
    println(array4.toList())

//    Задание 5: Работа с Nullable Элементами
//    Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    println("Задание 5")
    val array5 = arrayOfNulls<String?>(3)
    println("НЕ СДЕЛАНО")

//    Задание 6: Копирование Массива
//    Создайте массив целых чисел и скопируйте его в новый массив в цикле.

    val array6: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val copyOfArray6 = Array(5) { 0 }
    for (i in array6.indices) {
        copyOfArray6[i] = array6[i]
    }
    println("Задание 6")
    println(copyOfArray6.toList())

//    Задание 7: Разница Двух Массивов
//    Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.

    val array7: Array<Int> = arrayOf(5, 6, 7, 8, 10)
    val secondArray7: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val thirdArray7 = Array(5) { 0 }

    for (i in array7.indices) {
        thirdArray7[i] = array7[i] - secondArray7[i]
    }
    println("Задание 7")
    println(thirdArray7.toList())


    //    Задание 8: Поиск Индекса Элемента
//    Создайте массив целых чисел.
//    Найдите индекс элемента со значением 5.
//    Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.

    val array8: Array<Int> = arrayOf(5, 2, 0, 8, 0, 9)
    val index = findIndex(array8)
    println("Задание 8")
    println(index)

//    Задание 9: Перебор Массива
//    Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//    Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    println("Задание 9")
    val array9: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val task9 = massive9(array9)

//    Задание 10: Поиск Значения в Массиве по вхождению
//    Создай функцию, которая принимает массив строк и строку для поиска.
//    Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
//    Выведи найденный элемент из функции в виде строки.
    println("Задание 10")
    println("НЕ СДЕЛАНО")


}
// Задание 8 (массивы)
    fun findIndex(array8: Array<Int>): Int {
        var index = 0

        while (index >= 0) {
            if (array8[index] == 5) {
                return index
            }
            index++
        }
            return -1
        }

// Задание 9 (массивы)
    fun massive9(array9: Array<Int>) {
    var counter = 0

    for (i in array9) {
        if (array9[counter] % 2 == 0) {
            println("${array9[counter++]} - чётное")
        } else println("${array9[counter++]} - нечётное")
    }

}





