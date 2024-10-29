package org.kalabinivan.kotlincourse.lesson15.homework

class Party(
    val location: String,
    val attendees: Int
) {
    fun details() {
        println("Welcome to party! Today in $location! Besides you there will be at least $attendees attendees! ")
    }
}