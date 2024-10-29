package org.kalabinivan.kotlincourse.lesson15.homework

object Moon {
    private var isVisible = true

    fun showPhase(phase: String) {
        if (!isVisible)
        println("Луна не видна")
        else
        println("Текущая фаза Луны: $phase")
    }

    fun setVisible(isVisible: Boolean) {
        this.isVisible = isVisible
    }
}


