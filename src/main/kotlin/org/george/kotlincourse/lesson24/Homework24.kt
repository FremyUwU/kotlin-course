package org.george.kotlincourse.lesson24

class Homework24 {
    fun main() {
        //Задание 1. Воспроизвести фрагменты кода, которые могут привести к возникновению исключений:
        //NullPointerException
        val str: String? = null
        try {
            println(str!!.length)
        }catch (e : NullPointerException){
            e.printStackTrace()
        }

        //ArrayIndexOutOfBoundsException
        val list = listOf(1, 2, 3)
        try{println(list[3])}catch (e:ArrayIndexOutOfBoundsException)
        {e.printStackTrace()}
        //ClassCastException
        try {
            val i : Double = "string" as Double
        }catch (e:ClassCastException){
            e.printStackTrace()
        }
        //NumberFormatException
        try {
            val number = "123a".toInt()
        }catch (e:NumberFormatException){
            e.printStackTrace()
        }
        //IllegalArgumentException
        try {
            validateAge(-1)
        } catch (e: IllegalArgumentException) {
            e.printStackTrace()
            }

        //IllegalStateException
        try {
            val list = mutableListOf(1, 2, 3)
            val iterator = list.iterator()
            iterator.next()
            iterator.remove()
            iterator.remove()
        }catch (e:IllegalStateException){
            e.printStackTrace()
        }
        //OutOfMemoryError
        val list1 = mutableListOf<String>()
        try {
            while (true) {
                list1.add("Memory leak!")
            }
        } catch (e: OutOfMemoryError) {
            e.printStackTrace()
        }
        //StackOverflowError
        try {
            recursion(0)
        }catch (e:StackOverflowError){
            e.printStackTrace()
        }
        //
        //Задание 2. Оберни все вызовы из предыдущего задания в блок try-catch и создай для каждого типа ошибки свой catch блок
        //
        //Задание 3. Оберни все вызовы из предыдущего задания в блок try-catch с одним блоком catch для любого типа исключений. Внутри блока catch,
        // используя when, напиши для каждого исключения вывод в консоль специфического сообщения, подходящего под каждый из типов.
        //
        //Задание 4. Создай свой тип исключения в отдельном файле, наследуемый от AssertionError и принимающий текст. Выброси это исключение в main
        //
        //Задание 5. Создай свой тип исключения в отдельном файле, наследуемый от RuntimeException и принимающий ArrayIndexOutOfBoundsException тип в качестве аргумента. Напиши код, который спровоцирует выброс ArrayIndexOutOfBoundsException, перехвати его с помощью try-catch и в блоке catch выведи сообщение в консоль и сделай выброс своего типа исключения.
    }
    fun validateAge(age: Int) {
        if (age < 0) {
            throw IllegalArgumentException("Age cannot be negative")
        }
    }
    fun recursion(i:Int){
        recursion(i+1)
    }
}
