package org.george.kotlincourse.lesson12

import kotlin.time.times

class Homework12 {
    fun main(){
    }
    //Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
    fun fun1(){}
    //Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
    fun fun2(a : Int, b : Int) : Int {
        return a+b
    }
    //Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
    fun fun3(s : String){}
    //Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
    fun fun4(list : List<Int>) : Double{
        var sum : Double = 0.0
        for (i in list) {
            sum +=list[i]
        }
        return sum/list.size
    }
    //Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
    fun fun5(str : String?) : Int?{
        return str?.length
    }
    //Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
    fun fun6() : Double?{
        return 0.0
    }
    //Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
    fun fun7(list : List<Int?>){}
    //Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
    fun fun8(int : Int) : String?{
        return int.toString()
    }
    //Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
    fun fun9() : List<String?>{
        return listOf("a","б","в")
    }
    //Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
    fun fun10(str : String?, int : Int?) : Boolean?{
        return false
    }
    //Задача 1:
    //Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
    fun multiplyByTwo(i : Int) : Int {
        return i*2
    }
    //Задача 2:
    //Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
    fun isEven(i : Int) : Boolean {
        return i%2==0
    }
    //Задача 3:
    //Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
    // Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
    fun printNumbersUntil(n : Int) {
        if(n < 1) return
        for (i in 0..n)
            println(i)
    }
    //Задача 4:
    //Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
    fun findFirstNegative(list : List<Int>) : Int? {
        for (i in list){
            if (i < 0) return i
        }
        return null
    }
    //Задача 5:
    //Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
    // Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
    fun processList(list : List<String>) {
        for (str in list){
            if (str == null) return
            println(str)
        }
    }
}