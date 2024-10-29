package org.kalabinivan.kotlincourse.lesson15.homework

class Event(
    val band: String,
    val place: String,
    val price: Double,
    val hallCapacity: Int,
    private var soldTickets: Int
    ) {

    fun eventInfo() {
        println("This Sunday, a concert by the $band will take place at the $place concert hall, which has a capacity of $hallCapacity people. The ticket price is $price rubles.")
    }

    fun buyTicket(buy: Boolean) {
        if (buy) {
            soldTickets += 1
        }
        println(soldTickets)
    }

}

