package org.kalabinivan.kotlincourse.lesson17.homework

open class Education (
        val name: String,
        val location: String)
    {
        open fun getInfo(): String {
            return "$name, расположено в $location"
        }


    open class School(
        name: String,
        location: String,
        val numStudents: Int)
        : Education(name, location)

    class University(
        name: String,
        location: String,
        val numDepartments: Int)
        : Education(name, location)


    class ElementarySchool(
        name: String,
        location: String,
        numStudents: Int,
        val hasPlayground: Boolean = true)
        : School(name, location, numStudents)


    class HighSchool(
        name: String,
        location: String,
        numStudents: Int,
        val hasLab: Boolean = true)
        : School(name, location, numStudents)
}