package org.kalabinivan.kotlincourse.lesson8

fun main() {
//    val simpleString = "Это простая строка"
//
//    val firstName = "Ivan"
//    val lastName = "Kalabin"
//    val fullName = firstName + " " + lastName // конкатинация, неоптимальный вариант, лучше переделать в шаблон
//
//    println(fullName)
//    println()
//
//    val age = 30
//    val greeting = "Hi my name is $firstName, and i'm $age years old" // использование шаблонов $(переменная)
//
//    println(greeting)
//    println()
//
//    val person = Person("Иван", 32) // класс, будем изучать позже
//    val introduction = "Меня зовут ${person.name}, и мне ${person.age} года" // данные выгружаются из класса
//
//    println(introduction)
//    println()
//
//     val details = "Здесь находятся ${getDetails()}" // подгружаем данные из функции
//
//    println(details)
//    println()
//
//    val x = 10
//    val y = 20
//    val resultString = "Результат сложения x и y равен ${x + y}" //внедряем в строку код
//    println(resultString)
//    println()
//
//}
//class Person(val name: String, val age: Int)
//
//fun getDetails(): String{
//    return "Очень интересные детали"

    val originalString = "Kotlin is Fun"
//    val subString = originalString.substring(7) // выводим строку с определенного места
//    val subString2 = originalString.substring(3,6) // вырезаем кусок из строки в строке
//    val replaceString = originalString.replace("Fun","Awesome") // замена значений в строке
    val splitWords = originalString.split(" ") // создание списка объектов разбивая на разделители
//    val length = "Hello".length // определяем длину слова (количество символов в строке)
//    val upper = "hello".uppercase() // переводим сроку в верхний регистр
//    val lower = "HELLO".lowercase() // переводим в нижний регистр
//    val trimmed = " Hello ".trim() // обрезаем все пробелы (можно вырезать любые символы из строки, через запятую
////    все предыдущие методы выполняют действия со строкой следующий будет выполнять проверку
//    val starts = "Kotlin".startsWith("Kot") // проверяет, начинается ли строка с этих самых символов
//    val ends = "Kotlin".endsWith("Kot") // проверяет, кончается ли строка с этих символов
//    val contains = "Kotlin".contains("otl") // проверка содержит ли в себе
//    val e: String? = null
//    val empty = e.isNullOrEmpty() // проверяем пустая строка или Null
//    val blank = "  ".isNullOrBlank() // проверяем есть ли значимые символы в строке
//    val repeat = "ab".repeat(3) // требуем повторить строку несколько раз
//    val letter = originalString[5] // вывести определенное место в строке по индексу. Используется [ ]
//    var indexOfChar = "Kotlin".indexOf('t') // узнаем индекс символа
//    var indexOfWord = "Kotlin is the best language".indexOf("best") //показывает с какого индекса начинает определенное место в строке
//    val backReverse = "niltoK".reversed() // разворачиваем строку
//    val multiLineString = """
//                Первая строка
//                Вторая строка
//                Третья строка
//    """.trimIndent() // удалит пробелы созданные кодом и выведет без них, пробелы созданные программистом останутся
//    val string = "Sweet summer child"
//    val subString3 = string.substring(6) // вывести со старта индекса
//    val subString4= string.substring(6, 12) // вывести с одного индекса по другому индексу
//
//    println(subString)
//    println(subString2)
//    println(replaceString)
    println(splitWords)
//    println(words.joinToString("\n")) // демонстирируем что создан список. "/n" - перенос строки
//    println(length)
//    println(upper)
//    println(lower)
//    println(trimmed)
//    println(starts)
//    println(ends)
//    println(contains)
//    println(empty)
//    println(blank)
//    println(repeat)
//    println(letter)
//    println(indexOfChar)
//    println(indexOfWord)
//    println(backReverse)
//    println(multiLineString)
//    println(subString3)
//    println(subString4)

//    === ФОРМАТИРОВАНИЕ СТРОК ===

//    val name = "Иван"
//    val city = "Санкт - Петербург"
//    val age = 32
//    val friendsCount = 1052
//    val rating = 4.948
//    val balance = 2534.75856
//    val text = """
//        Имя: %s
//        Город: %s
//        Возраст: %d
//        Количество друзей: %,d
//        Рейтинг пользователя: %.1f
//        Баланс счёта: $%,.2f
//    """.trimIndent()
//    println(text.format(name, city, age, friendsCount, rating, balance)) // форматирование текста зависимое от специальных заглушек встроенных в строку.
//
////    %s - string; 5d - целое число; %,d - отделить тысячи в числе; %.1f - флоат, выводить только один символ после запятой;
////    %,.2f - флоат, делим на тысячи и указываем количество знаков после запятой. см. шпаргалку №1
//


}