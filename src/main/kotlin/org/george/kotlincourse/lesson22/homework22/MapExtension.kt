package org.george.kotlincourse.lesson22.homework22

// Реализуйте функцию-расширение для класса словаря допускающего null с ключами дженериком
// и значениями типа список из такого же дженерика, которая принимает один аргумент типа число
// и возвращает словарь допускающий null с ключами типа строка и значениями типа дженерика допускающего null.

fun <KEY> Map<KEY, Int>.funD(num: Int): Map<String, KEY?>? {
    return this.toMap() as Map<String, KEY?>?
}