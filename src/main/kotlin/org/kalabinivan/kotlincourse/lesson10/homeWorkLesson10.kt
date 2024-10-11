package org.kalabinivan.kotlincourse.lesson10

fun main() {

     println("МАССИВЫ")
//    Задание 1: Создание и Инициализация Массива
//    Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    println("Задание 1")

    val array1: Array<Int> = arrayOf(5, 4, 3, 2, 1)
    println(array1.toList())

//    Задание 2: Создание Пустого Массива
//    Создайте пустой массив строк размером 10 элементов.
    println("Задание 2")

    val array2 = Array(10) { " " }
    println(array2.toList())

//    Задание 3: Заполнение Массива в Цикле
//    Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    println("Задание 3")

    val array3 = Array<Double>(5) { 0.0 }
    for (i in array3.indices) {
        array3[i] = i * 2.0
    }
    println(array3.toList())

//    Задание 4: Изменение Элементов Массива
//    Создайте массив из 5 элементов типа Int.
//    Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    println("Задание 4")

    val array4: Array<Int> = arrayOf(111, 34, 56, 46, 55)
    for (i in array4.indices) {
        array4[i] = i * 3
    }
    println(array4.toList())

//    Задание 5: Работа с Nullable Элементами
//    Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    println("Задание 5")
    val array5: Array<String?> = arrayOf(null, " ", "asd")
    println(array5)

//    Задание 6: Копирование Массива
//    Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    println("Задание 6")

    val array6: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val copyOfArray6 = Array(5) { 0 }
    for (i in array6.indices) {
        copyOfArray6[i] = array6[i]
    }
    println(copyOfArray6.toList())

//    Задание 7: Разница Двух Массивов
//    Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    println("Задание 7")

    val array7: Array<Int> = arrayOf(5, 6, 7, 8, 10)
    val secondArray7: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val thirdArray7 = Array(5) { 0 }

    for (i in array7.indices) {
        thirdArray7[i] = array7[i] - secondArray7[i]
    }
    println(thirdArray7.toList())


    //    Задание 8: Поиск Индекса Элемента
//    Создайте массив целых чисел.
//    Найдите индекс элемента со значением 5.
//    Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    println("Задание 8")

    val array8: Array<Int> = arrayOf(9, 2, 0, 5, 0, 9)
    val index = findIndex(array8)
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

    println("СПИСКИ")
//    Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.

    val list = listOf<Int>()

//    Задание 2: Создание и Инициализация Списка
//    Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    println("Задание 2")

    val list2: List<String> = listOf("I", "Love", "Kotlin")
    println(list2)

//    Задание 3: Создание Изменяемого Списка
//    Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    println("Задание 3")

    val list3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(list3)

//    Задание 4: Добавление Элементов в Список
//    Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    println("Задание 4")

    val list4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list4.add(5)
    list4.add(6)
    list4.add(7)
    println(list4)

//    Задание 5: Удаление Элементов из Списка
//    Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    println("Задание 5")

    val list5: MutableList<String> = mutableListOf("I", "Love", "Kotlin")
    list5.remove("Kotlin")
    println(list5)

//    Задание 6: Перебор Списка в Цикле
//    Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    println("Задание 6")

    val list6: List<Int> = listOf(1, 2, 3, 4, 5)
    for (i in list6){
        println(i)
    }

//    Задание 7: Получение Элементов Списка по Индексу
//    Создайте список строк и получите из него второй элемент, используя его индекс.
    println("Задание 7")

    val list7: List<String> = listOf("I", "Love", "Kotlin")
    println(list7[1])

//    Задание 8: Перезапись Элементов Списка по Индексу
//    Имея изменяемый список чисел, измените значение элемента на определенной позиции
//    (например, замените элемент на позиции 2 на новое значение).
    println("Задание 8")

    val list8: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list8[2] = 4
    println(list8)

//    Задание 9: Объединение Двух Списков
//    Создайте два списка строк и объедините их в один новый список,
//    содержащий элементы обоих списков. Реши задачу с помощью циклов.
    println("Задание 9")

    val list9A: List<String> = listOf("I", "Love", "Kotlin")
    val list9B: List<String> = listOf("But", "I'm", "Stupid")
    val list9: MutableList<String> = mutableListOf()

    for (i1 in list9A){
        list9.add(i1)
    }
    for (i2 in list9B){
        list9.add(i2)
    }
    println(list9)

//    Задание 10: Нахождение Минимального/Максимального Элемента
//    Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    println("Задание 10")

    val list10: List<Int> = listOf(1, 2, 3, 4, 5)
    for (i in list10){
        if (i == list10.max()){
            println(i)
        } else if(i == list10.min()){
            println(i)
        }
    }

//    Задание 11: Фильтрация Списка
//    Имея список целых чисел, создайте новый список, содержащий только четные числа
//    из исходного списка используя цикл.
    println("Задание 11")

    val list11: List<Int> = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val list11A: MutableList<Int> = mutableListOf()
    for (i in list11){
        if(i % 2 == 0){
            list11A.add(i)
        }
    }
    println(list11A)

    println("МНОЖЕСТВА")

//    Задание 1: Создание Пустого Множества
//    Создайте пустое неизменяемое множество целых чисел.
    println("Задание 1")

    val set1: Set<Int> = setOf()
    println(set1.toList())

//    Задание 2: Создание и Инициализация Множества
//    Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    println("Задание 2")

    val set2: Set<Int> = setOf(1, 2, 3,)
    println(set2.toList())

//    Задание 3: Создание Изменяемого Множества
//    Создайте изменяемое множество строк и инициализируйте его несколькими значениями
//    (например, "Kotlin", "Java", "Scala").
    println("Задание 3")

    val set3: MutableSet<String> = mutableSetOf("I", "Love", "Kotlin")
    println(set3)

//    Задание 4: Добавление Элементов в Множество
//    Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    println("Задание 4")

    val set4: MutableSet<String> = mutableSetOf("I", "Love", "Kotlin")
    set4.add("But")
    set4.add("I,m")
    set4.add("Stupid")
    println(set4)

//    Задание 5: Удаление Элементов из Множества
//    Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    println("Задание 5")

    val set5: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)
    set5.remove(4)
    println(set5)

