package org.kalabinivan.kotlincourse.lesson15

class Person(
    val name: String, // поля класса, вся эта "Конструкция" называется конструктором класса
    val age: Int
) {

    // Метод класса
    fun sayHello() {
        println("Hello, my name is $name and i am $age years old.")
    }


}