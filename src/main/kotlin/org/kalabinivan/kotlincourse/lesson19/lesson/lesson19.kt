package org.kalabinivan.kotlincourse.lesson19.lesson

fun main() {
    val account = Account(0.0)
//    account.balance // нет доступа потому что переменная приватна

    account.getBalance()

    val student = Student("Ivan", 19, 3434)
    student.showAge()
}