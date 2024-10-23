package org.kalabinivan.kotlincourse.lesson15

fun main() {
    val person = Person(
        "Ivan",
        32
    )
    person.sayHello()

    Logger.setData(5)
    Logger.log("fgf")

    Calculator.add(1, 4)
    Calculator.VERSION

    val lamp = Lamp(
        true
    )
    lamp.switch()

    val wind = Wind(10)
    println(wind.convertSpeed())

    val car = Car(Car.brands[2], "Kalina")
    car.carPresentation()

}


