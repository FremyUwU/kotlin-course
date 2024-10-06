package org.george.kotlincourse.lesson10.homework10

class MyList {
    fun main() {

        //Задание 1: Создание Пустого Списка
        val readableOnlyList : List<Int> = listOf()

        //Задание 2: Создание и Инициализация Списка
        val readableOnlyList2 : List<String> = listOf("Praise", "the", "sun")

        //Задание 3: Создание Изменяемого Списка
        val listInt : MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

        //Задание 4: Добавление Элементов в Список
        val myMutableList : MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
        myMutableList.add(6)
        myMutableList.add(7)
        myMutableList.add(8)

        //Задание 5: Удаление Элементов из Списка
        val stringMutableList : MutableList<String> = mutableListOf("Save", "the", "world,", "Luke")
        stringMutableList.remove("world,")

        //Задание 6: Перебор Списка в Цикле
        val intList : List<Int> = listOf(1, 2, 3, 4, 17)
        for (i in 0 until intList.size){
            println(intList.get(i))
        }
        //Задание 7: Получение Элементов Списка по Индексу
        val stringList : List<String> = listOf("кукумбер", "Бикукле", "Лангуаге")
            stringList.get(1)

        //Задание 8: Перезапись Элементов Списка по Индексу

        //Задание 9: Объединение Двух Списков

        //Задание 10: Нахождение Минимального/Максимального Элемента

        //Задание 11: Фильтрация Списка

    }
}