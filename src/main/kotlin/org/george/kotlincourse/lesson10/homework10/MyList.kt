package org.george.kotlincourse.lesson10.homework10




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
        val intList2 : MutableList<Int> = mutableListOf(1, 3, 8, 27, 81)
        intList2.set(2, 9)

        //Задание 9: Объединение Двух Списков
        val strList1 : List<String> = listOf("somebody", "once")
        val strList2 : List<String> = listOf("told", "me")
        val strList3 : MutableList<String> = mutableListOf("null")

        for (i in 0 until strList1.size + strList2.size){
            for (j in 0 until strList1.size){
                strList3.set(i, strList1.get(j))
            }
            if(i >= strList1.size){
                for (j in 0 until strList2.size) {
                strList3.set(i, strList2.get(j))
                }
            }
        }

        //Задание 10: Нахождение Минимального/Максимального Элемента
        val  minmaxList : List<Int> = listOf(1, 0 ,15, -2, 17, 205, 27)
        var min : Int = minmaxList.get(0)
        var max : Int = minmaxList.get(0)
        for(i in 0 until minmaxList.size){
            if (minmaxList.get(i) < min) min = minmaxList.get(i)
            if (minmaxList.get(i) > max) max = minmaxList.get(i)
        }

        //Задание 11: Фильтрация Списка
        val evenInt = mutableListOf<Int>()
        for (i in 0 until intList.size) {
        if(intList[i] % 2 ==0) evenInt.add(intList[i])
    }

    }
