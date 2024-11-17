package org.george.kotlincourse.lesson22.homework22

import kotlin.random.Random

//Определите функцию-расширение для массива чисел, которая не принимает аргументов и возвращает пару из чисел.
fun List<Int>.funA() : Pair<Int, Int>{
    var a = 0
    var b = 0

    for(i in 0 until 100){
        if(i%2 == 0) a += i
        if(i % 3 ==0) b +=i
    }
    return Pair(a, b)
}