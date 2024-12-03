package org.george.kotlincourse.lesson25

//Задание 3. Создай функцию, которая принимает список строк и число, а возвращает список из строк,
// длина которых больше или равна заданному числу. Если список пуст, нужно выкинуть исключение.
//По аналогии с предыдущим заданием выполни трансформации и проверки.
fun main() {
    val filterList0 = fun(list: List<String>, i: Int) : List<String> {
        require(list.isNotEmpty()) {"list is empty"}
        return list.filter { it.length >= i }
    }
    val filterList1 : (list:List<String>,i : Int) -> List<String> = {list, i ->
        require(list.isNotEmpty()) {"list is empty"}
        list.filter { it.length >=i }
    }
    val filterList2 = { list : List<String>, i: Int ->
        require(list.isNotEmpty()) {"list is empty"}
        list.filter { it.length>=i }
    }

    val list = listOf("a", "ab", "abc")
    println(filterList(list, 2))
    println(filterList0(list, 2))
    println(filterList1(list, 2))
    println(filterList2(list, 2))
}
fun filterList(list: List<String>, i: Int) : List<String> {
    require(list.isNotEmpty()) {"list is empty"}
    return list.filter { it.length >= i }
}