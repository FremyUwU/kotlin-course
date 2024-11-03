package org.george.kotlincourse.lesson17.homework17

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