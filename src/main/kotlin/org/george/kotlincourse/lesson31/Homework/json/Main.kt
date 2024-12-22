package org.george.kotlincourse.lesson31.Homework.json

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import java.io.File

fun main() {
    val backDev = Employee(
        name = "Александр Петров",
        isEmployed = true,
        birthDate = "16-04-1992",
        position = CharacterTypes.JAVA
    )

    val frontDev = Employee(
        name = "Руслан Баширов",
        isEmployed = true,
        birthDate = "13-11-1989",
        position = CharacterTypes.JAVASCRIPT
    )

    val designer = Employee(
        name = "Хидео Кодзима",
        isEmployed = true,
        birthDate = "24-08-1963",
        position = CharacterTypes.UX_UI
    )

    val tester = Employee(
        name = "Александр Василенко",
        isEmployed = true,
        birthDate = "14-10-1900",
        position = CharacterTypes.QA
    )

    val teamLead = Employee(
        name = "Тодд Говард",
        isEmployed = true,
        birthDate = "01-11-1960",
        position = CharacterTypes.TEAM_LEAD,
        subordinates = listOf(backDev, frontDev, designer)
    )
    val Cto = Employee(
        name = "Тодд Говард",
        isEmployed = true,
        birthDate = "06-10-1970",
        position = CharacterTypes.CTO,
        subordinates = listOf(backDev, frontDev, designer, tester, teamLead)
    )

    val gson: Gson = GsonBuilder().setPrettyPrinting().create()

    val json = gson.toJson(cto)
    val file = File("src/main/kotlin/org/george/kotlincourse/lesson31/homework/json/homework.json")
    file.parentFile.mkdirs()
    file.writeText(json)

    println(json)

    val readJson = file.readText()
    val readCto = gson.fromJson(readJson, Employee::class.java)

    println(readCto)

}