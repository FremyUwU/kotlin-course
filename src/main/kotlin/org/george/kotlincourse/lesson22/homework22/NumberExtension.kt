package org.george.kotlincourse.lesson22.homework22

import kotlin.math.absoluteValue

// Реализуйте метод расширения within для класса Number, который проверяет, что текущее число отклоняется
// от эталонного не более допустимого значения. Метод принимает два параметра: other — число для сравнения
// и deviation — максимально допустимое отклонение. Метод должен возвращать true,
// если разница между текущим числом и числом для сравнения не превышает заданное отклонение.
// Протестируйте функцию на разных типах чисел.
// Для получения отклонения, у разницы чисел нужно вызвать свойство absoluteValue.

fun Number.within(other: Number, deviation: Int): Boolean {
    return (this.toDouble() - other.toDouble()).absoluteValue <= deviation.toDouble()
}