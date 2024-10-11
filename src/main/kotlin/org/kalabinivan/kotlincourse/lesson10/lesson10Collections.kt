package org.kalabinivan.kotlincourse.lesson10

fun main(){

//  === COLLECTIONS ===

//    === MASSIVES ===
//    не могут быть не изменяемыми

    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5) // класс для массивов "Array", тип данных указывается в "< >"(дженерики - типизация объектов массива)

    val doubles = doubleArrayOf(1.1, 1.2, 1.3) // тип указывать дополнительно не нужно, потому что уже указано

    val emptyArray = Array(5) {" "}// пустой массив, пустой массив, но в него нужно добавить хоть что-то. "{}" - наше первое столкновение с лямбда выражениями
    val emptyNullableArray = arrayOfNulls<Int>(5)  // спец массив в который можно не добавлять буквально ничего

//    === СПИСКИ ===
//    могут быть изменяемыми и не изменяемыми

    val readOnlyList: List<String> = listOf("a", "b", "c") // неизменяемый список "List"

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c") // изменяемый список MutableListOf (добавлять, изменять, удалять)

//    === МНОЖЕСТВА ===
//    все элементы множества должны быть уникальными

    val numbersSet: Set<Int> = setOf(1, 2, 3, 4, 5)

    val mutableNumbersSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    mutableList.add("vi") //  добавляем элемент в массив
    println(readOnlyList[1]) // поиск значения по индексу в массивах, в множествах индексов нет
//    множества можно только перебирать по очереди

    val set = setOf("K", "o", "t", "l", "i", "n")
    for (letter in set) {
        println("| $letter |") // перебор коллекции в методе for
    }

    val list = listOf(32, 53,1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`") // можно перебирать только массивы и списки
    }


//    === ПРАКТИКА ===

    val array1 = Array(10) { 0 }
    array1[0] = 10
    for (i in array1.indices){
        array1[i] = (i+1) * 10
    }
    println(array1.toList())


// Создать массив из пяти пустых строк

    val array2 = arrayOf("fg", "fkdj", "dkfj", "kjdf", "gkjg")
    for (i2 in array2.indices){
        array2[i2] = " "

    }
    println(array2.toList())

//    Сложение двух массивов

    val array3 = arrayOf(1, 2, 3)
    val array4 = arrayOf(4, 5, 6)
    val array5 = Array(3) {0}

    for (i3 in array4.indices) {
        array5[i3] = array3[i3]+array4[i3]
    }
    println(array5.toList())

//    Пустой неизменяемый список целых чисел

    val list1 = listOf<Int>()

//    Списко строк содержащий три элемента с произвольными значениями

    val list2 = listOf("fhcd","dfbv","dfdfv")

//    Пустой изменяемы список с элементами типа float

    val list3 = mutableListOf<Float>  ()

//    В созданный изменяемый список добавить какие-нибудь элементы

    val list4 = mutableListOf<Float>  ()
    list4.add(45F)
    list4.add(5767F)

//    Из предыдущего списка удалить одно из значений

    list4.remove(45F) //  метод удаления ячейки из списка
    println(list4)

//    Удалить элемент из списка по индексу

    list4.removeAt(0)
    println(list4)

//    Распечатать значение списка List2 через цикл

    for (i in list2){
        println(i)
    }

//    Пустое неизменяемое множество целых чисел

    val set1 = setOf<Int>()
    val set2 = setOf(1, 2, 3, 4, 5)
    val set3 = mutableSetOf(1, 2, 3)
    set3.add(6)
    set3.remove(2)
    println(set3)
    for (i in set2){
        println(i*i)
    }

    val set5 = setOf(1, 2, 3)
    val set6 = setOf(4, 2, 3, 8)
    val set7 = mutableSetOf<Int>()
    for (i in set5){
        set7.add(i)
    }
    for (i in set6){
        set7.add(i)
    }
    println(set7)

}

fun findNumber (set2: Set<Int> , num: Int): Boolean {
    for (i in set2) {
        if (i == num) {
            return true
        }
    }
    return false
}