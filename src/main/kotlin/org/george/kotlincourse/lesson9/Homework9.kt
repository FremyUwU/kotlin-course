package org.george.kotlincourse.lesson9


import java.util.*

class Homework9 {
    fun main() {
        while (true) {

        println("Happy birthday!")
        println("  <3  <3")

        for (i in 4..5) {
            for (j in 5 downTo i + 1) {
                System.out.printf(" ")
            }
            for (j in 1..i) {
                System.out.printf("<3")
            }

            println()
        }

        for (i in 4 downTo 1) {
            for (j in 4 downTo i) {
                System.out.printf(" ")
            }

            for (j in i downTo 1) {
                System.out.printf("<3")
            }

            println()
        }

    }
}
}