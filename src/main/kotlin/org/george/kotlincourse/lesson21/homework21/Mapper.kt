package org.george.kotlincourse.lesson21.homework21

//Создайте интерфейс Mapper<T, R>,
// который будет определять метод для преобразования элементов типа T в элементы типа R.
// Реализуй этот метод в классе PhrasesToListOfStrings с аналогичной механикой.
interface Mapper<T, R> {
    fun transform(elem: T): R

    fun transformList(list: List<T>): List<R>
}