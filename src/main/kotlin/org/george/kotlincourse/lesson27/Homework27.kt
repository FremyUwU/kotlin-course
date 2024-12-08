package org.george.kotlincourse.lesson27

/*
Создайте функцию timeTracker, которая принимает другую функцию в качестве аргумента и измеряет время её выполнения.
Функция timeTracker должна возвращать затраченное время в миллисекундах. Для измерения времени
используйте System.currentTimeMillis() до и после выполнения переданной функции.
 */


fun timeTracker(func: () -> List<Int>): String {
    val startTime = System.currentTimeMillis()
    val result = func()
    val endTime = System.currentTimeMillis()
    val executionTime = endTime - startTime
    return "Результат работы функции: $result\nВремя выполнения: $executionTime ms\n"
}

fun timeTrackerForSting(func: () -> Unit): String {
    val startTime = System.currentTimeMillis()
    func()
    val endTime = System.currentTimeMillis()
    val executionTime = endTime - startTime
    return "Время выполнения: $executionTime ms"
}

fun main() {
    val myFunction = {
        val list = List(10000000) { (0..10000).random() }
        list.sorted()
    }

    println(timeTracker(myFunction))

    val stringFunc = {
        var s = ""
        for (i in 0..20000) {
            s += "новая запись"
        }
    }

    println(timeTrackerForSting(stringFunc))

    val stringBuilderFunc = {
        val s = StringBuilder()
        for (i in 0..20000) {
            s.append("новая запись")
        }
    }
    println(timeTrackerForSting(stringBuilderFunc))

}