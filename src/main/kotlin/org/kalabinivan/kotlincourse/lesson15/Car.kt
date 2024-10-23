package org.kalabinivan.kotlincourse.lesson15

class Car(
    val brand: String,
    val model: String

) {
    companion object{
        var brands: List<String> = listOf("BMW", "Audi", "Lada")
    }


    fun carPresentation() {
        println("I'm a $brand my model is $model")
    }
}