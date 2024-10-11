package org.kalabinivan.kotlincourse.lesson8

fun main() {

//    Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
//    делая текст более ироничным или забавным.
//    Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу. +++

    println(textRedactor("Спать на потолке невозможно"))
    println()
    println("Задание 2")
    println(date)
    println(time)
    println()
    println("Задание 2")
    println("**** **** **** $lastFour")
    println()
    println("Задание 3")
    println(emailFormat)
    println()
    println("Задание 4")
    println(fileName)
    println()
    println("Задание 5")
    println(abbreviation("the last of us"))



}

fun textRedactor(phrase: String): String {

    val but = ", но моя интуиция говорит об обратном"
    val sometimes = "Иногда,"
    val butNotAlways = ", но не всегда"
    return when {
        phrase.contains("невозможно") -> phrase.replace("невозможно", "совершенно точно возможно, просто требует времени", true)
        phrase.startsWith("Я не уверен", true) -> "$phrase$but"
        phrase.contains("катастрофа") -> phrase.replace("катастрофа", "интересное событие", true)
        phrase.endsWith("без проблем") -> phrase.replace("без проблем", "с парой интересных вызовов на пути", true)
        !phrase.contains(" ") ->  "$sometimes $phrase$butNotAlways"
        else -> ""
    }
}


// === ЗАДАНИЕ 1 ===
//    Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//    Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
//    Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

val logLine = "Пользователь вошел в систему -> 2021-12-01 09:48:23"
val date = logLine.substring(32, 42)
val time = logLine.substring(43, 51)


// === ЗАДАНИЕ 2 ===
//    Маскирование Личных Данных
//    Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
//    Замаскируйте все цифры, кроме последних четырех, символами "*".

val creditCard = "4539 1488 0343 6467"
val lastFour = creditCard.substring(15)

// === ЗАДАНИЕ 3 ===
//Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com". Преобразуйте его в строку "username [at] example [dot] com".

val email = "username@example.com"
val emailFormat = email.replace("@", " [at] ").replace(".", " [dot] ")

// === ЗАДАНИЕ 4 ===
//Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt". Извлеките название файла с расширением.

val filePath = "C:/Пользователи/Документы/report.txt"
val fileName = filePath.substring(26)

// === ЗАДАНИЕ 5 ===
//Создание Аббревиатуры из Фразы. Используй split с набором символов для разделения.
//Используй for для перебора слов. Используй var переменную для накопления первых букв.
//Описание: У вас есть фраза, например "Объектно-ориентированное программирование". Создайте аббревиатуру из начальных букв слов (например, "ООП").

fun abbreviation(fewWords: String): String {
    val splitFewWords = fewWords.split(" ", "-")

    for (words in splitFewWords) {
        val firstLetter = words[0].uppercase()
        print(firstLetter)
    }
    return ""
}






