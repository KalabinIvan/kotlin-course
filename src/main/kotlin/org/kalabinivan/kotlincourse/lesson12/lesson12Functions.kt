package org.kalabinivan.kotlincourse.lesson12

fun main() {

//    sayHello()
//    greetUser("Ivan")
//    sum(1,2)
//    printSum(1,2)
//    println(multiply(2,2))
//    println(sum1(3.0, 3.0, true))
//    println(getMax(8, 6))
//    val stroki = mutableListOf("ger", "ber")
//    replayString(stroki, "ge")
//    println(stroki)
    printMap(12, -15)
}

//fun nameFun(arguments): TypeReturnedValue {
//    body
//    return value // прекращает выполнение функции
//}

fun sayHello() {
    println("Hello World") // функция без аргументов
}

fun greetUser(name: String) {
    println("Hello, $name!") // функция с аргументом
}

fun sum(a: Int, b: Int): Int {
    return a + b // функция с несколькими аргументами, используем возврат данных
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}") // функция которая ничего не возвращает, помещаем аргументы в тело функции
}

fun multiply(a: Int, b: Int) = a * b // такой тип написания предусматривается, если всего одна строчка кода,
// если мы тип не указываем тип рассчитывается автоматически

    // === МОДИФИКАТОРЫ ДОСТУПА ===

private fun calculateDiscount(price: Double): Double {
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun max(a:Int, b: Int): Int {
    return if (a > b) a else b
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
        println(number)
    }
    println("Value not found")
}

// не принимает аргументов не возвращает значений
fun doSomething() {

}

// не принимает аргуменитов и возвращает строку

fun getUserName(): String {
    return ""
}

// принимает строковый аргумент, но не возвращает значение

fun getGreeting(greet: String) {

}

fun doubleRet(a: Double, b: Double): Double {
    return 9.0
}

fun intRet(c: Int): Int{
    return 6
}

fun isNullOr(what: String?): Boolean {
    return true
}

fun calculateDiscount1(items: List<String>, f: Int?): Double? {
    return null
}

fun sum1(e: Double, f: Double, flag: Boolean): Double {
    return if(!flag){
        e - f
    } else {
        e + f
    }
}

fun getMax(a: Int, b: Int) = if (a > b) a else b

fun printPositNumbers(a: List<Int>){
    for(i in a){
        if (i > 0){
            println(i)
        } else return
    }
    println("конец")
}

fun replayString(strings: MutableList<String>, str: String) {
    for(i in strings.indices){
        if (strings[i] == str){
            strings[i] = str.uppercase()
            return
        }
    }
    println("Нет тут такого")
}
private fun checkSize(xy: Int, result: String) {
    if (xy == 0) throw IllegalArgumentException("$result не должно быть равным нулю")
}

private fun createRange(size: Int,): IntProgression {
    return if (size > 0) {
        0..size
    } else {
        0 downTo size
    }
}


fun printMap(xSize: Int, ySize: Int) {
    checkSize(xSize, "xSize")
    checkSize(ySize, "ySize")
    val formatterSize = " $xSize".length

    val xRange = createRange(xSize)
    val yRange = createRange(ySize)

    print(" ".repeat(formatterSize))

    for (i in xRange) {
        print("%${formatterSize}s".format(i))
    }
    println()
    for (i in yRange) {
        print("%${formatterSize}s".format(i))
        for (j in yRange) {
            val m = i * j
            val result = when {
                m % 2 == 0 -> if (m % 3 == 0) "." else "*"
                m % 5 == 0 -> if (i < 0) "-" else "+"
                else -> "?"
            }
            print("%${formatterSize}s".format(result))
        }
        println()
    }
}
