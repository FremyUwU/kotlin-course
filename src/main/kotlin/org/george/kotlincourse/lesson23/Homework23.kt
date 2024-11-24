package org.george.kotlincourse.lesson23

class Homework23 {
    //Напишите функцию analyzeDataType, принимающую параметр типа Any.
    // Функция должна определить тип аргумента и вывести соответствующее сообщение:
    //Для строки: "Это строка: [значение]".
    //Для целого числа: "Это целое число: [значение]".
    //Для списка: "Это список, количество элементов: [количество]".
    //Для карты: "Это карта, количество пар: [количество]".
    //Для остальных типов: "Неизвестный тип данных".
    //Используйте оператор is для проверки типов.
    fun analyzeDataType(arg : Any) {
        when(arg) {
            is String -> println("Это строка: $arg")
            is Int -> println("Это целое число: $arg")
            is List<*> -> println("Это список, количество элементов: ${arg.size}")
            is Map<*,*> -> println("Это карта, количество пар: ${arg.size}")
            else -> println("Неизвестный тип данных")
        }
    }
    //Создайте функцию safeCastToList, принимающую параметр типа Any и возвращающую размер списка,
    // если аргумент можно безопасно привести к типу List.
    // В случае неудачного приведения функция должна возвращать -1.
    //Используйте as? для безопасного приведения типа.
    fun safeCastToList(list: Any) : Int {
        return if(list as? List<*> !=null) list.size
        else -1
    }
    //Создайте функцию getStringLengthOrZero, которая принимает параметр типа Any?
    // и возвращает длину строки, если аргумент можно привести к типу String.
    // В случае, если аргумент равен null или не является строкой, функция должна возвращать 0.
    fun getStringLengthOrZero(str : Any?) : Int {
        return if (str is String) str.length
        else 0
    }
    //Создайте функцию, которая принимает параметр типа Any.
    //Функция гарантированно ожидает число (в виде числа или строки, например 4 или 4.2 или “4.2”) и должна вернуть квадрат этого числа.
    // Если придёт число, его нужно возвести в квадрат, если придёт строка, то его нужно преобразовать в число через функцию toDouble() и возвести в квадрат.
    fun quad(num: Any) : Double {
        if(num is Number) {
            return num.toDouble()* num.toDouble()
        }else{
            val num = (num as String).toDouble()
            return num * num
        }
    }
    //Напишите функцию sumIntOrDoubleValues, которая принимает список элементов типа Any и возвращает сумму
    // всех целочисленных (Int) и вещественных (Double) значений в списке. Все остальные типы должны быть проигнорированы.
    fun sumIntOrDoubleValues(list: List<Any>) : Double {
        var result = 0.0
        for (i in list){
            when (i) {
                is Int -> result += i
                is Double -> result += i
            }
        }
        return result
    }
    //Создайте функцию tryCastToListAndPrint, которая принимает параметр типа Any и пытается привести его к типу List<*>.
    // Если приведение успешно, функция должна напечатать все строки из списка, если элемент не является строкой то
    // вывести предупреждение об этом. Если приведение неудачно, должно быть выведено сообщение об ошибке,
    // не прерывая выполнение программы.
    fun tryCastToListAndPrint(list : Any) {
        if(list as? List<*>!=null){
            list.forEach { if (it is String) println(it) else println("$it is not a string!") }
        }else println("Error : $list cannot be cast to list")
    }
}