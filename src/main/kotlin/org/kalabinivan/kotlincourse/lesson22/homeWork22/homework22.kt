package org.kalabinivan.kotlincourse.lesson22.homeWork22

fun main(){

    val array = intArrayOf(10, 20, 30, 40)

    val result = array.firstAndLast()
    println("Первое и последнее числа: $result")

    val char1: Char? = 'A'
    val char2: Char? = null

    char1.myExtensionFunction(42, 3.14, true)
    char2.myExtensionFunction(100, 6.28, false)

    val list = mutableListOf("apple", "banana", "cherry")

    val foundElement1 = list.findElementOrNull("banana", 1)
    println(foundElement1)

    val foundElement2 = list.findElementOrNull(null, 2)
    println(foundElement2)

    val notFoundElement = list.findElementOrNull("orange", 99)
    println(notFoundElement)

    val map: Map<Int, List<String>>? = mapOf(
        1 to listOf("a", "b"),
        2 to listOf(),
        3 to listOf("c", "d", "e")
    )

    val filteredMap = map.filterBySize(2)
    println(filteredMap)

    val longValue1: Long? = 123456789L
    val formattedString1 = longValue1.toFormattedString()
    println(formattedString1)

    val longValue2: Long? = null
    val formattedString2 = longValue2.toFormattedString()
    println(formattedString2)

    val pair1 = "Hello" to 42
    println(pair1.revert())

    val pair2 = "World" to null
    println(pair2.revert())

    val pair3 = 7 to 9.8
    println(pair3.revert())

    val pair4: Pair<Int?, String> = null to "Test"
    println(pair4.revert().let { "${it.first}, ${it.second}" })

    val number1 = 10.0
    val comparison1 = number1.within(12.0, 2.0)
    println(comparison1)

    val number2 = 15
    val comparison2 = number2.within(13, 3)
    println(comparison2)

    val number3 = 5.5f
    val comparison3 = number3.within(6.0f, 1.0f)
    println(comparison3)

    val number4 = 20L
    val comparison4 = number4.within(25L, 10L)
    println(comparison4)

}