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
}