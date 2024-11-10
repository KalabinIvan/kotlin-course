package org.kalabinivan.kotlincourse.lesson19.lesson

open class Person(private val name: String, protected val age: Int){

    // публичный метод
    fun greet() {
        println("Привет меня зовут $name")
    }

    // защищенный метод
    protected fun getName() : String {
        return name
    }

    // приватный метод
    private fun secret() {
        println("$name ест козявки")
    }
}