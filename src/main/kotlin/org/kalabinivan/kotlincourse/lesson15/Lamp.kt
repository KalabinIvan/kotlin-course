package org.kalabinivan.kotlincourse.lesson15

class Lamp(
    private var switcher: Boolean
) {
    fun switch(){
        switcher = !switcher
        println(switcher)
    }

}