package org.george.kotlincourse.lesson25

fun main() {
    //Задание 2. Создай функцию, которая принимает список чисел и возвращает среднее арифметическое этого списка. С помощью require проверь, что список не пустой.
    //Создай аналогичную анонимную функцию.
    //Создай аналогичное лямбда выражение с указанием типа.
    //Создай лямбда выражение без указания типа.
    //Проверь, что лямбда выражение работает правильно с помощью нескольких наборов данных (в том числе пустого).

    val average0 = fun(list: List<Double>) : Double {
        require(list.isNotEmpty())
        return list.sum() / list.size
    }
    val average1 : (List<Double>) -> Double = {
        require(it.isNotEmpty())
        it.sum() / it.size
    }
    val average2 = {list: List<Double> -> Double
    require(list.isNotEmpty())
    list.sum() / list.size
    }

    println(average1(listOf()))
    println(average1(listOf(1.0, 2.0, 3.0)))
    println(average2(listOf()))
    println(average2(listOf(2.0, 3.5, 0.85)))

}
fun average(list: List<Double>) : Double {
    require(list.isNotEmpty())
    return list.sum() / list.size
}