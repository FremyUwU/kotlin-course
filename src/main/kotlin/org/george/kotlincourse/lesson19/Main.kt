package org.george.kotlincourse.lesson19

class Main {
    fun main() {
        val childrenClass = ChildrenClass("private", "protected", "public")

        childrenClass.publicField = "Антонио Бандерас"
        childrenClass.setProtectedField("1")
        childrenClass.setPrivateField("2")

        println(childrenClass.getAll())

        childrenClass.printText()
    }
}