//    Задание 6: Перебор Множества в Цикле
//    Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    println("Задание 6")

    val set6: Set<Int> = setOf(1, 2, 3, 4, 5)
    for(i in set6){
        println(i)
    }

//    Задание 7: Проверка Наличия Элемента в Множестве
//    Создай функцию, которая принимает множество строк (set) и строку и проверяет,
//    есть ли в множестве указанная строка.
//    Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    println("Задание 7")

    val set7: Set<String> = setOf("I", "Love", "Kotlin", "But", "I'm", "Stupid")
    println(findElement(set7, string1 = "Smart"))

//    Задание 8: Объединение Двух Множеств
//    Создайте два множества строк и объедините их в одно новое множество,
//    содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
    println("Задание 8")

    val set8A: Set<Int> = setOf(1, 2, 3 ,4 ,5)
    val set8B: Set<Int> = setOf(3, 4 , 5, 6, 7)
    val set8: MutableSet<Int> = mutableSetOf()
    for(i in set8A){
        set8.add(i)
    }
    for(i in set8B){
        set8.add(i)
    }
    println(set8)

//    Задание 9: Нахождение Пересечения Множеств
//    Создайте два множества целых чисел и найдите их пересечение (общие элементы).
//    Реши задачу через вложенные циклы.
    println("Задание 9")

    val set9A: Set<Int> = setOf(1, 2, 3, 4, 5)
    val set9B: Set<Int> = setOf(1, 6, 3, 7, 5)
    val set9: MutableSet<Int> = mutableSetOf()
    for(i in set9A) {
        for (it in set9B) {
            if (i == it) set9.add(i)
        }
    }
    println(set9)

//    Задание 10: Нахождение Разности Множеств
//    Создайте два множества строк и найдите разность первого множества относительно второго
//    (элементы, присутствующие в первом множестве, но отсутствующие во втором).
//    Реши задачу через вложенные циклы и переменные флаги.
    println("Задание 10")

    val set10: Set<String> = setOf("Пук", "Мук", "Лук")



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

// Задание 7 (множества)
    fun findElement(set7: Set<String>, string1: String ): Boolean {
    for (i in set7) {
        if (i == string1) {
            return true
        }
    }
    return false
}





