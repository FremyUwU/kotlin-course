package org.george.kotlincourse.lesson15.Homework15

    class Party(var location : String, var attendees : Int) {
        fun details() {
            println("Location: " + location + "number of guests " + attendees)
        }
    }