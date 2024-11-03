package org.kalabinivan.kotlincourse.lesson17.homework

fun main () {

    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val bottomContainer = ToBottom()
    ordinalNumbers.forEach { bottomContainer.addMaterial(it) }
    bottomContainer.addMaterialToBottom("ДНООООО!")
    bottomContainer.printContainer()

    val listContainer = MaterialsList()
    ordinalNumbers.forEach { listContainer.addMaterial(it) }
    val list = listOf("первый", "второй", "третий")
    listContainer.insertList(list)
    listContainer.printContainer()

    val alphabetContainer = Alphabet()
    ordinalNumbers.forEach { alphabetContainer.addMaterial(it) }
    alphabetContainer.alphabet("geeeetenth")
    alphabetContainer.printContainer()

}
