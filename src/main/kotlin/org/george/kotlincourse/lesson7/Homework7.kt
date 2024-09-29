package org.george.kotlincourse.lesson7

class Homework7 {
    class Homework7 {
        //Напишите цикл for, который выводит числа от 1 до 5.

        fun first() {
            var numb: Int
            for (numb in 1..5) {
                println(numb)
            }
        }

        //Напишите цикл for, который выводит четные числа от 1 до 10.
        fun second() {
            for (i in 1..10) {
                if (i % 2 == 0)
                    println(i)
            }
        }

        //Обратный Диапазон:
        //Создайте цикл for, который выводит числа от 5 до 1.
        fun third() {
            for (i in 5 downTo 1) {
                println(i)
            }
        }

        //Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
        fun fourth() {
            var f = 2
            for (i in 12 downTo 3) {
                println(i - 2)
            }
        }

        //Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
        fun five() {
            for (count in 1..9 step 2) {
                println(count)
            }
        }

        //Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
        fun six() {
            for (counter in 1..20 step 3) {
                println(counter)
            }
        }


        //Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
        fun seven() {
            for (numb in 1 until 9) {
                println(numb)
            }
        }

        //Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
        fun eight() {
            for (numb in 3 until 15) {
                println(numb)
            }
        }

        //Задания для Цикла while

        //Создайте цикл while, который выводит квадраты чисел от 1 до 5.
        fun nine() {
            var counter = 1
            while (counter++ in 1..5) {
                println(counter * counter)
            }
        }

        //Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
        fun ten() {
            var i = 10
            while (i > 5) {
                i -= 1
                println(i)
            }
        }
    }
}