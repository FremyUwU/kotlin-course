package org.george.kotlincourse.lesson17

class Homework17 {
}
// Задание 1

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
//Учебные Заведения
//Базовый класс: Учебное Заведение
//Производные классы: Школа, Университет
//Дополнительное разветвление для Университет: факультет биологии, факультет математики
open class EducationalInstitution (
    numberOfTeachers : Int,
    numberOfStudents : Int
)
class School(
    numberOfTeachers: Int,
    numberOfStudents: Int,
    numberOfClasses : Int
) : EducationalInstitution(numberOfTeachers, numberOfStudents){

}
open class University(
    numberOfTeachers: Int,
    numberOfStudents: Int,
    numberOfCourses : Int
) : EducationalInstitution(numberOfTeachers, numberOfStudents){

}
class FacultyOfBiology(
    numberOfTeachers: Int,
    numberOfStudents: Int,
    numberOfCourses: Int,
    numberOfLaboratories : Int
) : University(numberOfTeachers, numberOfStudents, numberOfCourses) {
    fun study() {
        println("Учим биологию, проходим полевую практику")
    }
}

class FacultyOfMathematics (
    numberOfTeachers: Int,
    numberOfStudents: Int,
    numberOfCourses: Int
) : University(numberOfTeachers, numberOfStudents, numberOfCourses){
    fun study() {
        println("Учим математику")
    }
}
//Иерархия Мебели
//Базовый класс: Мебель
//Производные классы: …
//Дополнительное разветвление для …: …
open class Furniture(
    weight : Int,
    price : Int
) {

}
class KitchenFurniture(
    weight: Int,
    price: Int
) : Furniture(weight, price){

}
open class LivingRoomFurniture(
    weight: Int,
    price: Int
) : Furniture (weight, price) {

}
class Chair(
    weight: Int,
    price: Int,
) : LivingRoomFurniture (weight, price) {
    fun sit() {
        println("Сижу в кресле")
    }
}
class Sofa(
    weight: Int,
    price: Int
) : LivingRoomFurniture (weight, price){
    fun sit() {
        println("Сижу на диване")
    }
}

//Задание 2

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

class ExtractFirst(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        extracted.toString()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 1 until extracted.size) {
            addMaterial(extracted[i])
        }
        return extracted[0]
    }
}

class ExtractLast(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        for (i in 0 until extracted.size - 1) {
            addMaterial(extracted[i])
        }
        return extracted.last()
    }
}

class ExtractMiddle(): Materials() {
    fun extract(): String {
        val extracted = extractMaterial()
        if (extracted.isEmpty()) {
            return ""
        }
        if (extracted.size == 1) {
            return extracted[0]
        }
        val middleIndex = extracted.size / 2
        for (i in extracted.indices) {
            if (i == middleIndex) continue
            addMaterial(extracted[i])
        }
        return extracted[middleIndex]
    }
}
fun main() {
    val ordinalNumbers = listOf(
        "first", "second", "third", "fourth", "fifth",
        "sixth", "seventh", "eighth", "ninth", "tenth",
        "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
        "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
    )

    val m1 = ExtractMiddle()
    ordinalNumbers.forEach { m1.addMaterial(it) }
    println(m1.extract())
    m1.printContainer()


}

