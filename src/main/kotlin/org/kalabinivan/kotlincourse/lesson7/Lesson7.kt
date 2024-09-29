package org.kalabinivan.kotlincourse.lesson7

//fun main() {
//    for (i in listOf(1,2,3)) { // i - item, listOf - collection
//    // тело цикла
//    }
//}

//fun main() {
//    val e = 4
//    for (i in 1..10) { // это итерация, будет исполняться каждое значение содержащееся в коллекции
//        println(i * 4)
//    }
//}

//fun main() {
//    for (i in 1..10 step 2) { // step совершает шаг через несколько значений
//        println(i)
//    }
//}

//fun main() {
//    for (i in 1 until 10) { // исключая 10
//        println(i)
//    }
//}

//fun main() {
//    val range = 1..10
//    for (i in range)  { // включаем  цикл переменную
//        println(i)
//    }
//}

//fun main() {
//    var counter = 10
//    while (counter-- > 0) { // цикл while, выполняется только при условии, должно меняться каждую итерацию
//        println(counter) // значение булевое. Сначала иполнение проверки потом кода
//    }
//}
//
//fun main() {
//    do {
//        println("+")  // сначала исполняется код потом проверка
//    } while (false) // condition
//}

// === Операторы continue и break ===

//fun main() {
//    for (i in 1..10) {
//        if (i == 2) continue
//        if (i == 7) break
//        println(i)
//    }
//}

// === ПРАКТИКА ===

//    Отобразить цифры от 1 до 10
//fun main () {
//    for (i in 1..10){
//        println(i)
//    }

//    Написать фунцию квадраты чисел от 1 до 5

//        for (i in 1..5) {
//            println(i * i)
//        }

//    Вывести числа от 10 до 1

//    for (i in 10 downTo 1) {
//        println(i)
//    }

//    Вывести числа от 20 до 2, но только чётные числа

//    for (i in 20 downTo 2) {
//        if (i % 2 == 0){
//            println(i)
//        }
//    }

//    Вывести каждое третье число диапазона от 1 до 30

//    for (i in 1..30 step 3) {
//        println(i)
//    }

//    Цикл while который суммирует числа от 1 до 10

//    var counter = 1
//    var sum = 0
//    while (counter <= 10) {
//        sum += counter++
//    }
//    println(sum)

//    Цикл, который будет выводить в консоль количество цифр в числе в диапазоне от 100 до 1

//    var counter = 100
//    while (counter > 1) {
//        println(counter--.toString().length)
//    }
//
//
//}