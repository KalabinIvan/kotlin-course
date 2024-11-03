package org.kalabinivan.kotlincourse.lesson18.homework

class Cat : Animal() {
    override fun makeSound() {
        printColored("Meow!", Color.YELLOW, Background.BLACK)
    }
}