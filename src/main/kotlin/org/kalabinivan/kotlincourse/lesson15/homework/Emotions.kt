package org.kalabinivan.kotlincourse.lesson15.homework

class Emotions(
    val type: String,
    val intensity: Int
) {
    fun express() {
        if(type == "Радость")
              when (intensity) {
                 in 0..10 -> println("Радость")
                  in 10 .. 20 -> println("Счастье")
                  in 20..30 -> println("Восторг")
                 else -> println("Incorrect data")
             }
        if(type == "Грусть")
             when (intensity) {
                in 0..10 -> println("Грусть")
                in 10 .. 20 -> println("Печаль")
                in 20..30 -> println("Уныние")
                else -> println("Incorrect data")
            }
        if(type == "Злость")
             when (intensity) {
                in 0..10 -> println("Злость")
                in 10 .. 20 -> println("Раздражение")
                in 20..30 -> println("Ярость")
                else -> println("Incorrect data")
            }
    }
}