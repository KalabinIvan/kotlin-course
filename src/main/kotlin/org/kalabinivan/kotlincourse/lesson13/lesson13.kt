package org.kalabinivan.kotlincourse.lesson13

fun main() {

    val list = listOf(8, 56, 34, 67, 43, 12, 9)
    val filtered1 = filter(list)
    println(filtered1)

    val filtered2 = list.filter {it in 7..17} // Метод фильтр. It - это спец переменная
    // для обращения к переменной, этот код должен возвращать булевое значение
    println(filtered2)

    val numbers = listOf(1, -3, 4, -6, 39)
    val positiveNumbers = numbers.filter {it > 0} // закрепление фильтра
    println(positiveNumbers)

    val notPositiveNumbers = numbers.filterNot { it > 0 } // фильтр обратного действия
    println(notPositiveNumbers)

    val nullableList: List<Int?> = listOf(1, null, 2, null)
    val nonNullList: List<Int> = nullableList.filterNotNull() // фильтруем список от null
    println(nonNullList)

    val firstPositive: Int? = numbers.firstOrNull { it > 0 } // возвращаем первое же подходящее по условию число
    println(firstPositive)

    numbers[3]
    val elementOrElse = numbers.getOrElse(10) { - 1 } // поиск по индексу, но если такого количества
    // индексов нет в списке мы всё равно что-то вернём
    println(elementOrElse)

    val incrementNumbers = numbers.map { it + 1 } // преобразования коллекций
    println(incrementNumbers)

    val numbersInToString = numbers.map { "$it%" }
    println(numbersInToString)

    val numberSquareMap = numbers.associate { it to it + it } // преобразовываем коллекцию в словарь
    println(numberSquareMap)

    val multipleList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    println(multipleList)

    val flattenList = multipleList.flatten()
    println(flattenList)

    val flattenListAfterMapping = multipleList.flatMap { list1 ->
        list.map {it * 2}
    }
    println(flattenListAfterMapping)

    val numbersString = numbers.joinToString (separator = "% ") {
        "$it * $it"
    } // преобразуем список в строку
    println(numbersString)

    val sortedNumbers = numbers.sorted() // сортируем список от меньшего к большему
    println(sortedNumbers)

    val sortedDescendingNumbers = numbers.sortedDescending() // сортируем в обратную сторону
    println(sortedDescendingNumbers)

    numbers.forEach {
        println(it) // просто проходит по списку
    }

    val sumNumbers = numbers.sum() // сумма чисел
    println(sumNumbers)

    val averageOfNumbers = numbers.average() // среднее значение
    println(averageOfNumbers)

    val maxNumbers = numbers.max()
    println(maxNumbers)

    val minNumbers = numbers.min()
    println(minNumbers)

    val groupBySign = numbers.groupBy {if ( it>0) "Positive" else "Negative"} // группируем по ключу
    println(groupBySign)

    val distinctNumbers = listOf(1, 2, 2, 3, 4, 5, 6, 6, 7).distinct() // удаляем дубли
    println(distinctNumbers)

    println(numbers.take(3)) // взять определённое количество значений из списка

    println(numbers.last()) // взять последнее

    println(numbers.size) // количество элементов в списке

}

fun filter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}