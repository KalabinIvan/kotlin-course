package org.kalabinivan.kotlincourse.lesson17.homework

open class GeometricFigures (
        val name: String,
        val color: String
    ) {
        open fun area(): Double {
            return 0.0
        }

        open fun perimeter(): Double {
            return 0.0
        }


    open class Polygon(
        name: String,
        color: String,
        val numberOfSides: Int,
        val sideLengths: List<Double>
    ) : GeometricFigures(name, color) {
        fun totalSideLength(): Double {
            return sideLengths.sum()
        }
    }

    class Circle(
        color: String,
        val radius: Double,
        val thickness: Double
    ) : GeometricFigures("Circle", color) {

        override fun area(): Double {
            return Math.PI * radius * radius
        }

        override fun perimeter(): Double {
            return 2 * Math.PI * radius
        }
    }

    class Triangle(
        color: String,
        val sideA: Double,
        val sideB: Double,
        val sideC: Double,
        val height: Double
    ) : Polygon("Triangle", color, 3, listOf(sideA, sideB, sideC)) {

        override fun area(): Double {
            return 0.5 * sideA * height
        }
    }

    class Quadrangle(
        color: String,
        val sideA: Double,
        val sideB: Double,
        val sideC: Double,
        val sideD: Double,
        val diagonal: Double
    ) : Polygon("Quadrangle", color, 4, listOf(sideA, sideB, sideC, sideD)) {

        override fun area(): Double {
            return (sideA + sideC) * (sideB + sideD) / 4
        }
    }
}