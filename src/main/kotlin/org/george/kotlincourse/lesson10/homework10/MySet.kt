package org.george.kotlincourse.lesson10.homework10

    fun main() {
        //Задание 1: Создание Пустого Множества
        val emptySet : Set<Int>

        //Задание 2: Создание и Инициализация Множества
        val intSet : Set<Int> = setOf(1, 2, 3)

        //Задание 3: Создание Изменяемого Множества
        val strSet : MutableSet<String> = mutableSetOf("みず", "石", "おちゃ")

        //Задание 4: Добавление Элементов в Множество
        strSet.add("すし")
        strSet.add("ごはん")

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
        val setString1 : Set<String> = setOf("кошка", "собака", "попугай")
        val setString2 : Set<String> = setOf("собака", "белка", "попугай")
        val setString3 = mutableSetOf<String>()
            for(word in setString1) {
                setString3.add(word)
            }
            for (word in setString2) {
                setString3.add(word)
            }

        //Задание 9: Нахождение Пересечения Множеств
        val setInt1 = setOf(1, 2, 3, 4, 5)
        val setInt2 = setOf(3, 4, 5, 6, 7)
        val comInt = mutableSetOf<Int>()
        for (e in setInt1){
            for (i in setInt2){
                if (i == e) comInt.add(i)
            }
        }

        //Задание 10: Нахождение Разности Множеств
        val setStrin4 : Set<String> = setOf("кошка","курица", "собака", "попугай")
        val setString5 : Set<String> = setOf("собака", "белка", "попугай")
        val setString6 = mutableSetOf<String>()
        for (word in setStrin4){
            var boolean : Boolean = false
            for (letter in setString5){
                if(letter == word) boolean = true
            }
            if (boolean == false) {
                setString6.add(word)
            }
        }

        //Задание 11: Конвертация Множества в Список
        val setInteger = setOf("a", "b", "c", "d", "e")
        val list = mutableListOf<String>()
        for (letter in setInteger){
            list.add(letter)
        }

    }
