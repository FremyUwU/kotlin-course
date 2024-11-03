package org.george.kotlincourse.lesson17.homework17

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