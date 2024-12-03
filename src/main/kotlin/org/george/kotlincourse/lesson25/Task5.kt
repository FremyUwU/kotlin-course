package org.george.kotlincourse.lesson25

//Задание 5. Создай функцию расширение списка чисел, которая будет возвращать список уникальных чисел (без дубликатов).
//Создай аналогичную анонимную функцию.
//Создай аналогичное лямбда выражение с указанием типа.
//Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных.
fun main() {
    val uniqueNums0 = fun List<Int>.() : List<Int> {
        return this.toSet().toList()
    }
    val uniqueNums1 : List<Int>.() -> List<Int> = {
        this.toSet().toList()
    }
    val list0 = listOf(1, 2, 3, 2, 5)
    val list1 = listOf(1, -1, 3, 1, 4)
    println(list0.uniqueNums1())
    println(list1.uniqueNums1())

}
fun List<Int>.uniqueNums() : List<Int> {
    return this.toSet().toList()
}