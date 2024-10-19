package org.kalabinivan.kotlincourse.lesson13

fun main() {

    val numbers = listOf(1, 2, 4, 5, 7)


//    если количество элементов списка больше пяти вывести список на экран

    if(numbers.size > 5){
        println(numbers)
    } else { println("Не ок")
    }

    numbers.isEmpty() // проверка пуст ли список
    numbers.isNotEmpty() // проверка наличия элементов в списке

//  Взять элемент по индексу, но если индекс больше чем индексов в списке вывести дефолтное значение

    val defaultValue = numbers.getOrElse(9) { "ЛОХ" }
    println(defaultValue)

}