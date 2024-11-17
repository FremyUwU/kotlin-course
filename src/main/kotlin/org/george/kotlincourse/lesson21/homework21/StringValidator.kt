package org.george.kotlincourse.lesson21.homework21

//Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
//Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.
class StringValidator : Validator<String?> {
    override fun check(string: String?): Boolean {
        return !string.isNullOrBlank()
    }
}