package org.george.kotlincourse.lesson31.Homework.json

data class Employee (
    val name: String,
    val isEmployed: Boolean,
    val birthDate: String,
    val position: CharacterTypes,
    val subordinates: List<Employee> = emptyList()
)
