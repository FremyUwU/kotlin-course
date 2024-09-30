package org.george.kotlincourse.lesson8

class Homework8 {

    //Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
    // делая текст более ироничным или забавным.
    fun ironic(string : String) : String {
        var str : String
        if(string.contains("")){
            str = string.replace("невозможно", "совершенно точно возможно, просто требует времени", ignoreCase = true)
        }
        if(string.startsWith("Я не уверен")){
            str = string.plus(string.trim() + ", но моя интуиция говорит об обратном")
        }
        if(string.contains("катастрофа")){}
            str = string.replace("катастрофа", "интересное событие", ignoreCase = true)
        if(string.startsWith("без проблем")) {
            str = string.replace("без проблем", "с парой интересных вызовов на пути")
        }
        if(string.split(" ").size == 1){
            str = "Иногда, ${string.lowercase()}, но не всегда"
        }

        return str
    }

    //    Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
    fun dateTime(str : String) {
        val dT : String = str.substring(str.indexOf(">") + 2)
        println(dT.substring(0, dT.indexOf(" ")))
        println(dT.substring(dT.indexOf(" ") + 1))
    }
//    Задание 2: Маскирование Личных Данных
    fun hide(str : String) {
        str.replaceRange(0,4, "*")
        str.replaceRange(5, 9, "*")
        str.replaceRange(10, 14, "*")
        println(str)
    }
//    Задание 3: Форматирование Адреса Электронной Почты
    fun mail(str : String) {
        str.replace("@", " [at] ").replace(".", " [dot] ")
        println(str)
    }
//    Задание 4: Извлечение Имени Файла из Пути
    fun fileName(path : String) : String {
        val name : String = path.substring(path.lastIndexOf("/") + 1)
        return name
    }
//    Задание 5: Создание Аббревиатуры из Фразы.
    fun abbreviation(str : String) : String {
        val words = str.split("-", " ")
        var abbr = ""
        for (i in words) {
            if (i.isNotEmpty()) {
                val letter = i.first().uppercase() + i.substring(1).lowercase()
                abbr += "$letter "
            }
        }
        return abbr.trim()
    }
}