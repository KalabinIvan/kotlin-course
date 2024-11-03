package org.kalabinivan.kotlincourse.lesson18.homework

class Dog : Animal() {
    override fun makeSound() {
        printColored("Bark!", Color.RED, Background.BLACK)
    }
}