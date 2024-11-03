package org.kalabinivan.kotlincourse.lesson18.homework

fun main(){
    val animals = listOf(Dog(), Cat(), Bird())
    for (i in animals.indices) {
        animals[i].makeSound()
    }

    val shapes = listOf(Circle(2.5), Square(4.0), Triangle(3.6, 6.7,))
    for (shape in shapes.indices) {
        println(shapes[shape].area())
    }

    val text = "Плачет чёрным дождём моё чёрное небо"
    val laserPrinter = LaserPrinter()
    laserPrinter.print(text)

    val inkjetPrinter = InkjetPrinter()
    inkjetPrinter.print(text)

    val cart = Cart()
    cart.addToCart(1)
    cart.addToCart(2, 3)
    cart.addToCart(mapOf(1 to 2, 3 to 4))
    cart.addToCart(listOf(1, 2, 4))
    println(cart.toString())

}