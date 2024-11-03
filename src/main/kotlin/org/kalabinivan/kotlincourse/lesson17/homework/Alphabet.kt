package org.kalabinivan.kotlincourse.lesson17.homework

class Alphabet : Materials() {

    fun alphabet(material: String) {
        val currentMaterials = extractMaterial().toMutableList()
        currentMaterials.add(material)
        currentMaterials.sort()
        currentMaterials.forEach { addMaterial(it) }
    }
}