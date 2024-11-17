package org.george.kotlincourse.lesson22.homework22

// Реализуйте метод расширения revert для класса Pair, который меняет местами первый и второй элементы пары.
// Метод должен возвращать новую пару с перевернутыми элементами.
// Протестируйте эту функцию на различных парах значений, в том числе null.

fun <T, R> Pair<T, R>.revert(): Pair<R, T> {
    return Pair(this.second, this.first)
}