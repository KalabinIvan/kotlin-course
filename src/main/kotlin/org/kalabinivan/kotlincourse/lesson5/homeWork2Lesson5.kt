package org.kalabinivan.kotlincourse.lesson5

fun main() {
    printSoundInt(fadingKoef = 0.8)
    printSoundInt(fadingKoef = null)
    printDeliveryPrice(70.0,)
    printDeliveryPrice(null)
    printMeteoMeasurements(700)
    printMeteoMeasurements(null)


}

fun printSoundInt(SoundInt: Double = 10.0, fadingKoef: Double?){

    val defaultFadKoef = 0.5
    println(SoundInt * (fadingKoef ?: defaultFadKoef))
}

fun printDeliveryPrice (cargoCost: Double?, insuranceKoef: Double = 0.5) {
    val defaultCargoCost: Double = 50.0

    var insurance = ((cargoCost ?: defaultCargoCost) * insuranceKoef)

    println((cargoCost ?: defaultCargoCost) + insurance)
}

fun printMeteoMeasurements(atmosPress: Int?){

    println(atmosPress ?: throw Exception("measurements are not possible"))
}

// committest