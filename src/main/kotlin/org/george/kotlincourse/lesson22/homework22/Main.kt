package org.george.kotlincourse.lesson22.homework22


class Main {
    fun main(){
    println("---------- task 1, 2 ----------")
    println(listOf(1).funA())
    println('a'.funB(1, 2, true))
    println(mutableListOf(1, 2).funC(2, 2))
    println(mapOf(1 to 2, 2 to 4).funD(1))
    println(9223372036854775806.funE())

    println("\n---------- task 3 ----------")
    println(Pair(null, 1).revert())
    println(Pair("help", true).revert())

    println("\n---------- task 4 ----------")
    var num = 123
    println(num.within(11.23, 115))
    println(num.toFloat().within(121, 1))

    println("\n---------- task 5 ----------")
    var str = "please"
    str = str.encrypt(1)
    println(str)
    println(str.decrypt(1))
        }
}