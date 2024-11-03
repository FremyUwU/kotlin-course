package org.george.kotlincourse.lesson18.homework18

open class Animal {
    open fun makeSound(){
        println("This animal makes no sound.")
    }
}
class Dog() : Animal() {
    override fun makeSound(){
        println("Bark")
    }
}
class Bird() : Animal() {
    override fun makeSound(){
        println("Tweet")
    }
}
class Cat() : Animal() {
    override fun makeSound(){
        println("Meow")
    }
}
fun main() {
    val list : List<Animal> = mutableListOf(Dog(), Bird(), Cat())
    list.forEach{it.makeSound()}
}