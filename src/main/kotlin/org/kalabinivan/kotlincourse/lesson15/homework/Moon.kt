package org.kalabinivan.kotlincourse.lesson15.homework

object Moon {
    var isVisible = true
//    private var phase: List<String> = listOf("New Moon",
//        "Waxing Crescent",
//        "First Quarter",
//        "Waxing Gibbous",
//        "Full Moon",
//        "Waning Gibbous",
//        "Third Quarter",
//        "Waning Crescent"
//        )
    var phase: String = ""

    fun showPhase() {
        if (!isVisible)
        println("Луна не видна")
        else
        println("Текущая фаза Луны: $phase")

    }
}


