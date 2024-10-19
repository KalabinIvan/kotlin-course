package org.kalabinivan.kotlincourse.lesson14

fun main(){

    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    for ((fruit, price) in fruitsPrices) {
        println("Key: $fruit, Value: $price")
    }

    val entries = fruitsPrices.entries // возвращаем
    val keys = fruitsPrices.keys // возвращаем ключи
    val values = fruitsPrices.values // возвращаем значения

    val priceOfPearOrElse = fruitsPrices.getOrElse("pear") { throw IllegalArgumentException() } // возвращаем значение по ключу,
    // если ключа не будет выбрасываем исключение, либо выполнить код
    val priceOfApple = fruitsPrices.getValue("apple") // возвращаем значение по ключу,
    // если ключа нет null pointer exception, метод опасен, в мапе не должно быть null
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0)  // возвращаем значение по ключу
    // либо дефолтное значение. Безопасное обращение с данными

    val fruitsWithoutBanana = fruitsPrices - "banana" // Вычитаем строку. "-" - это метод создаёт
    // новый словарь, исключая вычитаемый элемент
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 3.5) // "+" создаёт новый словарь
    // с новым значением в нём, круглые скобочки обязательны
    val mutableFruits = fruitsPrices.toMutableMap() // создаём новый словарь
    // который становится изменяемым

    mutableFruits["kiwi"] = 2.75 // Добавление элемента
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9)) // полностью добавляем новый словарь в наш изменяемый
    mutableFruits.remove("apple") // Удаление элемента
    mutableFruits.clear() // полностью очищаем словарь

    val containsApple = fruitsPrices.containsKey("apple") // проверяем содержание в словаре ключа
    val containsValue1_5 = fruitsPrices.containsValue(1.5) // проверяем по значению
    val isEmpty = fruitsPrices.isEmpty() // проверяем пуст ли словарь
    val isNotEmpty = fruitsPrices.isNotEmpty() // проверяем что он не пустой
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 } // проверяем все ли элементы
    // удовлетворяют условию ||
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 } // проверяем содержится хоть одно значение
    // удовлетворяющее условию &&

    val filteredByPrice = fruitsPrices.filter { it.value > 1.0 }
    val filteredByKeys = fruitsPrices.filterKeys { it.startsWith("a") }
    val filteredByValues = fruitsPrices.filterValues { it < 2.0 }
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    val increasedPrices = fruitsPrices.mapValues { it.value * 1.1 }
    // новый словарь где мы меняем значения
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    // новый словарь по ключу
    val fruitsList = fruitsPrices.map { "${it.key} costs ${it.value}" }
    // преобразуем словарь в список

    val toMap = mutableFruits.toMap() // преобразуем изменяемый в неизменяемый
    val toMutableMap = fruitsPrices.toMutableMap() // неизменяемый в изменяемый

    fruitsPrices.forEach { (fruit, price) -> // метод "для каждого"
        println("$fruit costs $price")
    }
    fruitsPrices.forEach {
        println("${it.key} costs ${it.value}") // если просто используем forEach содержит в себе it с полями key и value
    }
}