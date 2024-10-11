package org.kalabinivan.kotlincourse.lesson11

fun main() {

    val pair: Pair<Int, String> = 1 to "a"
    val pair2 = Pair(2, "a")

    println(pair.first)
    println(pair.second)

    val emptyMap = mapOf<String, String>() // словари(мапы), хранит данные в виде ключа и значения

    val capitals = mapOf(
        "Россия" to "Москва",
        "Сербия" to "Белград"
    )

    val a1 = "Russia" to "Moscow"
    val a2 = "France" to "Paris"

    val capitals1 = mapOf(a1, a2)

    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c") // ключ всегда укникален, если мы добавим одинкаовые ключи значения просто перезапишутся

    val mutableCapitals = mutableMapOf("Russia" to "Moscow","France" to "Paris")

    val capitalOfRussia = capitals["Россия"] // поиск по ключу

    println(capitalOfRussia)

    mutableCapitals["Germany"] = "Berlin" // добавляем значение в словарь
    mutableCapitals.remove("France") // удаляем значение из словаря по ключу

    println(mutableCapitals)

    for (entries in mutableCapitals){ // перебор по значениям
        println("${entries.key}: ${entries.value} ") // key - ключ, value - значение
    }

    for((country, capital) in mutableCapitals){ //сразу разбиваем на слои
        println("$country: $capital") // выводим без ключевых слов
    }

    val myMap = mapOf<String, Int>()
    val myMap2 = mapOf(1 to "a", 2 to "b")
    val myMap3 = mutableMapOf(1 to "a")

    myMap3[2]="b"

    println(myMap3[2])
    println(myMap3[3]) // если ключа нет в словаре вернется Null

    myMap3.remove(1)
    println(myMap3)

    for(i in myMap2){
        println("${i.key}: ${i.value}")
    }

    for((key, value) in myMap2) {
        println("$key: $value")
    }

    val myMap4 = mapOf("St" to listOf(1, 2, 3))

    val daysMap = mapOf<String, List<String>>()
    val schoolMap = mapOf<String, MutableMap<String, String>>()
    val inventoryMap = mapOf<String, MutableSet<String>>()
    
}

fun searchValue(myMap: Map<String, String>, word:String): String {
    for((key, value)in myMap) {
        if (value == word) {
            return key
        }
    }
    return "Ты дурачок"
}