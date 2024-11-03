package org.george.kotlincourse.lesson17.homework17
//Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник
open class GeometricShape(square : Int){

}
open class Polygon(
    square: Int,
    sides : Int,
    angles : Int
) : GeometricShape(square)

class Circle(
    square: Int,
    val sides : Int
) : GeometricShape(square){}

class Triangle(
    square: Int
) : Polygon(square, sides = 3, angles = 3) {

}

class Square (
    square: Int
) : Polygon (square, sides = 4, angles = 4) {

}