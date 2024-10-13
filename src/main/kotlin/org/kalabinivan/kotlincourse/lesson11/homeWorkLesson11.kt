package org.kalabinivan.kotlincourse.lesson11

import java.time.LocalDate

fun main() {

    println(task1(mapOf()))
    println(task2(mapOf(45F to 3.0, 67F to 2.0, 23F to 4.0)))
    println(task3(mutableMapOf(1 to "может да", 2 to "может нет", 3 to "а может пошёл ты")))
    println(task4(mutableMapOf(1 to "может да", 2 to "может нет", 3 to "а может пошёл ты")))
    println(task5(mutableMapOf(1 to "может да", 2 to "может нет", 3 to "а может пошёл ты")))
    println(task6(mutableMapOf(1 to "может да", 2 to "может нет", 3 to "а может пошёл ты")))
    println(task7(mapOf(4.8 to 2, 6.0 to 0, 8.0 to 4)))
    println(task8(mutableMapOf(1 to "может да", 2 to "может нет", 3 to "а может пошёл ты")))
    println(task9(mapOf("a" to "b", "c" to "d"), mapOf("f" to "g", "h" to "i"), mutableMapOf()))
    println(task10(mutableMapOf()))
    println(task11(mutableMapOf()))
    println(task12(mapOf(3 to 1 to "a", 4 to 7 to "h", 8 to 5 to "p")))

}

//    Задание 1: Создание Пустого Словаря
//    Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.

fun task1(map1: Map<Int, Int>){
    println("Задание1\n$map1")
}

//    Задание 2: Создание и Инициализация Словаря
//    Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double

fun task2(map2: Map<Float, Double>) {
    println("Задание2\n$map2")
}

//    Задание 3: Создание Изменяемого Словаря
//    Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.

fun task3(map3: MutableMap<Int, String>){
    println("Задание3\n$map3")
}

//    Задание 4: Добавление Элементов в Словарь
//    Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".

fun task4(map3: MutableMap<Int, String>){
    map3[4] = "прости погорячился"
    println("Задание 4\n$map3")
}

//    Задание 5: Получение Значений из Словаря
//    Используя словарь из предыдущего задания, извлеките значение, используя ключ.
//    Попробуй получить значение с ключом, которого в словаре нет.

fun task5(map3: MutableMap<Int, String>){
    println("Задание5\n${map3[2]},${map3[5]}")
}

//    Задание 6: Удаление Элементов из Словаря
//    Удалите определенный элемент из изменяемого словаря по его ключу.

fun task6(map3: MutableMap<Int, String>){
    map3.remove(4)
    println("Задание 6\n$map3")
}

//    Задание 7: Перебор Словаря в Цикле
//    Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
//    Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)

fun task7(map7: Map<Double, Int>) {
    println("Задание7")
    for ((key, value) in map7) {
        if (value != 0) {
            print("${key / value} ")
        }
        else print("Бесконечность ")
    }
}

//    Задание 8: Перезапись Элементов Словаря
//    Измените значение для существующего ключа в изменяемом словаре.

fun task8(map3: MutableMap<Int, String>) {
    map3[1] = "может я"
    map3[2] = "а может ю"
    map3[3] = "а может я тебя люблю"
    println("Задание 8\n$map3")
}

//    Задание 9: Сложение Двух Словарей
//    Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.

fun task9(map9: Map<String, String>, map9A: Map<String, String>, newMap9: MutableMap<String, String>) {
    for((key, value) in map9) {
        newMap9[key] = value
    }
    for((key, value) in map9A) {
        newMap9[key] = value
    }
    println("Задание9\n$newMap9")
}

//    Задание 10: Словарь со Сложными Типами
//    Создайте словарь, где ключами являются строки, а значениями - списки целых чисел.
//    Добавьте несколько элементов в этот словарь.

fun task10(map10: MutableMap<String, List<Int>>) {
    map10["Считаю до трёх!"] = listOf(1, 2, 3)
    map10["Обратый отсчёт!"] = listOf(3, 2, 1)
    println("Задание10\n$map10")
}

//    Задание 11: Использование Множества в Качестве Значения
//    Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
//    Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк)
//    и добавь в это множество ещё строку. Распечатай полученное множество.

fun task11(map11: MutableMap<Int, MutableSet<String>>) {
    map11[1] = mutableSetOf("может да", "а может нет")
    map11[2] = mutableSetOf("может я", "а может ю")
    println("Задание11\n${map11[2]}")
    map11[2]?.add("а может я тебя люблю")
    println(map11[2])
}

//    Задание 12: Поиск Элемента по Значению
//    Создай словарь, где ключами будут пары чисел.
//    Через перебор найди значение у которого пара будет содержать цифру 5 в качестве первого или второго значения.

fun task12(map12: Map<Pair<Int, Int>, String>) {
    for((key, value) in map12){
        if(key.first == 5) {
            println(value)
        } else if (key.second == 5){
            println(value)
        }
        else println("Нет такова тут")
    }
}

//Напиши решения задач. В каждом случае нужно проанализировать и подобрать оптимальный тип словаря.
//Задание 6: Словарь Библиотека
//Ключи - автор книги, значения - список книг

fun library(libraryMap: MutableMap<String, MutableList<String>>){
    libraryMap["Dostoevskiy"] = mutableListOf("Idiot", "Prestuplenie i nakazanie")
    libraryMap["Tolstoy"] = mutableListOf("Voina i mir", "Anna Karenina")
}
//Задание 12: Справочник Растений
//Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений

fun plants(plantsMap: MutableMap<String, MutableList<String>> ) {
    plantsMap["Flowers"] = mutableListOf("Rose", "Lilly")
    plantsMap["Trees"] = mutableListOf("Oak", "Bereza")
}

//Задание 8: Четвертьфинала
//Ключи - названия спортивных команд, значения - списки игроков каждой команды

fun quarterFinals(teamsMap: MutableMap<String, MutableList<String>>) {
    teamsMap["Liverpool"] = mutableListOf("Salah", "Nunez")
    teamsMap["Arsenal"] = mutableListOf("Edegor", "Saka")
}

//Задание 9: Курс лечения
//Ключи - даты, значения - список препаратов принимаемых в дату

fun treatmentCourse(treatmentMap: MutableMap<Double, MutableList<String>>) {
    treatmentMap[12.10] = mutableListOf("Parazetomol", "Fenozipan")
}

//Задание 10: Словарь Путешественника
//Ключи - страны, значения - словари из городов со списком интересных мест.

fun travelerBible (travelerMap: MutableMap<String, MutableMap<String, String>>) {
    travelerMap["Russia"] = mutableMapOf("Saint = Petersburg" to "Petergof", "Vladivostok" to "Russkiy Most")
}
