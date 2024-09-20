package org.kalabinivan.kotlincourse.lesson5

fun main() {
    printSoundInt(fadingKoef = 0.8)
    printSoundInt(fadingKoef = null)
    printDeliveryPrice(100.0)
    printDeliveryPrice(null)
    printMeteoMeasurements(700)
    printMeteoMeasurements(null)


}

fun printSoundInt(soundInt: Double = 10.0, fadingKoef: Double?){

    val defaultFadKoef = 0.005
    println(soundInt * (fadingKoef ?: defaultFadKoef))
}

fun printDeliveryPrice (cargoCost: Double?, insuranceKoef: Double = 0.005) {
    val defaultCargoCost = 50.0

    val insurance = ((cargoCost ?: defaultCargoCost) * insuranceKoef)

    println((cargoCost ?: defaultCargoCost) + insurance)
}

fun printMeteoMeasurements(atmosPress: Int?){

    println(atmosPress ?: throw Exception("measurements are not possible"))
}

// committest