package org.kalabinivan.kotlincourse.lesson19.lesson

class Account(private var balance: Double) {

    fun deposit(amount: Double) {
        if (amount > 0) {
            balance += amount
        }
    }

    fun getBalance(): Double {
        return balance
    }
}
