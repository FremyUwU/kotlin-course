package org.george.kotlincourse.lesson25

const val ESCOBAR_THEOREM = "При безальтернативном выборе из двух противоположных сущностей обе будут являть собой исключительную ерунду"

    //Задание 1. Создай константу в файле с текстом. Создай функцию, которая ничего не принимает и не возвращает и печатает в консоль текст константы.
    //Создай аналогичную анонимную функцию.
    //Создай аналогичное лямбда выражение с указанием типа.
    //Создай лямбда выражение без указания типа.

    fun main() {
        val print0 = fun(){ println(ESCOBAR_THEOREM) }
        val print1: () -> Unit = {println(ESCOBAR_THEOREM)}
        val print2 = { println(ESCOBAR_THEOREM) }

        print()
        print0()
        print1()
        print2()
    }
    fun print(){
        println(ESCOBAR_THEOREM)
    }
