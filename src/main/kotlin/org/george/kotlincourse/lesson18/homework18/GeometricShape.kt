package org.george.kotlincourse.lesson18.homework18

open abstract class GeometricShape {
    open fun area() : Double {
        return 0.0
    }
}
class Circle(val radius : Double) : GeometricShape() {
    override fun area(): Double {
        return Math.PI*Math.sqrt(radius)
    }
}
class Triangle(
    val side1 : Double,
    val side2 : Double,
    val angle : Double
) : GeometricShape() {
    override fun area(): Double {
        return 0.5*side1*side2*Math.sin(angle*Math.PI/180)
    }
}
class Square(val side : Double) : GeometricShape() {
    override fun area(): Double {
        return Math.sqrt(side)
    }
}
fun main() {
    val list = listOf(Circle(5.0), Triangle(3.0, 4.0, 90.0), Square(4.0))
    list.forEach { println( it.area()) }
}