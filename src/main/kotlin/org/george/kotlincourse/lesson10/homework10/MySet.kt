package org.george.kotlincourse.lesson10.homework10

class MySet {
    fun main() {
        //Задание 1: Создание Пустого Множества
        val emptySet : Set<Int>

        //Задание 2: Создание и Инициализация Множества
        val intSet : Set<Int> = setOf(1, 2, 3)

        //Задание 3: Создание Изменяемого Множества
        val strSet : MutableSet<String> = mutableSetOf("みず", "石", "おちゃ")

        //Задание 4: Добавление Элементов в Множество
        strSet.add("すし")
        strSet.add("おちゃ")

        //Задание 5: Удаление Элементов из Множества
        val setInt : MutableSet<Int> = mutableSetOf(1, 2, 3, 15, 28)
        setInt.remove(2)

        //Задание 6: Перебор Множества в Цикле
        for (int in setInt){
            println(int)
        }

        //Задание 7: Проверка Наличия Элемента в Множестве
        fun cont(set: Set<String>, string: String) : Boolean {
            if (set.contains(string)){
                return true
            }
            else return false
        }

        //Задание 8: Объединение Двух Множеств

        //Задание 9: Нахождение Пересечения Множеств

        //Задание 10: Нахождение Разности Множеств

        //Задание 11: Конвертация Множества в Список
    }
}