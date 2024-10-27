package org.george.kotlincourse.lesson15.Homework15

class Emotion(
    val type : String,
    var intensity : Int
) {
    fun express() {
        if(type == "anxiety"){
            if(intensity < 1) println("i'm cool as a cucumber")
            else if(intensity < 5) println("i'm feel a bit nervous")
            else if(intensity < 8) println("i'm feel really nervous")
            else println("i'm in panic!")
        }
    }
}
