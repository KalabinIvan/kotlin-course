package org.kalabinivan.kotlincourse.lesson17.homework

open class Furniture (
    val material: String,
    val color: String
)

open class Table(
    material: String,
    color: String,
    val shape: String
) : Furniture(material, color)

open class Chair(
    material: String,
    color: String,
    val hasArmrests: Boolean = false
) : Furniture(material, color)

class WritingTable(
    material: String,
    color: String,
    val hasDrawers: Boolean = true, shape: String
) : Table(material, color, shape)


class DiningTable(
    material: String,
    color: String,
    val seats: Int = 4, shape: String
) : Table(material, color, shape)

class OfficeChair(
    material: String,
    color: String,
    val hasWheels:
    Boolean = true
) : Chair(material, color)

class KitchenChair(
    material: String,
    color: String
) : Chair(material, color)


