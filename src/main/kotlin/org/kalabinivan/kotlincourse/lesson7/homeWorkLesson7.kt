package org.kalabinivan.kotlincourse.lesson7

fun main() {
//    Напишите цикл for, который выводит числа от 1 до 5.

    for (i in 1..5)
        print("$i ")
    println()

//    Напишите цикл for, который выводит четные числа от 1 до 10.

    for (i2 in 1..10) {
        if (i2 % 2 == 0)
            print("$i2 ")
    }
    println()

//    Создайте цикл for, который выводит числа от 5 до 1.

    for (i3 in 5 downTo 1) {
        print("$i3 ")
    }
    println()

//    Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.

    for (i4 in 10 downTo 1) {
        var result1 = i4 - 2
        print("$result1 ")

    }
    println()

//    Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.

    for (i5 in 1..20 step 3) {
        print("$i5 ")
    }
    println()

//    Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).

    for (i6 in 1 until 9) {
        print("$i6 ")
    }
    println()


//    Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.

    for (i7 in 3 until 15) {
        print("$i7 ")
    }
    println()

//    Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var counter = 0
    while (counter++ < 5){
        var result2 = counter * counter
        print("$result2 ")
    }
    println()

//    Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var counter1 = 10
    while (counter1-- >= 5){
        if (counter1 == 5){
            print("$counter1 ")
        }
    }
    println()

//    Используйте цикл do...while, чтобы вывести числа от 5 до 1.
    var counter2 = 5
    do {
        print("$counter2 ")
    } while (counter2-- > 1)
    println()

//    Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
    var counter3 = 5
    do {
        var result3 = counter3++
        print("$result3 ")
    } while (counter3 < 10)
    println()

//    Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i8 in 1..10){
        if (i8 > 6) break
        print("$i8 ")
    }
    println()

//    Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var counter4 = 1
    while (counter4 > 0){
        if (counter4 > 10) break
        val result4 = counter4++
        print("$result4 ")
    }
    println()

//    В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i9 in 1..10){
        if (i9 % 2 == 0) continue
        print("$i9 ")
    }
    println()

//    Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var counter5 = 0
    while (++counter5 <=10){
        if (counter5 % 3 == 0) continue
        print("$counter5 ")
    }
    println()
    println()

//Создать цикл в цикле, в каждом использовать диапазон от 1 до 10. В консоль вывести результат умножения переменных цикла.
// Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
// После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки. Результат должен быть как на картинке.

    var counter6 = 0
    while (++counter6 <= 10){
        for (counter7 in 1..10){
            print(counter6 * counter7)
            print (" ")
        }
        println()
    }
}


