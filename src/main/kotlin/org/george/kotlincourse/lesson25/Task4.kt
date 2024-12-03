package org.george.kotlincourse.lesson25

//Задание 4. Создай функцию, которая принимает большое число и возвращает сумму цифр этого числа.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
//Подсказка: для парсинга строки “3” в число 3 можно использовать “3”.digitToInt()
fun main() {
    val num = 1234567892695236379L

    val parseSum0 = fun(num : Long) : Int {
        return (num.toString().map { it.digitToInt() }.sum())
    }
    val parseSum1 : (num:Long)-> Int = {it ->
        (num.toString().map { it.digitToInt() }.sum())
    }
    val parseSum2 = {num:Long -> Int
        (num.toString().map {it.digitToInt()}.sum())}
    println(parseSum(num))
    println(parseSum0(num))
    println(parseSum1(num))
    println(parseSum2(num))
}
fun parseSum(num: Long) : Int {
    return (num.toString().map { it.digitToInt() }.sum())
}