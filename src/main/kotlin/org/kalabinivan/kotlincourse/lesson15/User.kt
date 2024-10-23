package org.kalabinivan.kotlincourse.lesson15

data class User(val id: Int, val name: String) // нужна только для хранения данных
// может хранить в себе несколько методов для работы с данными

fun main() {
    val user1 = User(1, "Alice")
    val user2 = user1.copy(name = "Bob")

    println(user1.toString())
    println(user2)

}