package org.kalabinivan.kotlincourse.lesson3

val name: String = "Alice" // String строка

var age: Double = 30.0 //int integer - целочисленное

const val PI: Double = 3.14 // const - константа, неизменяемое значение

lateinit var userinfo: String // переменная для отложенной инициализации переменной, может быть только var

val lazyValue: String by lazy { // отложенная инициализация, пока мы не обратимся к этой переменной, экономия ресурсов
    "Hello? this is a lazy string!"
}

var speed: Double? = null // вопросительный знак означает, что переменная может быть null

var count: Int = 0
    get () = field // сразу отдать значение, отдается через слово field (содержимое переменной)
    set (value) { // установить значение переменной count
        if (value >= 0) field = value
    }

// ПРАКТИКА!!!

val chassys: String = "12345ABC" //уникальный код для обозначение шасси автомобиля (никогда не поменяется)

var colour: String = "Blue" // цвет автомобиля (изменяемое значение)

var distance: Double = 0.0 // пробег автомобиля (изменяемое значение, дробное число)

lateinit var owner: String  // владелец автомобиля (имени мы пока не знаем, но переменная понадобится когда авто приобретут)

const val WHEELS: Int = 4 // количество колёс (скорее всего никогда не изменится)

val report: String by lazy {
    "Report"
} // финальный отчёт перед утилизацией, не понадобится в ближайшее время

var fuel: Double = 0.0
    get () = field
    set (value) {
        if (value >0) field += value
    }