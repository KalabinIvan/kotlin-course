package org.kalabinivan.kotlincourse.lesson19.practice

class Atm(
    private var balance: Float = 0.0f
) {

    private var pin = "1111"

    private fun checkPin(pin: String) {
        if (pin != this.pin) throw Exception("Wrong Pin")
    }

    fun deposit(amount: Float, pin: String) {
        checkPin(pin)
    }

    fun withdraw(amount: Float, pin: String) {
        checkPin(pin)
    }

    fun getBalance(pin: String): Float {
        checkPin(pin)
        return balance
    }
}